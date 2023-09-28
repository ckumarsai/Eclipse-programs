public class Categories {
	String type;
	String description;
	int time;
	String channel;
	int views;
	public Categories(String type, String description, int time, String channel, int views) {
		super();
		this.type = type;
		this.description = description;
		this.time = time;
		this.channel = channel;
		this.views = views;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	@Override
	public String toString() {
		return "type=" + type + ", description=" + description + ", time=" + time + ", channel=" + channel
				+ ", views=" + views ;
	}
}