import  java.util.Scanner;
public class Accumalater {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        supermarket();
    }
    public static void supermarket(){
        double totalprice=0;
        int accumalater=0;
        while (true){
            System.out.println("Enter Price of item "+(accumalater+1)+": Type 0 to stop.");
            double price=input.nextDouble();
            if (price==0)
                break;
            else if (price<0)
                System.out.println("invalid");
            else
                totalprice+=price;
        }
        double discount=0;
        if (totalprice>100){
            discount=totalprice*0.1;
            totalprice-=discount;
        }
        System.out.println("You got discount of: "+discount);
        System.out.println("total price is: $"+totalprice);
    }
}
