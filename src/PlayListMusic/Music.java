package PlayListMusic;

public class Music {
	String name;
	String compositor;
	String interpreter;
	int durationInMinutes;
	
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
		return "Music name = " + this.name + ", compositor = " + this.compositor + ", interpreter = " + this.interpreter + ", duration = " + this.durationInMinutes + "]";
	}	
}