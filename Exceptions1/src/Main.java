
public class Main {

	public static void main(String[] args) {
		doExcept();

	}

	private static void doExcept() {
		throw new DatabaseCorruptedException("EEE exception li beee");
		
	}

}
