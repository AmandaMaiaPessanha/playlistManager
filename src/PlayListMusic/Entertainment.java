package PlayListMusic;

public class Entertainment {
	
	//DECLARAÇÃO DAS VARIÁVEIS DE USO COMUM PARA MÚSICA E VÍDEO.
	public String name;
	public int duration;
	public int views;
	
	//CONSTRUTOR DA CLASSE ENTERTAINMENT
	Entertainment (String eName, int eDuration, int eViews) {
		name = eName; duration = eDuration; views = eViews;
	}

	//GET DE NAME
	public String getName() {
		return this.name;
	}
	
	//GET DE DURATION
	public int getDuration() {
		return this.duration;
	}
	
	//GET DE VIEWS
	public int getViews() {
		return this.views;
	}
	
}