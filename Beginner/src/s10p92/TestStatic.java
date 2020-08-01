package s10p92;

public class TestStatic {
	/** Initialized as 0 here instead of in a constructor.  */
	private int staticVariable = 0;

	public int getStaticVariable() {
		return staticVariable;
	}

	public void setStaticVariable(int staticVariable) {
		this.staticVariable = staticVariable;
	}
}
