package example.inclass1;

public class Sony implements TvRemote, DvdRemote {

	@Override
	public void play() {
		System.out.println("Sony is playing dvd");
	}

	@Override
	public void stop() {
		System.out.println("Sony is stopping dvd");
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
		System.out.println("Sony going to channel " + whichChannel);
	}



}
