import  java.util.Scanner;
public class marks {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        Marks();
    }
    public static void Marks(){

        int count=0;
        double avg=0;
        double totalmarks=0;
        while (true){
            System.out.println("Enter marks: Type -1 to stop.");
            double marks=input.nextDouble();
            if (marks==-1){
                break;
            } else if (marks>100||marks<0) {
                System.out.println("Invalid");
            }
            else {
                count++;
                totalmarks+=marks;
            }
        }
        if (count==0)
            System.out.println("by.");
        else {
            avg = totalmarks / count;
            System.out.println("Total marks is: " + totalmarks);
            System.out.println("Avg is: " + avg);
            if (avg >= 90)
                System.out.println("Grade is: A");
            else if (avg >= 80)
                System.out.println("Grade is: B");
            else if (avg >= 70)
                System.out.println("Grade is: C");
            else if (avg >= 60)
                System.out.println("Grade is: D");
            else if (avg >= 50)
                System.out.println("Grade is: E");
            else
                System.out.println("Fail");
        }
    }
}