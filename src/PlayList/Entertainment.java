package PlayList;

class Entertainment {
	
	//CARACTERISTICAS COMUNS DA CLASSSE MUSIC E VIDEO
	private int duration;
	String name;
	
	//CONSTRUTOR DA CLASSE ENTERTAINMENT
	public Entertainment (int eDuration, String eName) {
		this.duration = eDuration; this.name = eName;
	}
	
	//GET DE DURATION
	public int getDuracao () {
		return this.duration;
	}
}