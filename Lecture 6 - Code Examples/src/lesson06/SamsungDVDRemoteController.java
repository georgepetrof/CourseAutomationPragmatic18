package lesson06;

public class SamsungDVDRemoteController implements IDVDRemoteController{

	@Override
	public void play() {
		System.out.println("Starting SAMSUNG DVD");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop SAMSUNG DVD");
		
	}

	@Override
	public void insertDisc() {
		System.out.println("Insert dvd");
	}

	@Override
	public void eject() {
		System.out.println("Eject dvd");		
	}

}
