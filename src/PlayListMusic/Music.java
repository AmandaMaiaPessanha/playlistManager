package PlayListMusic;

public class Music extends Entertainment {
	private String composer;
	private String interpreter;
		
	public Music (String mName,  String mComposer, String mInterpreter, int mDuration) {
		super(mName, mDuration);
		name = mName; composer = mComposer; interpreter = mInterpreter; duration = mDuration;
	}
	

	public String getName() {
		return this.name;
	}

	public String getCompositor() {
		return this.composer;
	}

	public String getInterpreter() {
		return this.interpreter;
	}

	public int getDuration() {
		return this.duration;
	}
	
	@Override
	public String toString() {
		return "Music inserida contém: " + "name = " + this.name + ", compositor = " + this.composer + ", interpreter = " + this.interpreter + ", duration = " + this.duration;
	}	
}