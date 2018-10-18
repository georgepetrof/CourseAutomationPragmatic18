package lesson06;

public interface ITVRemoteController {
	void startTV();
	void stopTV();
	void channelUp();
	void channerDown();
	void goToChannel(int newChannel);
}
