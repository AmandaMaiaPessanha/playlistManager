package PlayListMusic;

public class Video extends Entertainment {
	//CARACTERÍSTICAS DA CLASSSE VIDEO
	//private String title;
	Entertainment[] entertainment;
	private String subjectMatter;
	private String channelName;
	private int numberOfViews;
	//private int duration;
	
	
	//CONSTRUTOR DA CLASSE VIDEO
	Video (Entertainment name, String vSubjectMatter, String vChannelName, int vNumberOfViews, Entertainment duration) {
		super(name, duration);
		subjectMatter = vSubjectMatter; channelName = vChannelName; numberOfViews = vNumberOfViews;
	}
	
	//GET DE SUBJECT MATTER
	public String getSubjectMatter() {
		return subjectMatter;
	}
	
	//GET DE TITLE
	//public String getTitle() {
	//	return title;
	//}

	//GET DE CHANNEL NAME
	public String getChannelName() {
		return channelName;
	}

	//GET DE NUMBER OF VIEWS
	public int getNumberOfViews() {
		return numberOfViews;
	}

	//GET DE DURATION
	//public int getDuration() {
	//	return duration;
	//	}

	@Override
	public String toString() {
		return "Video inserido contém: subjectMatter = " + subjectMatter + ", channelName = " + channelName + ", numberOfViews = " + numberOfViews;
	}
	

}