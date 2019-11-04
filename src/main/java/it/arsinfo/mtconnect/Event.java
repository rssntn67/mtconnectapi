package it.arsinfo.mtconnect;

public class Event {
	private final long id;
    private final String content;
    private final String device;
    private final String component; 
    private final String type; 

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
}
