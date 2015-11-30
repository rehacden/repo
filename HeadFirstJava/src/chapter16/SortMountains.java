package chapter16;

import java.util.*;
//import java.util.Comparator;
//import java.util.LinkedList;

public class SortMountains {
	LinkedList<Mountain> mtn = new LinkedList<>();

	class NameCompare implements Comparator<Mountain> {
		@Override
		public int compare(Mountain o1, Mountain o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	class HeightCompare implements Comparator<Mountain> {

		@Override
		public int compare(Mountain o1, Mountain o2) {
			return o1.height-o2.height;
		}

	}

	public static void main(String[] args) {
		new SortMountains().go();
	}

	private void go() {
		mtn.add(new Mountain("Longs", 14255));
		mtn.add(new Mountain("Elb", 14265));
		mtn.add(new Mountain("Lo", 14245));
		mtn.add(new Mountain("Ags", 14955));

		System.out.println("as entered: \n" + mtn);
		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		System.out.println("by name: \n" + mtn);
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("by height: \n" + mtn);
	}

}
