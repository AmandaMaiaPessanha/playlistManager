package PlayListMusic;

public class Entertainment {
	
	//DECLARAÇÃO DAS VARIÁVEIS DE USO COMUM PARA MÚSICA E VÍDEO.
	public String name;
	public int duration;
	public int views;
	
	Entertainment (String eName, int eDuration, int eViews) {
		name = eName; duration = eDuration; views = eViews;
	}

	public String getName() {
		return this.name;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public int getViews() {
		return this.views;
	}
	
}