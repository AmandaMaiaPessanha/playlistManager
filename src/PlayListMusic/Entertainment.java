package PlayListMusic;

public class Entertainment {
	
	//DECLARACAO DAS VARIAVEIS DE USO COMUM PARA MUSICA E VIDEO.
	public String name;
	public int duration;
	
	//CONSTRUTOR DA CLASSE ENTERTAINMENT
	Entertainment (String eName, int eDuration) {
		name = eName; duration = eDuration;
	}

	//GET DE NAME
	public String getName() {
		return this.name;
	}
	
	//GET DE DURATION
	public int getDuration() {
		return this.duration;
	}
}
