package PlayListMusic;

public class Music extends Entertainment  {
	//private String name;
	Entertainment[] entertainment;
	private String compositor;
	private String interpreter;
	//private int durationInMinutes; 
		
	Music (String mCompositor, String mInterpreter) {
		super(name, duration);
		compositor = mCompositor; interpreter = mInterpreter;
	}

	public String getCompositor() {
		return compositor;
	}

	public String getInterpreter() {
		return interpreter;
	}

	//public int getDuration() {
	//	return durationInMinutes;
	//}
	
	//public String getName() {
	//	return this.name;
	//}
	
	@Override
	public String toString() {
		return "Music inserida contém compositor = " + this.compositor + ", interpreter = " + this.interpreter;
	}	
}