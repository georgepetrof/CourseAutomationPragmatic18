package lesson06;

public class SonyDVDRemoteController implements IDVDRemoteController{
	private int volume;
	
	public void play() {
		System.out.println("Starting... Sony DVD");
	}
	
	public void stop() {
		System.out.println("Stop Sony DVD");
	}
	
	public void eject() {
		System.out.println("Ejecting the disk from Sony DVD player");
	}
	
	@Override
	public void insertDisc() {
		System.out.println("Inserting the disk to a Sony DVD player");
	}
	
	public void volumeUp() {
		volume+= 10;
	}
}
