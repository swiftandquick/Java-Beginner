package s10p87;

public class Door {

	/** Takes key as argument.  */
	public boolean isLocked(String key) {
		
		class Lock {
			/** If the key is qewrty, door is unlocked, otherwise 
			 * the door is still locked.  */
			public boolean isLocked(String key) {
				if (key.equals("qewrty")) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		
		/** new Lock() is an empty object, I am going use it to invoke 
		 * the isLocked() method inside the Lock class.   */
		return new Lock().isLocked(key);

	}
	
}
