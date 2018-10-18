package lesson06;

public class Demo {
	public static void main(String[] args) {
		
		IDVDRemoteController philipsDvd = new PhilipsRemoteController();
		IDVDRemoteController samsungDvd = new SamsungDVDRemoteController();
		PhilipsRemoteController philipsRemote = new PhilipsRemoteController();
		philipsDvd.eject();
		samsungDvd.eject();
	}
}
