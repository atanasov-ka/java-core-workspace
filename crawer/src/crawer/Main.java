package crawer;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
			System.out.println(Crawer.search(new URL("http://ebusiness.free.bg"), "�����������", 10, "UTF-8"));
		
	}
}
