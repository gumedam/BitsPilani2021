
import java.util.Scanner;
public class ClassesAndMethods {

	public static void main(String[] args) {
		
		car cost = new car();
		String brands = cost.CostRange();
		System.out.println("your brand selection should be: " + brands);
		
	}

}

class car {
	String brand;
	String color;
	int speed;
	
	Scanner input = new Scanner(System.in);
	
	String CostRange() {
		System.out.println("Enter the price: ");
		int price = input.nextInt();
		
		if (price > 1000000) {
			brand = "Volkswagon";
			
		}
			else if (price < 1000000) {
				brand = "Maruthi";
				
			}
			//System.out.println("Brands you should look at is:" +brand);
		return brand;
		
	}

}