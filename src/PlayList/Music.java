package PlayList;

class Music extends Entertainment {

	//CARACTERISTICAS DA CLASSSE MUSIC
	String interpreter;
	String composer;
	
	//CONSTRUTOR DA CLASSE MUSIC
	public Music(int duration, String name, String mInterpreter, String mComposer) {
		super(duration, name);
		this.interpreter = mInterpreter; this.composer = mComposer;
	}
}

