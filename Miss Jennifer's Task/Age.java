import java.util.Scanner;
public class Age  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age = input.nextInt();

	if(age == 0 || age <= 12) {
		System.out.print("Child");
	}else if(age == 13 || age <= 17) {
		System.out.print("Teen");
	}else if(age == 18 || age <= 64) {
		System.out.print("Adult");
	}else if(age > 65) {
		System.out.print("Senoir");
	}




}
}
