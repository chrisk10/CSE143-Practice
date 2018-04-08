import java.util.*;

public class HandOut3 {
	
	public String acronymFor(List<String> list) {
		String ret = "";
		for (int i = 0; i < list.size(); i++) {
			String word = list.get(i);
			ret += Character.toUpperCase(word.charAt(0));
		}
		return ret;
	}
	
	public void swtichPairs(List<String> list) {
		for (int i = 1; i <list.size(); i = i + 2) { // This had to start from index of 1 because I was looking back
			String temp = list.get(i - 1);
			list.set(i-1, list.get(i));
			list.set(i, temp);
		}
	}
	
	public void stutter(List<Integer> testStutter) {
		for (int i = 0; i < testStutter.size(); i = i + 2) {
			testStutter.add(i, testStutter.get(i));
		}
	}
	
	public void reverse3(List<Integer> list) {
		for (int i = 0; i < list.size() - 2 ; i = i + 3) { /* This had to be list.size() - 2
														  * if there was -2, in the second case, method would reach 99 and try to 
														  * do list.get(i + 2) which is out of bound. Nonetheless, -3 would not work, because
														  * the first case would not get to 204 and would ont perform the reversing actions.
														  * It is a good problem to come back to.
														  */
			int n1 = list.get(i);
			int n3 = list.get(i + 2);
			list.set(i, n3);
			list.set(i + 2, n1);
		}
	}
	
	public boolean hasOdd(Set<Integer> s) {
		for (int num : s) {
			if (num % 3 != 0) {
				return false;
			}
		}
		return true;
	}
	
	public Set<Integer> removeEvens(Set<Integer> s) {
		Set<Integer> ret = new TreeSet<Integer>();
		Iterator<Integer> itr = s.iterator();
		int oldSize = s.size();
		for (int i = 0; i < oldSize; i++) {
			int num = itr.next();
			if (num % 2 == 0) {
				ret.add(num);
				itr.remove();
			}
		}
		return ret;
	}
	
	public boolean containsAll(Set<Integer> s1, Set<Integer> s2) {
		for (int num : s2) {
			if (!s1.contains(num)) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean equals(Set<Integer> s1, Set<Integer> s2) {
		if (s1.size() == s2.size()) {
			for (int num : s2) {
				if (!s1.contains(num)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
