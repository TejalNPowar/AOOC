import java.util.*; 
 public class mergearray 
 { 
      public static void main(String args[]) 
      { 
           int m=5,n=5,k=0,i=0,j=0; 
           int a[]=new int[m]; 
           int b[]=new int[n]; 
           int c[]=new int[m+n]; 
           Scanner sc=new Scanner(System.in); 
           System.out.print("Enter the elements in array a: "); 
          for(i=0;i<5;i++) 
           { 
               a[i]=sc.nextInt(); 
           } 
            
   System.out.print("Enter the elements in array b: "); 
           for(j=0;j<5;j++) 
           { 
               b[j]=sc.nextInt(); 
           } 
  
           i=0;j=0; 
           while(i<m && j<n) 
           { 
               if(a[i]<b[j]) 
               { 
                    c[k]=a[i]; 
                    i++; 
                    k++; 
               } 
               else 
               { 
                    c[k]=b[j]; 
                    j++; 
                    k++; 
               } 
             
           } 
           while(i<m) 
           {
            c[k]=a[i]; 
               i++; 
               k++; 
           } 
           while(j<n) 
           { 
               c[k]=b[j]; 
               j++; 
               k++; 
           } 
           System.out.println(“Merged array:"); 
           for(i=0;i<k;i++) 
           { 
               System.err.print(c[i]+" "); 
           } 
      } 
 } 