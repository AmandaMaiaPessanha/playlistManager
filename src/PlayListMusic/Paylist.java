package PlayListMusic;

public class Paylist {
	public String namePlaylist;
	public String musicNameInPlaylist;
	public String[] songsInPlaylist = new String[10];
	private int horas;
	private int minutos;
	
	//Crie uma classe que representar� uma playlist. Para tal, esta classe dever� conter
	//um vetor para armazenar suas respectivas m�sicas. Qualquer detalhe para
	//manipula��o deste vetor, como um contador para controlar a quantidade de
	//m�sicas alocadas, deve ser mantido interno a este classe, ou seja, sem visibilidade
	//do mundo externo (outras classes).
	
	public void musicInsert(String musicNameInPlaylist){
		int index = 0;
		if (index < (songsInPlaylist.length)) {
			for (int i = 0; i < this.songsInPlaylist.length; i++) {
				if (this.songsInPlaylist[i] != null) {
					index += 1;
				}
			}
			this.songsInPlaylist[index] = musicNameInPlaylist;
		}
	}
	
	float totalDurationOfSongs() {
		float durationPlaylist = 0;
		float totalMusics = 0; 
		
		totalMusics = //somat�rio de todas as m�sicas que est�o dentro dessa playlist;
		
		horas = (int)totalMusics / 60;
		minutos = (int)totalMusics % 60;
		
		return durationPlaylist;
	}
	
	public String toString() {
		return horas + "h " + minutos + "min";
		
	}
}
