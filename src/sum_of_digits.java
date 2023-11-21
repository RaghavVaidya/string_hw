import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum is "+sum);;
    }


}
