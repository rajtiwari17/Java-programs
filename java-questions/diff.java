import java.util.*; 
public class div {
    public static int product(int n, int y){
        int p=n*y;
        return p;
    }
    public static int sum(int n, int y){
        int s=n+y;
        return s;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers");
        int n=sc.nextInt();
        int y=sc.nextInt();
        int prod=product(n,y);
        int sm=sum(n,y);
        int difference=prod-sm;
        System.out.println(difference);
    }
    
}