package Collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push("Pathi");
		st.push("Purna");
		st.push("chander");
		System.out.println(st);
		System.out.println(st.search("Pathi"));
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.empty());
		st.clear();
		System.out.println(st.empty());

	}

}
