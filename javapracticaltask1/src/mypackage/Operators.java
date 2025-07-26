package mypackage;

public class Operators {

	public static void main(String[] args) {
		int a = 22;
        int b = 9;
        
        int sum = a + b;          
        int diff = a - b; 
        int product = a * b;
        int quotient = a / b;     
        int remainder = a % b;   
        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));   
        System.out.println("a != b: " + (a != b));  
        System.out.println("a > b: " + (a > b));     
        System.out.println("a < b: " + (a < b));     
        System.out.println("a >= b: " + (a >= b));   
        System.out.println("a <= b: " + (a <= b));   
        
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));  
        System.out.println("x || y: " + (x || y));   
        System.out.println("!x: " + (!x));           

	}

}
