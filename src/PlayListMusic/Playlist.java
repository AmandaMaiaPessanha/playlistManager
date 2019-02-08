package PlayListMusic;

public class Playlist {
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
	}
	
	//INSERÇÃO DA MÚSICA NA PLAYLIST
	public void addMusic(Music music) {
		//VERIFIca SE ESTÁ NO TAMANHO MÁXIMO, SE SIM ADICIONA O MEU ARRAY JÁ EXISTENTE MAIS 1 POSIÇÕES
		if (this.musicCount == this.musics.length) {
			Music[] newMusics = new Music[this.musicCount + 1];
			for (int i = 0; i < this.musics.length; i++) {
				newMusics[i] = this.musics[i];
			}
			this.musics = newMusics;
		}
		
		//ADICIONA NOVA MÚSICA
		this.musics[this.musicCount] = music;
		
		//ADICIONA A DURAÇÃO DA MÚSICA NA PLAYLIST
		this.duration += music.getDuration();
		
		//INCREMENTA OPERADOR ITENSCOUNT
		this.musicCount++;
	}
	
	//INSERÇÃO DE UM VÍDEO NA PLAYLIST
	public void addVideo(Video video) {
		//VERIFICA SE ESTÁ NO TAMANHO MÁXIMO, SE SIM ADICIONA O MEU ARRAY JÁ EXISTENTE MAIS 1 POSIÇÕES
		if (this.videoCount == this.videos.length) {
				Video[] newVideos = new Video[this.videoCount + 1];
				for (int i = 0; i < this.videos.length; i++) {
					newVideos[i] = this.videos[i];
				}
				this.videos = newVideos;
		}
		
		//ADICIONA NOVO VÍDEO
		this.videos[this.videoCount] = video;
		
		//ADICIONA A DURAÇÃO DA MÚSICA NA PLAYLIST
		this.duration += video.getDuration();
				
		//INCREMENTA OPERADOR ITENSCOUNT
		this.videoCount++;
	}
	
	//OBTENÇÃO DA DURAÇÃO DA PLAYLIST
	public int getDuration() {
		return this.duration;
	}

	//ADICIONAR PROGPAGANDAS AO LONGO DO VÍDEO
	public int addPropaganda () {
		
		this.propaganda = 0;
		
		if (this.duration > 10000) {
			//ACIMA DE 10000 VISUALIZAÇÕES, O ACRÉSCIMO É DE 5% NO TEMPO
			this.duration = (this.duration * 5) / 100;
		} else if (this.duration > 1000 && this.duration < 10000) {
			//CASO O VÍDEO TENHA ENTRE 1000 E 10000 VISUALIZAÇÕES, HÁ UM ACRÉSCIMO DE 2% NO TEMPO DE PROPAGANDA
			this.duration = (this.duration * 2) / 100;
		} else {
			//CASO O VÍDEO TENHA MENOS DE 1000 VISUALIZAÇÕES, NÃO HÁ TEMPO EXTRA DE PROPAGANDA 
			this.propaganda = 0;
		}
		
		return this.propaganda;
		
	}	
	
	//TOSTRING NO FORMATO (Xh e Ymin)
	@Override
	public String toString() {
		int horas = this.duration / 60;
		int minutos = this.duration % 60;
		return horas + "h " + minutos + "min";		
	}
}