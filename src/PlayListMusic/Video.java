package PlayListMusic;

public class Video {
	//CARACTERÍSTICAS DA CLASSSE VIDEO
	private String subjectMatter;
	private String title;	
	private String channelName;
	private int numberOfViews;
	private int duration;
	
	//CONSTRUTOR DA CLASSE VIDEO
	Video ( String vSubjectMatter, String vTitle, String vChannelName, int vNumberOfViews, int vDuration) {
		subjectMatter = vSubjectMatter; title = vTitle; channelName = vChannelName; numberOfViews = vNumberOfViews; duration = vDuration;
	}
	
	//GET DE SUBJECT MATTER
	public String getSubjectMatter() {
		return subjectMatter;
	}
	
	//GET DE TITLE
	public String getTitle() {
		return title;
	}

	//GET DE CHANNEL NAME
	public String getChannelName() {
		return channelName;
	}

	//GET DE NUMBER OF VIEWS
	public int getNumberOfViews() {
		return numberOfViews;
	}

	//GET DE DURATION
	public int getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "Video title = " + title + ", subjectMatter = " + subjectMatter + ", channelName = " + channelName + ", numberOfViews = " + numberOfViews + ", duration = " + duration;
	}
	

}