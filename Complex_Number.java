import java.util.Scanner;

public class Complex {
    float real,img;
    Complex(){
        real=0;
        img=0;
    }

    Complex(float num1,float num2){
        real=num1;
        img=num2;
    }

    public static void add(Complex obj1,Complex obj2){
        float n1,n2;
        n1=obj1.real+obj2.real;
        n2=obj1.img+obj2.img;
        System.out.println("Answer is: "+n1+"+i"+n2);
    }

    public static void subtract(Complex obj1,Complex obj2){
        float n1,n2;
        n1=obj1.real-obj2.real;
        n2=obj1.img-obj2.img;
        System.out.println("Answer is: "+n1+"+i"+n2);
    }
    public static void mul(Complex obj1,Complex obj2){
        float n1,n2;
        n1=(obj1.real*obj2.real)-(obj1.img*obj2.img);
        n2=(obj1.real*obj2.img)+(obj1.img*obj2.img);
        System.out.println("Answer is: "+n1+"+i"+n2);
    }
    public static void div(Complex obj1,Complex obj2){
        double n1,n2;
        n1=((obj1.real*obj2.real)+(obj1.img*obj2.img))/((Math.pow(obj2.real,2.0))-(Math.pow(obj2.img,2.0)));
        n2=(obj2.real*obj1.img-obj1.real*obj2.img)/((Math.pow(obj2.real,2.0))-(Math.pow(obj2.img,2.0)));
        System.out.println("Answer is: "+n1+"+i"+n2);
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        float num1,num2;

        Complex answer = new Complex();
        System.out.println("Enter First Complex Number: ");
        System.out.println("Enter Real Number");
        num1 = sc.nextFloat();
        System.out.println("Enter Imaginary Number");
        num2 =  sc.nextFloat();
        Complex obj1 = new Complex(num1,num2);

        System.out.println("Enter Second Complex Number: ");
        System.out.println("Enter Real Number");
        num1 = sc.nextFloat();

        System.out.println("Enter Imaginary Number");
        num2 =  sc.nextFloat();
        Complex obj2 = new Complex(num1,num2);

        System.out.println("Enter your choice \n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
        choice= sc.nextInt();

        switch (choice){
            case 1:answer.add(obj1,obj2);
            break;
            case 2:answer.subtract(obj1,obj2);
            break;
            case 3:answer.mul(obj1,obj2);
            break;
            case 4:answer.div(obj1,obj2);
            break;
            default:
                System.out.println("Wrong Choice");
        }



    }
}


