import java.util.Scanner;

class Comapny{
    protected String emp_name;
    protected int id;
    protected String address;
    protected String email;
    protected long phone;

    Scanner sc = new Scanner (System.in);

    public void get_data(){
        System.out.println("Enter Name: ");
        this.emp_name=sc.next();
        System.out.println("Enter ID: ");
        this.id=sc.nextInt();
        System.out.println("Enter Email id");
        this.email=sc.next();
        System.out.println("Enter Address: ");
        this.address=sc.next();
        System.out.println("Enter Mobile Number: ");
        this.phone=sc.nextLong();
    }

    public void generatePaySlip(double sal){
        System.out.println("Pay Slip");
        System.out.println("Name: "+this.emp_name);
        System.out.println("ID: "+this.id);
        System.out.println("E-mail: "+this.email);
        System.out.println("Address: "+this.address);
        System.out.println("Mobile Number: "+this.phone);
        double da=0.97*sal;
        double hra=0.1*sal;
        double pf=0.12*sal;
        double fund=0.001*sal;
        System.out.println("Gross salary: "+(sal + da + hra));
        System.out.println("Net Salary= "+(sal + da + hra-(pf +fund)));

    }

}

class Programmar extends Comapny{
    double salary;
public Programmar(){
    get_data();
    System.out.println("Enter Salary Amount: ");
    salary=sc.nextFloat();
}

}

class Team_lead extends Comapny{
    double salary;
    public Team_lead(){
        get_data();
        System.out.println("Enter Salary Amount: ");
        salary=sc.nextFloat();
    }
}

class Assistant_Project_Manager extends Comapny{
    double salary;
    public Assistant_Project_Manager(){
       get_data();
        System.out.println("Enter Salary Amount: ");
        salary=sc.nextFloat();
    }
}

class Project_Manager extends Comapny{
    double salary;
    public Project_Manager(){
        get_data();
        System.out.println("Enter Salary Amount: ");
        salary=sc.nextFloat();
    }
}


public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans;

        do{
        System.out.println("Enter your choice:\n1. Programmer salary\n2.Team Lead salary\n3.Assistant Project Manager salary\n4.Project Manager salary");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Programmar programmer = new Programmar();
                programmer.generatePaySlip(programmer.salary);
                break;
            case 2:
                Team_lead teamLead = new Team_lead();
                teamLead.generatePaySlip(teamLead.salary);
                break;
            case 3:
                Assistant_Project_Manager assistantProjectManager = new Assistant_Project_Manager();
                assistantProjectManager.generatePaySlip(assistantProjectManager.salary);
                break;
            case 4:
                Project_Manager projectManager = new Project_Manager();
                projectManager.generatePaySlip(projectManager.salary);
                break;
            default:
                System.out.println("Enter Correct Choice!");
        }

        System.out.println("do you want to continue (yes=1)");
        ans=sc.nextInt();
    }while(ans==1);
        System.out.println("Thank You!");
    }
}
