package FruitAppSort;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{
	int no;
	String name;
	int price;
	
	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit o) {
		return 0;
	}
	
	class FruitComparator implements Comparator<Fruit>{

		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
	class FruitComparatorDesc implements Comparator<Fruit>{

		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o2.name.compareTo(o1.name);
		}
		
	}
	
	@Override
	public String toString() {
		return ("Student [no="+no+", name="+name+", price="+price+"]");
	}

}
