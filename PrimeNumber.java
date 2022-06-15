package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int a=13;  
	    System.out.println("Your Given number is " + a);
	    int count=1;
		for(int i=1;i<=a;i++ ) {
			if(a%i==0) 
			{
				count++;
				break;
			}
			
		}
			if(count==2) {
				System.out.println("Number" + a + "is a Prime Number");
			}
				else {
					System.out.println("Number" + a + "is not a Prime Number");
				
				}
	}
	

}