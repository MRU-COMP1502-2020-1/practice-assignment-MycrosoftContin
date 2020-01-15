package myFirstPackage;

public class isPrime {

	public static void main(String[] args) {
		System.out.println(isNumPrime(5));
		System.out.println(isNumPrime(6));
		System.out.println(isNumPrime(7));
		System.out.println(isNumPrime(8));
		System.out.println(isNumPrime(9));
		System.out.println(isNumPrime(10));
		
		

	}

	public static boolean isNumPrime(int number) {
		boolean isPrime = true;
		for(int i = 2; i != number -1; i++) {
			if(number % i == 0) {
				isPrime = false;
				break;
			}		
		}
		return isPrime;
	}
	
	
}
