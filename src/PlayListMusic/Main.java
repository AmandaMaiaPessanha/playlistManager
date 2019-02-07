package PlayListMusic;

public class Main {

	public static void main(String[] args) {
	
		//Declara as variáveis para serem atribuidos ao construtor
		Music music1, music2, music3;
		
		//Instância as variáveis recebendo os objetos criados
		music1 = new Music ("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140);
		music2 = new Music ("O mar serenou", "Candeia", "Clara Nunes", 179);
		music3 = new Music ("Rapaz Folgado", "Noel Rosa", "Martinho da vila e Mart'nália", 180);
		
		Playlist playlist1 = new Playlist();
		
		System.out.println("===================================================");
		System.out.println("As músicas adicionadas foram: ");
		System.out.println(music1.toString());
		System.out.println(music2.toString());
		System.out.println(music3.toString());
				
		playlist1.addMusic(music1);
		playlist1.addMusic(music2);
		playlist1.addMusic(music3);
		
		System.out.println("===================================================");		
		System.out.print("Duração da playlist: ");
		System.out.println(playlist1.toString());
	}
}
		
		
