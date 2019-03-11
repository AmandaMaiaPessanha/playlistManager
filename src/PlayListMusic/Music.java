package PlayListMusic;

public class Music extends Entertainment {
	
	//CARACTERISTICAS DA CLASSSE MUSIC
	public String composer;
	public String interpreter;
	
	//CONSTRUTOR DA CLASSE MUSIC
	public Music (String mName,  String mComposer, String mInterpreter, int mDuration, int mViews) {
		super(mName, mDuration, mViews);
		name = mName; composer = mComposer; interpreter = mInterpreter; duration = mDuration;
	}
	
	//GET DE NAME
	public String getName() {
		return this.name;
	}
	
	//GET DE COMPOSER
	public String getCompositor() {
		return this.composer;
	}

	//GET DE INTERPRETER
	public String getInterpreter() {
		return this.interpreter;
	}

	//GET DE DURATION
	public int getDuration() {
		return this.duration;
	}
	
	@Override
	public String toString() {
		return "Music inserida contém: " + "name = " + this.name + ", compositor = " + this.composer + ", interpreter = " + this.interpreter + ", duration = " + this.duration;
	}	
}