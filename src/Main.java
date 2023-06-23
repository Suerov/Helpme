import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int num1 = a%10;
        int num2 = a/10%10;
        int num3 = a/100%10;
        System.out.println(num3+","+num2+","+num1);


    }
}