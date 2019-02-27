package PlayListMusic;

public class Playlist  {
	//CARACTERÍSTICAS DA CLASSSE PLAYLIST
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
	
	//INSERÇÃO DE UMA MÚSICA NA PLAYLIST
	public void addMusic(Music music) {
		//VERIFICA SE ESTÁ NO TAMANHO MÁXIMO, SE SIM ADICIONA O MEU ARRAY QUE JÁ EXISTENTE MAIS 1 POSIÇÃO
		if (this.musicCount == this.musics.length) {
			Music[] newMusics = new Music[this.musicCount + 1];
			for (int i = 0; i < this.musics.length; i++) {
				newMusics[i] = this.musics[i];
			}
			this.musics = newMusics;
		}
		
		//ADICIONA NOVA MÃšSICA
		this.musics[this.musicCount] = music;
		
		//ADICIONA A DURAÃ‡ÃƒO DA MÃšSICA NA PLAYLIST
		this.duration += music.getDuration();
		
		//INCREMENTA OPERADOR MUSICCOUNT
		this.musicCount++;
	}
	
	//INSERÇÃO DE UM VÍDEO NA PLAYLIST
	public void addVideo(Video video) {
		//VERIFICA SE ESTÁ NO TAMANHO MÁXIMO, SE SIM ADICIONA O MEU ARRAY QUE JÁ EXISTENTE MAIS 1 POSIÇÃO
		if (this.videoCount == this.videos.length) {
				Video[] newVideos = new Video[this.videoCount + 1];
				for (int i = 0; i < this.videos.length; i++) {
					newVideos[i] = this.videos[i];
				}
				this.videos = newVideos;
		}
		
		//ADICIONA NOVO VÃ�DEO
		this.videos[this.videoCount] = video;
		
		//ADICIONA A DURAÃ‡ÃƒO DA MÃšSICA NA PLAYLIST
		this.duration += video.getDuration();
		
		//QUANDO RECEBER UM VIDEO IRÁ REALIZAR A LÓGICA DE ADIÇÃO DE PROPAGANDA
		if (this.duration >= 10000) {
			//ACIMA DE 10000 VISUALIZAÇÕES, O ACRÉSCIMO É DE 5% NO TEMPO
			this.propaganda = (this.duration * 5) / 100;
			this.duration = this.duration + this.propaganda;
		} else if (this.duration >= 1000 && this.duration <= 10000) {
			//CASO O VÍDEO TENHA ENTRE 1000 E 10000 VISUALIZAÇÕES, HÁ UM ACRÉSCIMO DE 2% NO TEMPO DE PROPAGANDA
			this.propaganda = (this.duration * 2) / 100;
			this.duration = this.duration + this.propaganda;
		} else if (this.duration < 1000) {
			//CASO O VÍDEO TENHA MENOS DE 1000 VISUALIZAÇÕES, NÃO HÁ TEMPO EXTRA DE PROPAGANDA 
			this.propaganda = 0;
		}
		
		//INCREMENTA OPERADOR VIDEOCOUNT
		this.videoCount++;
	}
	
	//OBTENÃ‡ÃƒO DA DURAÃ‡ÃƒO DA PLAYLIST
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
