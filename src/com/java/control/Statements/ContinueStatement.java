package com.java.control.Statements;

public class ContinueStatement {
	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
		 if(i==4)
		 {
			continue; 
		 }
			System.out.println(i);
			
		}
	}
}


/*Continue Loop will continue the iteration even after satisfying the condition by skipping the coondition*/