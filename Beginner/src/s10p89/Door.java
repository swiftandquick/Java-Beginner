package s10p89;

public class Door {
	
	/** Inner Class is declared within the lock object. The Lock object isn't an
	 * inner class, but technically it contains a lock from the inner class.  */
	Lock lock = new Lock() {
		@Override 
		public boolean isUnlocked(String keyCode) {
			if (keyCode.equals("qwerty")) {
				return true;
			}
			else {
				return false;
			}
		}	
	};
	
	public Lock getLock() {
		return lock;
	}
	
}
