package PlayListMusic;

public class Playlist {
	//CARACTERÍSTICAS DA CLASSSE PLAYLIST
	Entertainment[] entertainment;
	int entertainmentCount;
	int duration;
	int advertising;
	int addAdvertising;
	
	//CONSTRUTOR DA CLASSE PLAYLIST
	Playlist (){
		this.entertainment = new Entertainment[1];
		this.entertainmentCount = 0;
		this.duration = 0;
		this.advertising = 0;
		this.addAdvertising = 0;
	}

	//INSERÇÃO DE UM ENTRETERIMENTO NA PLAYLIST
	public void addEntertainment (Entertainment entertainment) {
		
		//VERIFICA SE ESTÁ NO TAMANHO MÁXIMO, SE SIM ADICIONA O MEU ARRAY QUE JÁ EXISTENTE MAIS 1 POSIÇÃO
		if (this.entertainmentCount == this.entertainment.length) {
			Entertainment[] newEntertainment = new Entertainment[this.entertainmentCount + 1];
			for (int i = 0; i < this.entertainment.length; i++) {
				newEntertainment[i] = this.entertainment[i];
			}
			this.entertainment = newEntertainment;
		}
		
		//ADICIONA NOVO ENTRETERIMENTO
		this.entertainment[this.entertainmentCount] = entertainment;
		
		//ADICIONA A DURAÇÃO DO ENTRETERIMENTO NA PLAYLIST
		this.duration += entertainment.getDuration();
		
		//INCREMENTA OPERADOR ENTERTAINMENTCOUNT
		this.entertainmentCount++;
				
		//OBTÉM O NÚMERO DE VISUALIZAÇÕES
		this.advertising = entertainment.views;
		
		//QUANDO RECEBER UM VIDEO IRÁ REALIZAR A LÓGICA DE ADIÇÃO DE PROPAGANDA
		if (this.advertising >= 10000) {
			//ACIMA DE 10000 VISUALIZAÇÕES, O ACRÉSCIMO É DE 5% NO TEMPO
			this.addAdvertising = (this.duration * 5) / 100;
			this.duration = this.duration + this.addAdvertising;
		} else if (this.advertising >= 1000 && this.advertising <= 10000) {
			//CASO O VÍDEO TENHA ENTRE 1000 E 10000 VISUALIZAÇÕES, HÁ UM ACRÉSCIMO DE 2% NO TEMPO DE PROPAGANDA
			this.addAdvertising = (this.duration * 2) / 100;
			this.duration = this.duration + this.addAdvertising;
		} else if (this.advertising < 1000) {
			//CASO O VÍDEO TENHA MENOS DE 1000 VISUALIZAÇÕES, NÃO HÁ TEMPO EXTRA DE PROPAGANDA 
			this.addAdvertising = 0;
		}
			
	}
	
	//OBTÉM A DURAÇÃO DA PLAYLIST
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
