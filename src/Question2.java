import java.util.Scanner;

//2. Rewrite the student mark sheet programme using if else and while loop.
public class Question2 {
    String name;     // instance variable is declared.
    int rollNo, math, science, english;
    float total, percentage;

    public static void main(String[] args) {
        Question2 obj = new Question2();//object is created to bring instance variable into static area
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter student Name: ");
        obj.name = input.nextLine();
        System.out.println("Please enter roll number: ");
        obj.rollNo = input.nextInt();
        System.out.println("Please enter Math's marks: ");
        obj.math = input.nextInt();
        while (obj.math<0 || obj.math >100){ // to get marks in a req   uirement range, while loop used.
            System.out.println("Invalid Input, math's marks should be between 0 to 100");
            System.out.println("Please enter Math's marks again: ");
            obj.math=input.nextInt();
        }
        System.out.println("Please enter Science's marks: ");
        obj.science = input.nextInt();
        while (obj.science<0 || obj.science >100){
            System.out.println("Invalid Input, Science's marks should be between 0 to 100");
            System.out.println("Please enter Science's marks again: ");
            obj.science=input.nextInt();}
        System.out.println("Please enter English's marks: ");
        obj.english = input.nextInt();
        while (obj.english<0 || obj.english >100){
            System.out.println("Invalid Input, English's marks should be between 0 to 100");
            System.out.println("Please enter English's marks again: ");
            obj.english=input.nextInt();
        }
        obj.markSheet();
        input.close();// Scanner is closed

    }

    public void markSheet() {
        total = (math + science + english);
        percentage = total / 3;//marks is out of hundred and that is why to get percentage I just used 3 to divide the total of three subjects.



            System.out.println(" ___________________________________ ");
            System.out.println("|                                   |");
            System.out.println("|           Mark Sheet              |");
            System.out.println("|___________________________________|");
            System.out.println("|    Name        : " + name + "              |");
            System.out.println("|    Roll No     : " + rollNo + "               |");
            System.out.println("|___________________________________|");
            System.out.println("|    Subjects    :    Marks         |");
            System.out.println("|___________________________________|");
            System.out.println("|    Math        : " + math + "               |");
            System.out.println("|    Science     : " + science + "               |");
            System.out.println("|    English     : " + english + "               |");
            System.out.println("|___________________________________|");
            System.out.println("|    Total       : " + total + "             |");
            System.out.println("|___________________________________|");
            System.out.println("|    Percentage  : " + percentage + "             |");

            if (math >= 35 && science >= 35 && english >= 35) {
                System.out.println("|    Result      : Pass             |");
            } else {
                System.out.println("|    Result      : Fail             | ");
            }
            if (percentage >= 80) {
                System.out.println("|    Grade       : A+               |");

            } else if (percentage >= 60) {
                System.out.println("|    Grade       : B+               |");
            } else if (percentage >= 50) {
                System.out.println("|    Grade       : c+               |");
            } else if (percentage >= 35) {
                System.out.println("|    Grade       : D+               |");
            }
            System.out.println("|___________________________________|");
        }
        }


