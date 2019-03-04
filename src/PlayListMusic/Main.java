package PlayListMusic;

public class Main {

	public static void main(String[] args) {
	
		//DECLARA UMA LISTA SER� USADA PARA O CONSTRUTOR MUSIC
		Music[] musics = new Music[3];
		
		//DECLARA UMA LISTA SER� USADA PARA O CONSTRUTOR VIDEO
		Video[] videos = new Video[2];
		
		//DECLARA A VARI�VEL E ATRIB�I A ELA O CONSTRUTOR PLAYLIST
		Playlist playlist1 = new Playlist();
			
		//ATRIBUI OS NOVOS OBJETOS MUSIC NAS SUAS RESPECTIVAS VARI�VEIS
		musics[0] = new Music("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140, 0);
		musics[1] = new Music ("O mar serenou", "Candeia", "Clara Nunes", 179, 0);
		musics[2] = new Music ("Rapaz Folgado", "Noel Rosa", "Martinho da vila e Mart'n�lia", 180, 0);
		
		//ATRIBUI OS NOVOS OBJETOS VIDEO NAS SUAS RESPECTIVASA VARI�VEIS
		videos[0] = new Video ( "Musica", "Despacito", "Luis Fonsi", 5926796, 280);
		videos[1] = new Video ("Musica", "Gangnam Style", "Officialpsy", 3276192, 252);
				
		System.out.println("===================================================");
		System.out.println("As m�sicas adicionadas foram: ");
		
		//FOR PARA PERCORRER O ARRAY TOTAL, PRINTAR E ADICIONAR AS M�SICAS NA PLAYLIST
		for (int i = 0; i < 3; i++) {
			//PRINTA NA TELA AS INFORM��ES SOBRE CADA M�SICA ADICIONADA
			System.out.println(musics[i].toString());
			//ADICIONA AS M�SICAS A PLAYLIST UM A UM
			playlist1.addEntertainment(musics[i]);
		}
		
		//PRINTA NA TELA O TEMPO DE DURA��O DA PLAYLIST COM APENAS AS M�SICAS
		System.out.println("===================================================");		
		System.out.println("Dura��o da playlist com as m�sicas: " + playlist1.toString());
		
		System.out.println("===================================================");
		System.out.println("Os v�deos adicionados foram: ");
		
		//FOR PARA PERCORRER O ARRAY TOTAL, PRINTAR E ADICIONAR OS V�DEOS NA PLAYLIST
		for (int i = 0; i < 2; i++) {
			//PRINTA NA TELA AS INFORM��ES SOBRE CADA V�DEO ADICIONADO
			System.out.println(videos[i].toString());
			//ADICIONA AS V�DEOS A PLAYLIST UM A UM
			playlist1.addEntertainment(videos[i]);
		}
		
		//PRINTA NA TELA O TEMPO DE DURA��O DA PLAYLIST COMPLETA
		System.out.println("===================================================");		
		System.out.print("Dura��o da playlist com as m�sicas e os v�deos, lembrando que os v�deos podem conter ou n�o propaganadas: ");

		//PRINTA NA TELA O TEMPO DE DURA��O DA PLAYLIST
		System.out.println(playlist1.toString());
	}
}