package PlayListMusic;

public class Entertainment {
	
	//DECLARAÇÃO DAS VARIÁVEIS DE USO COMUM PARA MÚSICA E VÍDEO.
	protected static Entertainment name;
	protected static Entertainment duration;
	
	Entertainment (Entertainment eName, Entertainment eDuration) {
		name = eName; duration = eDuration;
	}
	
	public Entertainment getName() {
		return name;
	}
	
	public Entertainment getDuration() {
		return duration;
	}
	
	@Override
	public String toString() {
		return "Entertainment name=" + name + ", duration=" + duration + "]";
	}
}