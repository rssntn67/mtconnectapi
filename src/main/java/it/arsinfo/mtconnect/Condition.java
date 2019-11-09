package it.arsinfo.mtconnect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Condition {
	private final long id;
    private final String content;
    private final String device;
    private final String component; 
    private final String type; 
    private final String name; 
    private static final Logger log = LoggerFactory.getLogger(Condition.class);

    public Condition(long id, String device, String component, String name, String type, String content) {
		super();
		this.id = id;
		this.content = content;
		this.device = device;
		this.component = component;
		this.type=type;
		this.name=name;
	}



	@Override
	public String toString() {
		return "Condition [id=" + id + ", content=" + content + ", device=" + device + ", component=" + component
				+ ", type=" + type + ", name=" + name + "]";
	}



	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getDevice() {
		return device;
	}

	public String getComponent() {
		return component;
	}

	public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public void log() {
    	log.info(this.toString());
    }

}
