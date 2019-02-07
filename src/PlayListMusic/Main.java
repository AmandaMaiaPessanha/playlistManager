package PlayListMusic;

public class Main {

	public static void main(String[] args) {
	
		//Declara as variáveis para serem atribuidos ao construtor
		Music music1, music2, music3;
		
		//Instância as variáveis recebendo os objetos criados
		music1 = new Music ("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140);
		music2 = new Music ("O mar serenou", "Candeia", "Clara Nunes", 179);
		music3 = new Music ("Rapaz Folgado", "Noel Rosa", "Martinho da vila e Mart'nália", 180);
		
		System.out.println ("Nome da música : " + music1.musicName);
		System.out.println ("Compositor da música 2 : " + music2.musicCompositor);
		System.out.println ("Duração da música 3: " + music3.musicDuration);
		
	}
}
		
		
