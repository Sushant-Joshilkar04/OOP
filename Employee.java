import java.util.Scanner;

class Company {
    protected String emp_name;
    protected int id;
    protected String address;
    protected String email;
    protected long phone;

    Scanner sc = new Scanner(System.in);

    public Company(String emp_name, int id, String address, String email, long phone) {
        this.emp_name = emp_name;
        this.id = id;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    
}

class Programmer extends Company {
    protected double basic_pay;

    public Programmer(String emp_name, int id, String address, String email, long phone, double basic_pay) {
        super(emp_name, id, address, email, phone);
        this.basic_pay = basic_pay;
    }
    
    
}

class TeamLead extends Company {
    protected double basic_pay;

    public TeamLead(String emp_name, int id, String address, String email, long phone, double basic_pay) {
        super(emp_name, id, address, email, phone);
        this.basic_pay = basic_pay;
    }
    
}

class AssistantProjectManager extends Company {
    protected double basic_pay;

    public AssistantProjectManager(String emp_name, int id, String address, String email, long phone, double basic_pay) {
        super(emp_name, id, address, email, phone);
        this.basic_pay = basic_pay;
    }
    
   
}

class ProjectManager extends Company {
    protected double basic_pay;

    public ProjectManager(String emp_name, int id, String address, String email, long phone, double basic_pay) {
        super(emp_name, id, address, email, phone);
        this.basic_pay = basic_pay;
    }
    
   
}


public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Programmer programmer = new Programmer("John Doe", 1001, "123 Main St", "john@example.com", 1234567890, 50000);
        TeamLead teamLead = new TeamLead("Alice Smith", 1002, "456 Elm St", "alice@example.com", 9876543210, 60000);
        AssistantProjectManager assistantProjectManager = new AssistantProjectManager("Bob Johnson", 1003, "789 Oak St", "bob@example.com", 5555555555, 70000);
        ProjectManager projectManager = new ProjectManager("Emily Brown", 1004, "101 Pine St", "emily@example.com", 7777777777, 80000);
        
       
        System.out.println("Programmer Details:");
        System.out.println("Name: " + programmer.emp_name);
        System.out.println("ID: " + programmer.id);
        System.out.println("Address: " + programmer.address);
        System.out.println("Email: " + programmer.email);
        System.out.println("Phone: " + programmer.phone);
        System.out.println("Basic Pay: " + programmer.basic_pay);
        
    }
}
