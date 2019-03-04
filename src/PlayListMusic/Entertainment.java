package PlayListMusic;

public class Entertainment {
	
	//DECLARA��O DAS VARI�VEIS DE USO COMUM PARA M�SICA E V�DEO.
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