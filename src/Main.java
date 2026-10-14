import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String name = "Asma";
      int age = 19;

      System.out.println("my name is:" + name);
      System.out.println("my age is:+" + age);

      int num1 = 20;
      int num2 = 30;

      int result = num1 + num2;
      System.out.println(result);

      System.out.print("Enter your name:");
      String Name = input.nextLine();
      System.out.print(Name);

      System.out.print("Enter number1:");
      int number1 = input.nextInt();
      System.out.print("Enter number2:");
      int number2 = input.nextInt();
      if (number1 > 0 && number2 > 0) {
        int sum= number1+number2;
        System.out.println(sum);

        boolean check =true;
        int counter=0;
        while (check){
          System.out.print("enter name. type exit to stop ");
          String Cname= input.next();
          if(Cname.equalsIgnoreCase("exit")){
            break;
          }
          System.out.print("enter age");
          int Age= input.nextInt();
          input.nextLine();
          if (Age<0)
            System.out.println("invalid negative age");
          else {
            counter++;
            System.out.println("name is :"+name + "age is:"+ Age);




          }


        }


      }

      int[] Numbers={10,20,30,50};
      Random rand= new Random();
      int largest = Numbers[0];
      for(int j=0; j<Numbers.length; j++ )
        if(Numbers[j]>largest )
          largest=Numbers[j];
      System.out.print("Largest array element is:"+largest);





//      student();
    }
    public static void student() {
      Scanner input =new Scanner(System.in);
      boolean check = true;
      int counter = 0;
      while (check) {
        System.out.print("enter name. type exit to stop ");
        String Cname = input.next();
        if (Cname.equalsIgnoreCase("exit")) {
          break;
        }
        System.out.print("enter age");
        int Age = input.nextInt();
        input.nextLine();
        if (Age < 0)
          System.out.println("invalid negative age");
        else {
          counter++;
          System.out.println("name is :" + Cname + "age is:" + Age);
        }


      }
    }
}
