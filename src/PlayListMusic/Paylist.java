package PlayListMusic;

public class Paylist {
	public String namePlaylist;
	public String musicNameInPlaylist;
	public String[] songsInPlaylist = new String[10];
	private int horas;
	private int minutos;
	
	//Crie uma classe que representará uma playlist. Para tal, esta classe deverá conter
	//um vetor para armazenar suas respectivas músicas. Qualquer detalhe para
	//manipulação deste vetor, como um contador para controlar a quantidade de
	//músicas alocadas, deve ser mantido interno a este classe, ou seja, sem visibilidade
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
		
		totalMusics = //somatório de todas as músicas que estão dentro dessa playlist;
		
		horas = (int)totalMusics / 60;
		minutos = (int)totalMusics % 60;
		
		return durationPlaylist;
	}
	
	public String toString() {
		return horas + "h " + minutos + "min";
		
	}
}
