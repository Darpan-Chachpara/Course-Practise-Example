package lectutre.CoreJavaAssignment;

import java.util.Stack;

public class Assignment_3_4_Pusp_Pop {

	public static void main(String[] args) 
	{
		Stack<Integer> STACK = new Stack<Integer>(); 
		  
        STACK.push(10); 
        STACK.push(15); 
        STACK.push(30); 
        STACK.push(20); 
        STACK.push(5); 
  
        System.out.println("INITIAL STACK: " +STACK); 
        
        System.out.println("POPPED ELEMENT: " +STACK.pop()); 
        System.out.println("POPPED ELEMENT: " +STACK.pop()); 
        System.out.println("STACK AFTER POP OPERATION: "+STACK);

        System.out.println("PUSHED ELEMENT: " +STACK.push(200)); 
        System.out.println("PUSHED ELEMENT: " +STACK.push(500)); 

        
        System.out.println("STACK AFTER PUSH OPERATION: "+STACK);
               

	}

}
