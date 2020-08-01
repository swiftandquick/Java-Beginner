package s10p84;

/** I can inherit multiple interfaces.  */
public class Person implements IsAlive, LiveLife {

	@Override
	public void speak() {
		System.out.println("I can speak.  ");
	}
	
	@Override
	public void message() {
		System.out.print("Here's my message.  ");
	}

	@Override
	public void breathe() {
		System.out.println("I am alive.  ");
	}
	
}
