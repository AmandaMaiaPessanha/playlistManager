package PlayListMusic;

public class Main {

	public static void main(String[] args) {
	
		//Declara as vari�veis para serem atribuidos ao construtor
		Music music1, music2, music3;
		
		//Inst�ncia as vari�veis recebendo os objetos criados
		music1 = new Music ("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140);
		music2 = new Music ("O mar serenou", "Candeia", "Clara Nunes", 179);
		music3 = new Music ("Rapaz Folgado", "Noel Rosa", "Martinho da vila e Mart'n�lia", 180);
		
		System.out.println ("Nome da m�sica : " + music1.musicName);
		System.out.println ("Compositor da m�sica 2 : " + music2.musicCompositor);
		System.out.println ("Dura��o da m�sica 3: " + music3.musicDuration);
		
	}
}
		
		
