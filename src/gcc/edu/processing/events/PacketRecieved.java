package gcc.edu.processing.events;

import java.util.EventObject;

public class PacketRecieved extends EventObject {
	public PacketRecieved(Object source) {
		super(source);
	}
}