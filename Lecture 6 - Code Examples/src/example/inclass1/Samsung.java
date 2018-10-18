package example.inclass1;

public class Samsung implements TvRemote, DvdRemote {

	public int size;
	public int numberOfKeys;
	//...
	
	public void lag() {
		System.out.println("samsung lagva");
	}
	
	public void lag1() {
		System.out.println("samsung lagva");
	}
	public void lag2() {
		System.out.println("samsung lagva");
	}
	public void lag3() {
		System.out.println("samsung lagva");
	}
	
	@Override
	public void play() {
		System.out.println("Samsung is playing dvd");
	}

	@Override
	public void stop() {
		System.out.println("Samsung is stopping dvd");
	}

	@Override
	public void eject() {
		
	}

	@Override
	public void startTv() {
		
	}

	@Override
	public void stopTv() {
		
	}

	@Override
	public void goToChannel(int whichChannel) {
		System.out.println("Samsung going to channel " + whichChannel);
	}
}
