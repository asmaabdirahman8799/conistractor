import  java.util.Scanner;
public class hospital{
    public static void main(String[] args) {
        hospital();
    }
    static Scanner input=new Scanner(System.in);
    public static void hospital(){
        boolean name=true;
        int counter=0;
        while (name){
            System.out.println("Enter patiant name .Type exit to stop.");
            String names=input.nextLine();
            if (names.equals("exit"))
                break;
            else{
                System.out.println("Enter patient age: ");
                int age=input.nextInt();
                input.nextLine();
                if (age<0)
                    System.out.println("Invalid. Negative age");
                else {
                    counter++;
                    System.out.println("patient name is " + names + " and " + age + " years old");
                }
            }

        }
        System.out.println("total patients are: "+counter);
    }
}
