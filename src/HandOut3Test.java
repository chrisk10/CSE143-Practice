import java.util.*;
public class HandOut3Test {
	public static void main(String[] args) {
		HandOut3 test = new HandOut3();

		List<String> testAcronymFor = new ArrayList<String>(Arrays.asList("Computer", "Science and", "Engineering"));
		List<String> testSwitchPairs1 = new ArrayList<String>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
		List<String> testSwitchPairs2 = new ArrayList<String>(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));
		List<Integer> testStutter = new ArrayList<Integer>(Arrays.asList(1, 8, 19, 4, 17));
		List<Integer> testReverse3a = new ArrayList<Integer>(Arrays.asList(3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4));
		List<Integer> testReverse3b = new ArrayList<Integer>(Arrays.asList(3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4, 99, 2));
		Set<Integer> testRemoveEvens = new HashSet<Integer>(Arrays.asList(0, 17, 16, 7, 10, 12, 13, 14));
		Set<Integer> testContainsAll1 = new HashSet<Integer>(Arrays.asList(17, 16, 7, 10, 12, 13, 14));
		Set<Integer> testContainsAll2 = new HashSet<Integer>(Arrays.asList(7, 12, 13));
		Set<Integer> testEquals1 = new HashSet<Integer>(Arrays.asList(5, 3, 1, 0));
		Set<Integer> testEquals2 = new HashSet<Integer>(Arrays.asList(0, 1, 5, 3));
		Set<Integer> testEquals3 = new HashSet<Integer>(Arrays.asList(1, 0, 5, 3, 4));

		String correctAcronym = "CSE";
		String correctSPair1 = "[score, four, seven, and, ago, years]";
		String correctSPair2 = "[be, to, not, or, be, to, hamlet]";
		String correctStutter = "[1, 1, 8, 8, 19, 19, 4, 4, 17, 17]";
		String correctReverse3a = "[19, 8, 3, 26, 7, 42, 193, -8, 19, -4, 6, 204]";
		String correctReverse3b = "[19, 8, 3, 26, 7, 42, 193, -8, 19, -4, 6, 204, 99, 2]";
		String correctRemoveEvens = "[0, 10, 12, 14, 16]";
		boolean correctContainsAll1 = true;
		boolean correctContainsAll2 = false;
		boolean correctEquals1 = true;
		boolean correctEquals2 = false;
		boolean correctEquals3 = false;
		
		if (test.acronymFor(testAcronymFor).equals(correctAcronym)) {
			System.out.println("AcronymFor passed");
		}
		
		test.swtichPairs(testSwitchPairs1);
		test.swtichPairs(testSwitchPairs2);
		if (testSwitchPairs1.toString().equals(correctSPair1) && testSwitchPairs2.toString().equals(correctSPair2)) {
			System.out.println("SwitchPairs passed");
		}
		
		test.stutter(testStutter);
		if (testStutter.toString().equals(correctStutter)) {
			System.out.println("Stutter passed");
		}
		
		test.reverse3(testReverse3a);
		test.reverse3(testReverse3b);
		if (testReverse3a.toString().equals(correctReverse3a) && testReverse3b.toString().equals(correctReverse3b)) {
			System.out.println("Reverse3 passed");
		}
		
		if (test.removeEvens(testRemoveEvens).toString().equals(correctRemoveEvens)) {
			System.out.println("RemoveEvens passed");
		}
		
		if (test.containsAll(testContainsAll1, testContainsAll2) == correctContainsAll1 
				&& test.containsAll(testContainsAll2, testContainsAll1) == correctContainsAll2) {
			System.out.println("ContainsAll passed");
		}
		
		if (test.equals(testEquals1, testEquals2) == correctEquals1 
				&& test.equals(testEquals1, testEquals3) == correctEquals2 
				&& test.equals(testEquals2, testEquals3) == correctEquals3) {
			System.out.println("Equals passed");
		}
	}
}
