package s10p89;

public class Shop {

	public static void main(String[] args) {
		// Door door = new Door();
		/** Because lock is private variable, I can't retrieve it without getLock() 
		 * method, so when I call getLock() method, in reality, I using the door.lock 
		 * object to gain access to isUnlocked() method, and it's possible for me to 
		 * do because isUnlocked() method is inside the inner class of the Lock object, 
		 * and lock is a Lock object.  While I gain access to the anonymous inner class, 
		 * I passes in the "qwerty" String argument to isUnlocked() argument, if the 
		 * String matches, I will get false, otherwise I will get true.  Also, new Door() 
		 * is an anonymous object.  
		 * */
		if (new Door().getLock().isUnlocked("qwerty")) {
			System.out.println("Welcome, we are open.  ");
		}
		else {
			System.out.println("We are closed now, please visit later.  ");
		}
	}
	
}
