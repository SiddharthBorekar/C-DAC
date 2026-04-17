package tree;

import java.util.Comparator;

public class MyComparatorStr implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		String cm1 = o1.toLowerCase();
		String cm2 = o2.toLowerCase();
		if (cm1.charAt(0) < cm2.charAt(0)) {
			return +1;
		} else if (cm1.charAt(0) > cm2.charAt(0)) {
			return -1;
		} else {
			for (int i = 0; i < cm1.length(); i++) {
				if (cm1.charAt(i) > cm2.charAt(i)) {
					return -1;
				}
			}
			return 0;
		}
	}

}