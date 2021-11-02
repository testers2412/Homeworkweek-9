import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Calculator obj= new Calculator();
        char ch;
        do {

            Scanner sc= new Scanner(System.in);
            System.out.print("Please enter first number ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Please enter second number ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.print("Please enter the one of the calculation symbol ");
            String s = sc.nextLine();
            char c = s.charAt(0);
            obj.calculateResult(a,b,c);
            System.out.println("If you want to do more calculation then enter 'Y' else enter 'N' ");
            String e = sc.nextLine();
             ch = e.charAt(0);
        }while (ch=='Y' || ch=='y');

    }



}
