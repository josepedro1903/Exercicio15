import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

		Scanner takeNameValue = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String name = takeNameValue.nextLine();
		
		Scanner takeAgeValue = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int age = takeAgeValue.nextInt();
		
		if (age >= 15 && age <= 25) {
		    System.out.println("ACEITA");
		} else {
		    System.out.println("NÃO ACEITA");
		}
		
	}
}