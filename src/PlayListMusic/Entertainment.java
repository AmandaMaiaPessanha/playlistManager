package PlayListMusic;

public class Entertainment {
	
	//DECLARA��O DAS VARI�VEIS DE USO COMUM PARA M�SICA E V�DEO, TAMB�M UM VARI�VEL PARA INDICAR COM O TYPE DO QUE SER� INSERIDO.
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