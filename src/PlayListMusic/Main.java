package PlayListMusic;

public class Main {

	public static void main(String[] args) {
	
		//DECLARA VARÁVEIS QUE SE SERÃO USADAS PARA O CONSTRUTOR MUSIC
		Music music1, music2, music3;
		
		//ATRIBUI OS NOVOS OBJETOS MUSIC NAS SUAS RESPECTIVASA VARIÁVEIS
		music1 = new Music ("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140);
		music2 = new Music ("O mar serenou", "Candeia", "Clara Nunes", 179);
		music3 = new Music ("Rapaz Folgado", "Noel Rosa", "Martinho da vila e Mart'nália", 180);
		
		//DECLARA A VARIÁVEL DA PRIMEIRA PLAYLIST E ATRIBÚI A ELA O CONSTRUTOR PLAYLIST
		Playlist playlist1 = new Playlist();
		
		System.out.println("===================================================");
		System.out.println("As músicas adicionadas foram: ");
		
		//PRINTA NA TELA AS INFORMÇÕES SOBRE CADA MPUSICA ADICIONADA
		System.out.println(music1.toString());
		System.out.println(music2.toString());
		System.out.println(music3.toString());
		
		//ADICIONA AS MÚSICAS A PLAYLIST UM A UM
		playlist1.addMusic(music1);
		playlist1.addMusic(music2);
		playlist1.addMusic(music3);
		
		System.out.println("===================================================");		
		System.out.print("Duração da playlist: ");

		//PRINTA NA TELA O TEMPO DE DURAÇÃO DA PLAYLIST
		System.out.println(playlist1.toString());
		
		//DECLARA VARÁVEIS QUE SE SERÃO USADAS PARA O CONSTRUTOR
		Video video1, video2;
		
		//ATRIBUI OS NOVOS OBJETOS MUSIC NAS SUAS RESPECTIVASA VARIÁVEIS
		video1 = new Video ("Musica", "Despacito", "Luis Fonsi", 5926796, 280);
		video2 = new Video ("Musica", "Gangnam Style", "Officialpsy", 3276192, 252);
		
		System.out.println("===================================================");
		System.out.println("Os vídeos adicionados foram: ");
		
		//PRINTA NA TELA AS INFORMÇÕES SOBRE CADA MPUSICA ADICIONADA
		System.out.println(video1.toString());
		System.out.println(video2.toString());
		
		//DECLARA A VARIÁVEL DA PRIMEIRA PLAYLIST E ATRIBÚI A ELA O CONSTRUTOR PLAYLIST
		Playlist playlist2 = new Playlist();
		
		//ADICIONA OS VÍDEOS A PLAYLIST UM A UM
		playlist2.addVideo(video1);
		playlist2.addVideo(video2);
	}
}
		
		
