package FirstPackage;

public class MethodCall {

	public static void main(String[] args) {
		// This is the Main Method
    // This method call the print function
		print();
		// This method call the sum function
     sum();
	}

	public static void print() {
		
		System.out.println("I am in the city");
	}
	
	public static void sum(){
		
		int a = 892;
		int b = 13;
		int sum;
		
		sum = a + b;
		
		System.out.println(sum);
	}
}
