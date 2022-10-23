import java.util.Scanner;
public class Scannerinput {


    public static void main(String []args){
        System.out.print("Enter New Name: ");
        Scanner reader = new Scanner(System.in);
        String userName = reader.nextLine();
        System.out.println("You UserName is : "+ userName);
    }
}
