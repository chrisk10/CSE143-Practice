
public class April26Prac {
	public static void main (String[] args) {
		ArrayIntList test = new ArrayIntList();
		test.add(99);		
		test.add(99);
		test.collapse();
		
		System.out.println(test.toString());
		
		ArrayIntList test2 = new ArrayIntList();
		test2.add(5);
		test2.add(2);
		test2.add(2);
		test2.add(-5);
		test2.add(4);
		test2.add(3);
		test2.add(2);
		test2.add(4);
		test2.add(1);
		test2.add(1);
		test2.add(1);
		test2.add(0);
		test2.add(2);
		test2.add(17);
		
		ArrayIntList counted = test2.fromCounts(test2);
		System.out.println(counted.toString());
		
		ArrayIntList test3 = new ArrayIntList();
		test3.add(12);
		test3.add(4);
		
		test3.insertAt(1, 2, 98);
		System.out.println(test3.toString());
		
		ArrayIntList test4 = new ArrayIntList();
		test4.add(3);
		test4.add(4);
		test4.add(5);
		test4.add(6);
		test4.add(7);
		test4.add(8);
		test4.add(9);
		
		System.out.println(test4.isConsecutive());
		
		ArrayIntList test5 = new ArrayIntList();
		test5.add(1);
		test5.add(3);
		test5.add(-6);
		test5.add(-3);
		test5.add(5);
		test5.add(3);
		test5.add(1);
		
		System.out.println(test5.makeConsecutiveByN(3));
		System.out.println(test5.toString());
		
	}
}
