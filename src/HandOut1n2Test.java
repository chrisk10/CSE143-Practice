
public class HandOut1n2Test {
	public static void main(String[] args) {
		HandOut1n2 test = new HandOut1n2();
		test.add(1);
		test.add(3);
		test.add(5);
		test.add(3);
		test.add(1);
		
		int testIndexOf = 1;
		String testStutter = "[1, 1, 3, 3, 5, 5, 3, 3, 1, 1]";
		String testRemove = "[1, 1, 3, 5, 5, 3, 3, 1, 1]";
		String testAdd = "[1, 1, 3, 999, 5, 5, 3, 3, 1, 1]";
		boolean testIsPairwiseSorted = false;
		String testMirror = "[1, 5, 5, 1]";
		String testFromCounts = "[5, 1, 1, 1, 1, 1]";
		
		if (test.indexOf(3) == testIndexOf) {
			System.out.println("IndexOf passed");
		}
		test.stutter();
		if (test.toString().equals(testStutter)) {
			System.out.println("Stutter passed");
		}
		test.remove(3);
		if (test.toString().equals(testRemove)) {
			System.out.println("Remove passed");
		}
		test.add(3, 999);
		if (test.toString().equals(testAdd)) {
			System.out.println("Add passed");
		}
		int size = test.size();
		for (int i = 0; i < size; i++) {
			test.remove(0);				/* had to store size in a separate variable.
										 * while I was removing numbers from elementData,
										 * size field was being updated and my size() method was 
										 * returning the updated size. Thus, size kept decreasing while
										 * i (increment) was increasing. Thus, the method stopped after
										 * half the numbers were gone.
										 */
		}
		if (test.isPairwiseSorted() == testIsPairwiseSorted) {
			System.out.println("IsPairwiseSorted passed");
		}
		test.add(1);
		test.add(5);
		test.mirror();
		if (test.toString().equals(testMirror)) {
			System.out.println("Mirror passed");
		}
		test = test.fromCounts();
		if (test.toString().equals(testFromCounts)) {
			System.out.println("FromCounts passed");
		}
	}
}
