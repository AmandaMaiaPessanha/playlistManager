package PlayListMusic;

public class Main {

	public static void main(String[] args) {
	
		//DECLARA UMA LISTA SERÁ USADA PARA O CONSTRUTOR MUSIC
		Music[] musics = new Music[3];
		
		//DECLARA UMA LISTA SERÁ USADA PARA O CONSTRUTOR VIDEO
		Video[] videos = new Video[2];
		
		//DECLARA A VARIÁVEL E ATRIBÚI A ELA O CONSTRUTOR PLAYLIST
		Playlist playlist1 = new Playlist();
			
		//ATRIBUI OS NOVOS OBJETOS MUSIC NAS SUAS RESPECTIVAS VARIÁVEIS
		musics[0] = new Music("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140, 0);
		musics[1] = new Music ("O mar serenou", "Candeia", "Clara Nunes", 179, 0);
		musics[2] = new Music ("Rapaz Folgado", "Noel Rosa", "Martinho da vila e Mart'nália", 180, 0);
		
		//ATRIBUI OS NOVOS OBJETOS VIDEO NAS SUAS RESPECTIVASA VARIÁVEIS
		videos[0] = new Video ( "Musica", "Despacito", "Luis Fonsi", 5926796, 280);
		videos[1] = new Video ("Musica", "Gangnam Style", "Officialpsy", 3276192, 252);
				
		System.out.println("===================================================");
		System.out.println("As músicas adicionadas foram: ");
		
		//FOR PARA PERCORRER O ARRAY TOTAL, PRINTAR E ADICIONAR AS MÚSICAS NA PLAYLIST
		for (int i = 0; i < 3; i++) {
			//PRINTA NA TELA AS INFORMÇÕES SOBRE CADA MÚSICA ADICIONADA
			System.out.println(musics[i].toString());
			//ADICIONA AS MÚSICAS A PLAYLIST UM A UM
			playlist1.addEntertainment(musics[i]);
		}
		
		//PRINTA NA TELA O TEMPO DE DURAÇÃO DA PLAYLIST COM APENAS AS MÚSICAS
		System.out.println("===================================================");		
		System.out.println("Duração da playlist com as músicas: " + playlist1.toString());
		
		System.out.println("===================================================");
		System.out.println("Os vídeos adicionados foram: ");
		
		//FOR PARA PERCORRER O ARRAY TOTAL, PRINTAR E ADICIONAR OS VÍDEOS NA PLAYLIST
		for (int i = 0; i < 2; i++) {
			//PRINTA NA TELA AS INFORMÇÕES SOBRE CADA VÍDEO ADICIONADO
			System.out.println(videos[i].toString());
			//ADICIONA AS VÍDEOS A PLAYLIST UM A UM
			playlist1.addEntertainment(videos[i]);
		}
		
		//PRINTA NA TELA O TEMPO DE DURAÇÃO DA PLAYLIST COMPLETA
		System.out.println("===================================================");		
		System.out.print("Duração da playlist com as músicas e os vídeos, lembrando que os vídeos podem conter ou não propaganadas: ");

		//PRINTA NA TELA O TEMPO DE DURAÇÃO DA PLAYLIST
		System.out.println(playlist1.toString());
	}
}