package FirstPackage;

public class MethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  print();
  sum();
	}

	public static void print() {
		
		System.out.println("I am in the city");
	}
	
	public static void sum(){
		
		int a = 12;
		int b = 13;
		int sum;
		
		sum = a + b;
		
		System.out.println(sum);
	}
}
