package PlayListMusic;

public class Music {
	String musicName;
	String musicCompositor;
	String musicInterpreter;
	float musicDuration;
	//Crie uma classe que representar� uma m�sica. Para este gerenciador,
	//precisaremos armazenar o nome da m�sica, seu int�rprete, seu compositor e a
	//dura��o da m�sica (em minutos). Declare atributos e construtor(es) de forma a
	//facilitar a cria��o de objetos desta classe.
	
	Music (String mName, String mCompositor, String mInterpreter, int mDuration) {
		musicName = mName; musicCompositor = mCompositor; musicInterpreter = mInterpreter; musicDuration = mDuration;
	}
}