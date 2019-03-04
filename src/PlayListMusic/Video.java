package PlayListMusic;

public class Video extends Entertainment {
	//CARACTERÍSTICAS DA CLASSSE VIDEO
	private String subjectMatter;
	private String channelName;
	private int numberOfViews;
	
	
	//CONSTRUTOR DA CLASSE VIDEO
	public Video ( String vSubjectMatter, String vTitle, String vChannelName, int vNumberOfViews, int vDuration) {
		super(vTitle, vDuration);
		subjectMatter = vSubjectMatter; name = vTitle; channelName = vChannelName; numberOfViews = vNumberOfViews; duration = vDuration;
	}
	
	//GET DE TITLE
	public String getTitle() {
		return this.name;
	}
	
	//GET DE SUBJECT MATTER
	public String getSubjectMatter() {
		return this.subjectMatter;
	}
	
	//GET DE CHANNEL NAME
	public String getChannelName() {
		return this.channelName;
	}

	//GET DE NUMBER OF VIEWS
	public int getNumberOfViews() {
		return this.numberOfViews;
	}

	//GET DE DURATION
	public int getDuration() {
		return this.duration;
	}

	@Override
	public String toString() {
		return "Video inserido contém: " + "title = " + this.name + ", subjectMatter = " + this.subjectMatter + ", channelName = " + this.channelName + ", numberOfViews = " + this.numberOfViews + ", duration = " + this.duration;
	}
	

}