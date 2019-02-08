package PlayListMusic;

public class Music {
	//CARACTERÍSTICAS DA CLASSSE MUSIC
	String name;
	String composer;
	String interpreter;
	int durationInMinutes;
	
	//CONSTRUTOR DA CLASSE MUSIC
	Music (String mName, String mCompositor, String mInterpreter, int mDuration) {
		name = mName; composer = mCompositor; interpreter = mInterpreter; durationInMinutes = mDuration;
	}
	
	//GET DE NAME
	public String getName() {
		return this.name;
	}

	//GET DE COMPOSER
	public String getComposer() {
		return composer;
	}
	
	//GET DE INTERPRETER
	public String getInterpreter() {
		return interpreter;
	}

	//GET DE DURATION
	public int getDuration() {
		return durationInMinutes;
	}
	
	@Override
	public String toString() {
		return "Music name = " + this.name + ", compositor = " + this.composer + ", interpreter = " + this.interpreter + ", duration = " + this.durationInMinutes;
	}	
}