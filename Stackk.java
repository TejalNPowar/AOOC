import java.util.*;
class Stack{
  int size=5;
  int ele,top,i;
  int stk[]=new int[size];
  
  Stack(){
    top=-1;
  }
  void push(){
    if(top==size-1){
       System.out.println("Stack is full.");
    }else{
        Scanner sc = new Scanner(System.in);
        ele=sc.nextInt();
       top++;
       stk[top]=ele;		
    }
  }

  void pop(){
    if(top==-1){
	System.out.println("OOPS..!Stack is empty.");
    }else{
        ele=stk[top];
        top--;
        System.out.println("Popped element:" +ele);
    }
  }

   void display(){
      System.out.println("Stack elements are: ");
      for(int i=top;i>=0;i--){
         System.out.print(i+" ");
      }
   }

   public static void main(String args[]){
    Stack s=new Stack();
    int choice;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your choice: ");
    choice=sc.nextInt();
    do{
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.display");

        switch(choice){
            case 1: s.push();
                    break;
            case 2: s.pop();
                    break;
            case 3: s.display();
                    break;
    }while(choice!=3)
    
    

    }
  }
}


