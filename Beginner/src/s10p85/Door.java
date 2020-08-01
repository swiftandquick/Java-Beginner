package s10p85;

public class Door {

	private Lock lock;
	
	/** Constructor.  */
	Door() {
		/** Pass variable to constructor.  */
		lock = new Lock(true);
	}
	
	/** Gets status of the shop.  */
	public void shopStatus() {
		if (lock.isLock()) {
			System.out.println("Shop is closed, please visit later");
		}
	}
	
	/** Inner class, shares public methods and variables with outer class, 
	 * however, outer class can't get access to lockStatus unless it's 
	 * with the isLocked() method because private variables don't share 
	 * outside of its class.  .  */
	class Lock {
		private boolean lockStatus;
		
		public Lock(boolean rLockStatus) {
			this.lockStatus = rLockStatus;
		}
		
		/** Basically a get method, returns lock variable.  */
		public boolean isLock() {
			return lockStatus;
		}
		
		public void setLock(boolean rLockStatus) {
			this.lockStatus = rLockStatus;
		}
	}
	
}
