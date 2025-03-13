import java.util.*;
public class check{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("No is even.");
        }else{
            System.out.println("No is odd.");
        }
    }
}