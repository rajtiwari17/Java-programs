import java.util.Scanner;

class Char1{

	public static void main(String[] args){

	System.out.println("Hello world");

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Character ");

	char ch = sc.next().charAt(0);

	System.out.println("Character is "+ch);


}

}