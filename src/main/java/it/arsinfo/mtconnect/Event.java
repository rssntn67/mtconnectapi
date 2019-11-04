package it.arsinfo.mtconnect;

public class Event {
	private final long id;
    private final String content;
    private final String device;
    private final String component; 

    public Event(long id, String device, String component, String content) {
		super();
		this.id = id;
		this.content = content;
		this.device = device;
		this.component = component;
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
