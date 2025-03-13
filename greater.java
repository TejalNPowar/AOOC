import java.util.*;
public class greater{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter three no.:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.println("a is greater among three no.");
            }else{
                System.out.println("c is greater among three no.");
            }
        }else{
            if(b>c){
                System.out.println("b is greater among three no.");
            }else{
                System.out.println("c is greater among three no.");
            }
        }

    }
}