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
		for (int i = 0; i <list.size(); i = i + 2) {
			String temp = list.get(i - 1);
			list.set(i-1, list.get(i));
			list.set(i, temp);
		}
	}
	
	public void stutter(List<String> list) {
		for (int i = 0; i < list.size(); i = i + 2) {
			list.add(i, list.get(i));
		}
	}
	
	public void reverse3(List<String> list) {
		for (int i = 0; i < list.size(); i = i + 3) {
			String temp = list.get(i);
			list.set(i, list.get(i + 2));
			list.set(i + 2, temp);
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
