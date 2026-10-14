import java.util.Scanner;
public class ticket {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        ticket();
    }
    public static void ticket(){
        double ticketCost=5;
        double totalcost=0;
        double npaseengers=0;
        double totalpassengers=0;
        while(true){
            System.out.println("Enter total passengers: Type 0 to stop.");
            npaseengers=input.nextDouble();
            if (npaseengers==0)
                break;
            else if (npaseengers<0)
                System.out.println("Invalid");
            else {
                totalcost+=npaseengers*ticketCost;
                totalpassengers+=npaseengers;
            }

        }
        if (totalpassengers>5){
            double discount=totalcost*0.1;
            totalcost-=discount;
            System.out.println("you got discount of: "+discount);
            System.out.println("Total cost is: "+totalcost);
        }
        else {
            System.out.println("Total cost is: "+totalcost);
        }

    }
}