package PlayListMusic;

public class Playlist {
	
	//CARACTERISTICAS DA CLASSSE PLAYLIST
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

	//INSERCAO DE UM ENTRETERIMENTO NA PLAYLIST, QUE PODE SER MUSICA OU VIDEO
	public void addEntertainment (Entertainment entertainment) {
		
		//VERIFICA SE ESTA NO TAMANHO MAXIMO, SE SIM ADICIONA O MEU ARRAY QUE JA EXISTENTE MAIS 1 POSICAO
		if (this.entertainmentCount == this.entertainment.length) {
			Entertainment[] newEntertainment = new Entertainment[this.entertainmentCount + 1];
			for (int i = 0; i < this.entertainment.length; i++) {
				newEntertainment[i] = this.entertainment[i];
			}
			this.entertainment = newEntertainment;
		}
		
		//ADICIONA UM NOVO ENTRETERIMENTO
		this.entertainment[this.entertainmentCount] = entertainment;
		
		//ADICIONA A DURAÇÃO DO ENTRETERIMENTO NA PLAYLIST
		this.duration += entertainment.getDuration();
		
		//INCREMENTA OPERADOR ENTERTAINMENTCOUNT
		this.entertainmentCount++;
				
		//OBTEM O NUMERO DE VISUALIZACOES
		this.advertising = (entertainment as Video).getViews();
		
		//QUANDO RECEBER UM VIDEO IRA REALIZAR A LOGICA DE ADICAO DE PROPAGANDA
		if (this.advertising >= 10000) {
			//ACIMA DE 10000 VISUALIZACOES, O ACRESCIMO E DE 5% NO TEMPO
			this.addAdvertising = (this.duration * 5) / 100;
			this.duration = this.duration + this.addAdvertising;
		} else if (this.advertising >= 1000 && this.advertising <= 10000) {
			//CASO O VIDEO TENHA ENTRE 1000 E 10000 VISUALIZACOES, HA UM ACRESCIMO DE 2% NO TEMPO DE PROPAGANDA
			this.addAdvertising = (this.duration * 2) / 100;
			this.duration = this.duration + this.addAdvertising;
		} else if (this.advertising < 1000) {
			//CASO O VIDEO TENHA MENOS DE 1000 VISUALIZACOES, NAO HA TEMPO EXTRA DE PROPAGANDA 
			this.addAdvertising = 0;
		}
			
	}

	//TOSTRING NO FORMATO (Xh e Ymin)
	@Override
	public String toString() {
		int horas = this.duration / 60;
		int minutos = this.duration % 60;
		return horas + "h " + minutos + "min";		
	}
}
