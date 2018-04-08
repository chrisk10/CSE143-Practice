// Handout #1 and #2 use the pre-made class from lecture
public class HandOut1n2 {

	private int[] elementData; // list of integers
	private int size;          // current number of elements in the list

	// constructs a list with a capacity of 100
	public HandOut1n2() {
		elementData = new int[100];
		size = 0;
	}

	// returns a comma-separated, bracketed version of the list
	public String toString() {
		if (size == 0) {
			return "[]";
		} else {
			String result = "[" + elementData[0];
			for (int i = 1; i < size; i++) {
				result += ", " + elementData[i];
			}
			result += "]";
			return result;
		}
	}

	// appends the given value to the end of the list
	public void add(int value) {
		elementData[size] = value;
		size++;
	}
	
	// indexOf, stutter, remove, add are Handout #1 problems
	// isPairwiseSorted, mirror, fromCounts, are Handout #2 problems
	
	// Handout #1 Problems
	public int indexOf(int value) {
		for (int i = 0; i < size; i++) {
			if (elementData[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public void stutter() {
		for (int i = size - 1; i >= 0; i--) {
			elementData[i * 2 + 1] = elementData[i];
		}
		size = size * 2;
	}
	
	public void remove(int index) {
		for (int i = index; i < size; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
	}
	
	public void add(int index, int value) {
		for (int i = size; i >= index; i--) {
			if (i == index) {
				elementData[i] = value;
			} else {
				elementData[i] = elementData[i - 1];
			}
		}
		size++;
	}
	
	// Handout #2 Problems
	public boolean isPairwiseSorted() {
		for(int i = 1; i < size; i = i + 2) {
			if (elementData[i - 1] > elementData[i]) {
				return false;
			}
		}
		return true;
	}
	
	public void mirror() {
		for (int i = 0; i < size; i++) {
			elementData[size * 2 - 1 - i] = elementData[i];
		}
		size = size * 2;
	}
	
	public int size() {
		return size;
	}
	
	/*public ArrayIntList fromCounts(ArrayIntList other) {
		ArrayIntList
		int index = 0;
	}*/
}
