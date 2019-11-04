package it.arsinfo.mtconnect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import it.arsinfo.mtconnect.streams.MTConnectStreamsType;

@SpringBootApplication
public class ConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			MTConnectStreamsType quote = restTemplate.getForObject(
					"https://smstestbed.nist.gov/vds/current", MTConnectStreamsType.class);
			log.info("headerVersion: {}",quote.getHeader().getVersion());
			log.info("headerVersionId: {}",quote.getHeader().getInstanceId());
			quote.getStreams().getDeviceStream().forEach( devStream -> {
				log.info("{} {}", devStream.getName(), devStream.getUuid());
				devStream.getComponentStream().forEach(cs -> {
					log.info("{} {}: {} {} {} ", 
							devStream.getName(), 
							devStream.getUuid(), 
							cs.getName(), 
							cs.getUuid(),
							cs.getComponent());
				});
			});
		};
	}
}
