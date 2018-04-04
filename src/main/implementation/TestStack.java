package main.implementation;

import main.java.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		Stack aStack = new Stack();
		System.out.println("sdgdfgdg");
		try {
			aStack.push(10);
			aStack.push(20);
			aStack.push(30);
			aStack.toString();
			aStack.pop();
			aStack.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
