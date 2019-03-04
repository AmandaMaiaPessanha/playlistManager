package PlayListMusic;

public class Entertainment {
	
	//DECLARAÇÃO DAS VARIÁVEIS DE USO COMUM PARA MÚSICA E VÍDEO, TAMBÉM UM VARIÁVEL PARA INDICAR COM O TYPE DO QUE SERÁ INSERIDO.
	public String name;
	public int duration;
	
	Entertainment (String eName, int eDuration) {
		name = eName; duration = eDuration;
	}

	public String getName() {
		return this.name;
	}
	
	public int getDuration() {
		return this.duration;
	}
}