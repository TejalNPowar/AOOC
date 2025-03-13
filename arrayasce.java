import java.util.*; 
 class arrayasce 
 { 
  public static void main(String args[]) 
  { 
   int i, j, temp; 
   a[]=new int [10]; 
   Scanner sc= new Scanner(System.in);   
   System.out.println(“Enter the array elements:”); 
   for(int I=0;i<=9;i++) 
   { 
    a[i]=sc.nextInt(); 
   } 
   for(int I=0;i<=9;i++) 
   {  
    for(j=1;j<=9;j++) 
    { 
     if(a[I]<a[j]) 
     { 
      temp=a[I]; 
      a[I]=a[j]; 
      a[j]=temp; 
     } 
    } 
   } 
   System.out.println(“Sorted Array :”); 
   for(int I=0;i<=9;i++) 
   { 
    System.out.print(a[I]);
   }
}
 }