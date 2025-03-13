import java.util.Scanner;

class employee{
    String fn;
    String ln;
    float Msalary;

    void employee(){
        fn="";
        ln="";
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

    void raisedSalary(){
        System.out.println("Yearly Salary after 10% raise :"+(Msalary*1.1)*12);
        System.out.println("");
        System.out.println("");
    }
}

class EmployeeTest{
    String fn;
    String ln;
    float Msalary;

    void EmpTest(){
        fn="abc";
        ln="xyz";
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

    void raisedSalary(){
        System.out.println("Yearly Salary after 10% raise :"+(Msalary*1.1)*12);
    }
}



class Emplo{
    public static void main(String args[]){
        employee emp = new employee();
        EmployeeTest empTest = new EmployeeTest();

        emp.getinfo();
        emp.setinfo();
        emp.yearlySalary();
        emp.raisedSalary();

        empTest.getinfo();
        empTest.setinfo();
        empTest.yearlySalary();
        empTest.raisedSalary();
    }
}
