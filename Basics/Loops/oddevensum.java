import java.util.Scanner;

public class oddevensum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oddsum=0;
        int evensum=0;
        int number;
        int choice;
        do{
            System.out.println("enter your number:");
            number =sc.nextInt();
            if(number%2==0){
                evensum+=number;
            } else{
                oddsum+=number;
            }
            System.out.println("Do you want to continue?? Press 1 for yes and 0 for no");
            choice = sc.nextInt();
        } while(choice==1);
        System.out.println("Sum of even numbers:" + evensum);
        System.out.println("Sum of odd numbers:" + oddsum);
        sc.close();
    }
}
