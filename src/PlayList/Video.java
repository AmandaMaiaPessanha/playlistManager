package PlayList;

class Video extends Entertainment {
	
	//CARACTERISTICAS DA CLASSSE VIDEO
	String subjectMatter;
	int views;
	String channelName;
	
	public Video(int vDuration, String vSubjectMatter, String vTitle, int vViews, String vChannelName) {
		super(vDuration, vTitle);
		this.subjectMatter = vSubjectMatter; this.views = vViews; this.channelName = vChannelName;
	}
	
	public int getDuracao () {
	
		int durationVideo = super.getDuracao();
		if (this.views < 1000)
			return durationVideo;
		else
			if (this.views < 10000)
				return (int) (durationVideo * 1.02);
			else
				return (int) (durationVideo * 1.05);
		}
}