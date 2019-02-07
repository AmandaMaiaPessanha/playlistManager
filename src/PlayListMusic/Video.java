package PlayListMusic;

public class Video extends Paylist{
	String videoTitle;
	String subjectVideo;
	String channelName;
	int numberViews;
	int videoDuration;
	float propaganda;
	//título do vídeo, assunto, nome do canal, número de visualizações e duração do vídeo.
	
	
	public void additionOfAdvertisement (int duration){
		if ((duration > 1000) && (duration < 10000)) {
			//há um acréscimo de 2% no tempo de propaganda			
		} else if (duration > 10000){
			//acréscimo é de 5% no tempo
		} 
		else {
			//sem adição de propagana pois o video tem menos de 1000 visualizações
		}
	}
	

}
