import java.util.Scanner;
class Prime{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a NUMBER");
	boolean temp = false;

	int num = sc.nextInt();
	for(int i = 2;i<num;i++){
		if(num%i == 0){
		System.out.println("Number is not Prime");
		temp = true;
		break;
	}
}

	if(temp == true){
	System.out.println("Number is PRIME NUMBER");

	}
}
}