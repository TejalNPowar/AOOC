import java.util.Scanner;

public class employee{
    String fn;
    String ln;
    float Msalary;

    void employee(){
        fn="Tejal";
        ln="Powar";
        Msalary=0.0f;
    }

    void getinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name:");
        fn=sc.nextLine();
        System.out.println("enter Last name:");
        ln=sc.nextLine();
        System.out.println("ENter monthly salary:");
        Msalary=sc.nextFloat();
    }

    void setinfo(){
        System.out.println("First name:" +fn);
        System.out.println("Last name:"+ln);
        System.out.println("Monthly salary:"+ Msalary);
    }

    void yearlySalary(){
        System.out.println("Yearly salary of "+fn+" "+ln+" is"+(12*Msalary));
    }
}

// public class EmployeeTest{
    
// }

class Emplo{
    public static void main(String args[]){
        employee emp = new employee();
        // EmployeeTest empTest = new empTest;

        emp.getinfo();
        emp.setinfo();
        emp.yearlySalary();
        // empTest.getinfo();
    }
}
