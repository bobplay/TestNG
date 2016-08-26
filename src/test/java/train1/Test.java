package train1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date d = new Date();
		String dt = new SimpleDateFormat().format(d);
		System.out.println(dt);
		System.out.println(d.getTime());
	}
}
