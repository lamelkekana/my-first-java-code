import java.util.Scanner;

     public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("What is your name ?");
		String name = myscanner.nextLine();
		
		System.out.println("How old are you?");
		int age = myscanner.nextInt();
		
		myscanner.nextLine();
		
		System.out.println("Where do you live?");
		String area = myscanner.nextLine();
		
		System.out.println("Hello " +name);
		System.out.println("You are " +age+ "years old");
		System.out.println("You live in " +area);

	}

}
