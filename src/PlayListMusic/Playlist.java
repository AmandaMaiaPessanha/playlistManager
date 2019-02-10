package PlayListMusic;

public class Playlist {
	//CARACTER�STICAS DA CLASSSE PLAYLIST
	Music[] musics;
	Video[] videos;
	int musicCount;
	int videoCount;
	int duration;
	int propaganda;
	
	//CONSTRUTOR DA CLASSE PLAYLIST
	Playlist (){	
		this.musics = new Music[1];
		this.videos = new Video[1];
		this.musicCount = 0;
		this.videoCount = 0;
		this.duration = 0;
		this.propaganda = 0;
	}
	
	//INSER��O DA M�SICA NA PLAYLIST
	public void addMusic(Music music) {
		//VERIFIca SE EST� NO TAMANHO M�XIMO, SE SIM ADICIONA O MEU ARRAY J� EXISTENTE MAIS 1 POSI��ES
		if (this.musicCount == this.musics.length) {
			Music[] newMusics = new Music[this.musicCount + 1];
			for (int i = 0; i < this.musics.length; i++) {
				newMusics[i] = this.musics[i];
			}
			this.musics = newMusics;
		}
		
		//ADICIONA NOVA M�SICA
		this.musics[this.musicCount] = music;
		
		//ADICIONA A DURA��O DA M�SICA NA PLAYLIST
		this.duration += music.getDuration();
		
		//INCREMENTA OPERADOR MUSICCOUNT
		this.musicCount++;
	}
	
	//INSER��O DE UM V�DEO NA PLAYLIST
	public void addVideo(Video video) {
		//VERIFICA SE EST� NO TAMANHO M�XIMO, SE SIM ADICIONA O MEU ARRAY J� EXISTENTE MAIS 1 POSI��ES
		if (this.videoCount == this.videos.length) {
				Video[] newVideos = new Video[this.videoCount + 1];
				for (int i = 0; i < this.videos.length; i++) {
					newVideos[i] = this.videos[i];
				}
				this.videos = newVideos;
		}
		
		//ADICIONA NOVO V�DEO
		this.videos[this.videoCount] = video;
		
		//ADICIONA A DURA��O DA M�SICA NA PLAYLIST
		this.duration += video.getDuration();
		
		//QUANDO RECEBER UM VIDEO IR� REALIZAR A L�GICA DE ADI��O DE PROPAGANDA
		if (this.duration > 10000) {
			//ACIMA DE 10000 VISUALIZA��ES, O ACR�SCIMO � DE 5% NO TEMPO
			this.propaganda = (this.duration * 5) / 100;
			this.duration = this.duration + this.propaganda;
		} else if (this.duration > 1000 && this.duration < 10000) {
			//CASO O V�DEO TENHA ENTRE 1000 E 10000 VISUALIZA��ES, H� UM ACR�SCIMO DE 2% NO TEMPO DE PROPAGANDA
			this.propaganda = (this.duration * 2) / 100;
			this.duration = this.duration + this.propaganda;
		} else {
			//CASO O V�DEO TENHA MENOS DE 1000 VISUALIZA��ES, N�O H� TEMPO EXTRA DE PROPAGANDA 
			this.propaganda = 0;
		}
		
		//INCREMENTA OPERADOR VIDEOCOUNT
		this.videoCount++;
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