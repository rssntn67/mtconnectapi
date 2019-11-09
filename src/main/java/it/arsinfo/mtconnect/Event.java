package it.arsinfo.mtconnect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Event {
	private final long id;
    private final String content;
    private final String device;
    private final String component; 
    private final String type; 
    private static final Logger log = LoggerFactory.getLogger(Event.class);

    public Event(long id, String device, String component, String type, String content) {
		super();
		this.id = id;
		this.content = content;
		this.device = device;
		this.component = component;
		this.type=type;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", content=" + content + ", device=" + device + ", component=" + component
				+ ", type=" + type + "]";
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
