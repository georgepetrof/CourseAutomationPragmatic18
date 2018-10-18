package example.inclass1;

public class Demo {
	public static void main(String[] args) {
		Samsung mySamsung = new Samsung();
		
		TvRemote mySamsungTvRemote = new Samsung();
		TvRemote mySonyTvRemote = new Sony();
		
		mySamsungTvRemote.goToChannel(20);
		mySonyTvRemote.goToChannel(15);
		
	}
}
