
public abstract class Sensor {
protected char port;
protected boolean connected;
protected float lastValue;
public Sensor(char port) {
	this.port = port;
	connected = true;
	lastValue = 0;
}
abstract float getReading();
abstract boolean isActive();
abstract char getPort();
abstract void setPort(char p);
}

