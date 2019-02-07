package PlayListMusic;

public class Playlist {
	Music[] musics;
	int musicCount;
	int duration;
	
	Playlist (){	
		this.musics = new Music[1];
		this.musicCount = 0;
		this.duration = 0;
	}
	
	//INSER��O DA M�SICA NA PLAYLIST
	public void addMusic(Music music) {
		//verifiquei se estava no tamanho m�ximo, se sim adicionei o meu array j� existe mais 5 posi��es
		if (this.musicCount == this.musics.length) {
			Music[] newMusics = new Music[this.musicCount + 1];
			for (int i = 0; i < this.musics.length; i++) {
				newMusics[i] = this.musics[i];
			}
			this.musics = newMusics;
		}
		//adicionar nova m�sica
		this.musics[this.musicCount] = music;
		
		//adicionar a dura��o da m�sica na playlist
		this.duration += music.durationInMinutes;
		
		//incrementar operador musicCount
		this.musicCount++;
	}
	
	//OBTEN��O DA DURA��O DA PLAYLIST
	public int getDuration() {
		return this.duration;
	}
	
	//TOSTRING NO FORMATO (Xh e Ymin)
	@Override
	public String toString() {
		int horas = this.duration / 60;
		int minutos = this.duration % 60;
		return horas + "h " + minutos + "min";		
	}
}
