import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1,number2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        number1 = sc.nextInt();
        System.out.print("Enter Number2 : ");
        number2 = sc.nextInt();
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        if (number1==0 || number2==0){
            System.out.println("No Greatest Common Factor!");
        }
        while (number1 != number2){
            if (number1 > number2){
                number1 = number1-number2;
            }else {
                number2 = number2-number1;
            }
        }
        System.out.println("Greatest Common Factor is : "+ number1);
    }
}
