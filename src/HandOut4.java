import java.util.*;
public class HandOut4 {

	public void splitStack(Stack<Integer> s) {
		Queue<Integer> q = new LinkedList<Integer>();
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
		int size = q.size();
		for (int i = 0; i < size; i++) {
			int num = q.remove();
			if (num < 0) {
				s.push(num);
			} else {
				q.add(num);
			}
		}
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
	}
	
	public void stutter(Stack<Integer> s) {
		Queue<Integer> q = new LinkedList<Integer>();
		while(!s.isEmpty()) {
			int num = s.pop();
			q.add(num);
			q.add(num);
		}
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
	}
	
	public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
		Stack<Integer> temp = new Stack<Integer>();
		if (s1.size() == s2.size()) {
			int num1 = s1.pop();
			int num2 = s2.pop();
			temp.push(num1);
			temp.push(num2);
			if (num1 != num2) {
				while(!temp.isEmpty()) {
					s2.push(temp.pop());
					s1.push(temp.pop());
				}
				return false;
			}
		}
		while(!temp.isEmpty()) {
			s2.push(temp.pop());
			s1.push(temp.pop());
		}
		return true;
	}
	
	public void reverseHalf(Queue<Integer> q) {
		Stack<Integer> s = new Stack<Integer>();
		int qSize = q.size();
		for (int i = 0; i < qSize; i++) {
			int num = q.remove();
			if (i % 2 != 0) {
				s.push(num);
			} else {
				q.add(num);
			}
		}
		int sSize = s.size();
		for (int i = 0; i < sSize; i++) {
			q.add(q.remove());
			q.add(s.pop());
		}
	}
	
	/*public boolean isPalindrome(Queue<Integer> q) {
		
	}
	
	public boolean isConsecutive(Stack<Integer> s) {
		
	}*/
	
	public void removeByN(Queue<Integer> q, int n) {
		Stack<Integer> s = new Stack<Integer>();
		int oldN = n;
		int qSize = q.size();
		if (qSize <= n) {
			for (int i = 0; i < qSize; i++) { 
				s.push(q.remove());
			}
			while (!s.isEmpty()) {
				q.add(s.pop());
			}
		} else {
			for (int i = 0; i < qSize - (qSize % n); i = i + n) {
				while (n != 0) {
					s.push(q.remove());
					n--;
				}
				while (!s.isEmpty()) {
					q.add(s.pop());
				}
				n = oldN;
			}
			for (int i = 0; i < qSize % n; i++) {
				s.push(q.remove());
			}
			while(!s.isEmpty()) {
				q.add(s.pop());
			}
		}
	}
}
