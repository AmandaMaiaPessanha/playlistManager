package PlayListMusic;

public class Music {
	private String name;
	private String compositor;
	private String interpreter;
	private int durationInMinutes;
	
	Music (String mName, String mCompositor, String mInterpreter, int mDuration) {
		name = mName; compositor = mCompositor; interpreter = mInterpreter; durationInMinutes = mDuration;
	}

	public String getCompositor() {
		return compositor;
	}

	public String getInterpreter() {
		return interpreter;
	}

	public int getDuration() {
		return durationInMinutes;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Music inserida contém name = " + this.name + ", compositor = " + this.compositor + ", interpreter = " + this.interpreter + ", duration = " + this.durationInMinutes + "]";
	}	
}