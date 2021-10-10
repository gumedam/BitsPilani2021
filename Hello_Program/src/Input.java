import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		System.out.println("Enter your age:");
		
		String name = input.nextLine();
		
		int value = input.nextInt();
		
		System.out.println("Your Name is: " +name);
		
		System.out.println("Your Value is: " +value);

	}

}
