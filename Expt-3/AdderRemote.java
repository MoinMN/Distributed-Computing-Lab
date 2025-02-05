import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder {
	public AdderRemote() throws Exception {
		super();
	}

	public int add(int x, int y) {
		return (x + y);
	}
}