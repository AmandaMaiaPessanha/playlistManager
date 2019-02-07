package PlayListMusic;

public class Main {

	public static void main(String[] args) {
	
		//Declara as vari�veis para serem atribuidos ao construtor
		Music music1, music2, music3;
		
		//Inst�ncia as vari�veis recebendo os objetos criados
		music1 = new Music ("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140);
		music2 = new Music ("O mar serenou", "Candeia", "Clara Nunes", 179);
		music3 = new Music ("Rapaz Folgado", "Noel Rosa", "Martinho da vila e Mart'n�lia", 180);
		
		Playlist playlist1 = new Playlist();
		
		System.out.println("===================================================");
		System.out.println("As m�sicas adicionadas foram: ");
		System.out.println(music1.toString());
		System.out.println(music2.toString());
		System.out.println(music3.toString());
				
		playlist1.addMusic(music1);
		playlist1.addMusic(music2);
		playlist1.addMusic(music3);
		
		System.out.println("===================================================");		
		System.out.print("Dura��o da playlist: ");
		System.out.println(playlist1.toString());
	}
}
		
		
