package l7;

import java.util.Comparator;

public class Comparablecar implements Comparator <car> {



	@Override
	public int compare(car o1, car o2) {
		
		return o1.speed-o2.speed;
	}

}
