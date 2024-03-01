import java.util.Scanner;
import java.util.Math;

class Practise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check it is ARMSTRONG NUMBER")
		
		int n = sc.nextInt();
		int res = 0;
		
		while(n > 0){
			int temp = n%10;
			res += Math.pow(temp,3);
			n = n/10;
		}

		if(res == n){
			System.out.println("Number is ARMSTRONG NUMBER");
		}
		else{
		System.out.println("Number is ARMSTRONG NUMBER");
		}

	
}


}