package week1.day1;

public class Car {
	public void printCarName() {
		System.out.println("BMW");
	}
    private String getCarColor() {
    	String color="Metalic Grey";
    	return(color);
    }
    boolean isCarPunctured() {
    	boolean istrue=true;
    	return(istrue);
    }

public static void main(String[] args) {
	Car obj=new Car();
	obj.printCarName();
	String carColor = obj.getCarColor();
	System.out.println(carColor);
	boolean carPunctured = obj.isCarPunctured();
	System.out.println(carPunctured);
}

}