import java.util.Scanner;
public class resturant {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        food();
    }
    public static void food(){
        int totalBill=0;
        int pizzaPrice=8;
        int burgerPrice=5;
        while(true){
            System.out.println("Dooro.\n1.Burger($5)\n2.Pizza($8)\n3.Exit");
            int dooro=input.nextInt();
            if (dooro==1)
                totalBill+=burgerPrice;
            else if (dooro==2)
                totalBill+=pizzaPrice;
            else if (dooro==3)
                break;
            else
                System.out.println("Invalid");
        }
        System.out.println("Total bill is: $"+totalBill);
    }
}