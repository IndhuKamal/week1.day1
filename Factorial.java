package week1.day1;

public class Factorial {
 public static void main(String[] args) {
	int i=1,fact=1;
	int number=6;
	for(i=1;i<=number;i++) {
	fact=fact*i;
	}
	System.out.println("Factorial of "+number+" is:"+fact); 
}
}
