package PlayListMusic;

public class Video extends Paylist{
	String videoTitle;
	String subjectVideo;
	String channelName;
	int numberViews;
	int videoDuration;
	float propaganda;
	//t�tulo do v�deo, assunto, nome do canal, n�mero de visualiza��es e dura��o do v�deo.
	
	
	public void additionOfAdvertisement (int duration){
		if ((duration > 1000) && (duration < 10000)) {
			//h� um acr�scimo de 2% no tempo de propaganda			
		} else if (duration > 10000){
			//acr�scimo � de 5% no tempo
		} 
		else {
			//sem adi��o de propagana pois o video tem menos de 1000 visualiza��es
		}
	}
	

}
