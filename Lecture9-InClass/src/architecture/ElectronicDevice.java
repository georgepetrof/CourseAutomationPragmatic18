package architecture;

/**
 * This is a Interface for ElectronicDevice
 * @author George
 *
 */
public interface ElectronicDevice {
	/**
	 * We have methods for "Start" and  "Stop" the ElectronicDevice  and to check if it is started or not
	 */
	void start();
	void stop();
	boolean isStarted();
	
	
}
