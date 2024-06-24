package com.collections;

import java.util.Stack;
//class declaration
public class DemoStack {
      //main method
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); //create object for the Stack class
		stack.push(10); //to insert an element into the stack
		stack.add(20);  
		stack.push(30);
		stack.push(50);
		
		System.out.println(stack); //to print the values of stack 
		System.out.println(stack.peek()); //to show the top most element in the stack
		System.out.println(stack.pop());  //to delete the element from the stack	
		System.out.println(stack.peek());
		System.out.println(stack.search(30)); //it shows the index number of element
		
	}

}
