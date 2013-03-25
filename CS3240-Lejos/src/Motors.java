
public abstract class Motors {
	protected char port;
	protected boolean connected;
	public Motors(char port) {
	this.port = port;
	connected = true;
	}
	abstract void move (int speed);
	abstract void stop();
}
