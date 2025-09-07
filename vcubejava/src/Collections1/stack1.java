package Collections1;

import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> st1=new Stack<>();
		st1.push("Naren");
		st1.push("Hema");
		st1.push("Lalitha");
		st1.push("Vindhya");
		
		st1.push("Akurathi");
		System.out.println("elemenst in the stack before " + st1);
		System.out.println("thw word is at this no :"+st1.search("Vindhya"));
		System.out.println("returns the one on the top of the stack  :"  + st1.peek());
		System.out.println("removes the one on the top of the stack  :"  + st1.pop());
		st1.clear();
		System.out.println("elemenst in the stack after " + st1);
	}

}
