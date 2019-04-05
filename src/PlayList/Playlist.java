package PlayList;

class Playlist {
	
	//CARACTERISTICAS DA CLASSSE PLAYLIST
	Entertainment [] entertainment;
	private int entertainmentCount;
	
	//CONSTRUTOR DA CLASSE PLAYLIST
	public Playlist() {
		entertainment = new Entertainment[1000];
		entertainmentCount = 0;
	}
	
	//INSERCAO DE UM ENTRETERIMENTO NA PLAYLIST, QUE PODE SER MUSICA OU VIDEO
	public void addEntertainment (Entertainment media) {
		entertainment[entertainmentCount] = media;
		entertainmentCount++;
	}
	
	//PERCORRE O ARRAY E SOMA AS DURACOES DOS VIDEOS
	public int getDuracao() {
		int total = 0;
		for (int i = 0; i < entertainmentCount; i++)
			total += entertainment[i].getDuracao();
		return total;
	}
	
	//TOSTRING NO FORMATO (Xh e Ymin)
	public String toString() {
		int total = this.getDuracao();
		return (total / 60) + "h e " + (total % 60) + "min";
	}
}



	