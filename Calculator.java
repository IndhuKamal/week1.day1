package week1.day1;

public class Calculator {
	public int addTwoNumbers(int a,int b) {
		return(a+b);
		}
	public float subTwoNumbers(float c,float d) {
		return(c-d);
		}
	public double multiplyThreeNum(double e,double f,double g) {
		return(e*f*g);
	}
    public int divideTwoNumbers(int h,int i) {
    	return(h/i);
    }


public static void main(String[] args) {
	Calculator obj=new Calculator();
	int twoNumbers = obj.addTwoNumbers(10,20);
	System.out.println(twoNumbers);
	float subTwoNumbers = obj.subTwoNumbers(40.675f, 25.9896f);
	System.out.println(subTwoNumbers);
	double threeNum = obj.multiplyThreeNum(90.78695, 78.678547,56.89745);
	System.out.println(threeNum);
    int divideTwoNumbers = obj.divideTwoNumbers(90,20);
    System.out.println(divideTwoNumbers);
  
	}
}
