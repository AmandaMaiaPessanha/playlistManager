package PlayListMusic;

public class Music {
	String musicName;
	String musicCompositor;
	String musicInterpreter;
	float musicDuration;
	//Crie uma classe que representará uma música. Para este gerenciador,
	//precisaremos armazenar o nome da música, seu intérprete, seu compositor e a
	//duração da música (em minutos). Declare atributos e construtor(es) de forma a
	//facilitar a criação de objetos desta classe.
	
	Music (String mName, String mCompositor, String mInterpreter, int mDuration) {
		musicName = mName; musicCompositor = mCompositor; musicInterpreter = mInterpreter; musicDuration = mDuration;
	}
}