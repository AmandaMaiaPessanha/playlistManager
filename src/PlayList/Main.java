package PlayList;

public class Main {

	public static void main(String[] args) {
	
		//DECLARA UMA LISTA SERA USADA PARA O CONSTRUTOR MUSIC
		//Music[] musics = new Music[3];
		
		//DECLARA UMA LISTA SERA USADA PARA O CONSTRUTOR VIDEO
		//Video[] videos = new Video[2];
		
		//DECLARA A VARIAVEL E ATRIBUI A ELA O CONSTRUTOR PLAYLIST
		//Playlist playlist1 = new Playlist();
			
		//ATRIBUI OS NOVOS OBJETOS MUSIC NAS SUAS RESPECTIVAS VARIAVEIS
		//musics[0] = new Music("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140, 0);
		//musics[1] = new Music ("O mar serenou", "Candeia", "Clara Nunes", 179, 0);
		//musics[2] = new Music ("Rapaz Folgado", "Noel Rosa", "Martinho da vila e Mart'nália", 180, 0);
		
		//ATRIBUI OS NOVOS OBJETOS VIDEO NAS SUAS RESPECTIVASA VARIAVEIS
		//videos[0] = new Video ( "Musica", "Despacito", "Luis Fonsi", 5926796, 280);
		//videos[1] = new Video ("Musica", "Gangnam Style", "Officialpsy", 3276192, 252);
		
		//FOR PARA PERCORRER O ARRAY TOTAL, PRINTAR E ADICIONAR AS MUSICAS NA PLAYLIST
		//for (int i = 0; i < musics.length; i++) {
			//PRINTA NA TELA AS INFORMACOES SOBRE CADA MUSICA ADICIONADA
		//	System.out.println(musics[i].toString());
			//ADICIONA AS MUSICAS A PLAYLIST UM A UM
		//	playlist1.addEntertainment(musics[i]);
		//}
		
		//LABEL PARA AUXILIAR NO QUE ESTA SENDO PRINTADO NA TELA
		//System.out.println("===================================================");
		//System.out.println("Os videos adicionados foram: ");
		
		//FOR PARA PERCORRER O ARRAY TOTAL, PRINTAR E ADICIONAR OS VIDEOS NA PLAYLIST
		//for (int i = 0; i < videos.length; i++) {
			//PRINTA NA TELA AS INFORMACOES SOBRE CADA VIDEO ADICIONADO
		//System.out.println(videos[i].toString());
			//ADICIONA OS VIDEOS A PLAYLIST UM A UM
		//playlist1.addEntertainment(videos[i]);
		//}
		
		
				Music aguadebeber = new Music(140, "Agua de beber", "Astrud Gilberto", "Antonio Carlos Jobim");
				Music omarserenou = new Music(179, "O mar serenou", "Clara Nunes", "Candeia");
				Music rapazfolgado = new Music(180, "Rapaz Folgado", "Martinho da Vila e Mart'nália", "Noel Rosa");
				
				Video despacito = new Video(280, "Musica", "Despacito", 5926796, "Luis Fonsi");
				Video gangnam = new Video(252, "Musica", "PSY - GANGNAM STYLE", 3276192, "officialpsy");
				
				Playlist antigas = new Playlist();
				
				antigas.addEntertainment(aguadebeber);
				antigas.addEntertainment(omarserenou);
				antigas.addEntertainment(rapazfolgado);
				antigas.addEntertainment(despacito);
				antigas.addEntertainment(gangnam);
				
				
				//LABEL PARA AUXILIAR NO QUE ESTÁ SENDO PRINTADO NA TELA
				System.out.println("===================================================");		
				System.out.print("Duracao da playlist com as musicas e os videos, lembrando que os videos podem conter ou nao propaganadas: ");

				//PRINTA NA TELA O TEMPO DE DURACAO DA PLAYLIST
				System.out.println(antigas.toString());
	}
}