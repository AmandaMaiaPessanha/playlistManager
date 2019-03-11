package PlayListMusic;

public class Video extends Entertainment {
	
	//CARACTERISTICAS DA CLASSSE VIDEO
	public String subjectMatter;
	public String channelName;
	public int views;
	
	
	//CONSTRUTOR DA CLASSE VIDEO
	public Video ( String vSubjectMatter, String vTitle, String vChannelName, int vViews, int vDuration) {
		super(vTitle, vDuration);
		subjectMatter = vSubjectMatter; name = vTitle; channelName = vChannelName; views = vViews; duration = vDuration;
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
	public int getViews() {
		return this.views;
	}

	//GET DE DURATION
	public int getDuration() {
		return this.duration;
	}

	@Override
	public String toString() {
		return "Video inserido contém: " + "title = " + this.name + ", subjectMatter = " + this.subjectMatter + ", channelName = " + this.channelName + ", numberOfViews = " + this.views + ", duration = " + this.duration;
	}
	

}
