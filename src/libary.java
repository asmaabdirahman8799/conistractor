import java.util.Scanner;
public class libary {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        Book();
    }
    public static void Book(){


        int counter=0;
        int accumalter=0;
        while(true){
            if (counter==3){
                System.out.println("You reached 3 books.");
                break;
            }
            System.out.println("Enter book  "+(accumalter+1)+" name : Type 'stop' to stop.");
            String books=input.nextLine();
            if (books.equals("stop"))
                break;
            counter++;
            accumalter++;
        }

        if (counter==0)
            System.out.println("Invalid");
        else
            System.out.println("total books are: "+counter);
    }
}

