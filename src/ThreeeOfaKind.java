import java.util.Random;
import java.util.Scanner;
public class ThreeeOfaKind{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        Random rnd = new Random();
        String again = "y";

        do{

        int die1, die2, die3, tries, sum;

        die1 = rnd.nextInt(6) + 1;
        die2= rnd.nextInt(6) + 1;
        die3 = rnd.nextInt(6) + 1;
        tries = 1;

        System.out.printf("%5s\t%3s\t%3s\t%3s\t%3s\n",
                "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("-------------------------------------");

            sum = die1 + die2 + die3;
            System.out.printf("%5d\t%3d\t%3d\t%3d\t%3d\n",
                    tries, die1, die2, die3, sum);

        while(die1 != die2 || die2 != die3){
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            tries++;
            sum = die1 + die2 + die3;
            System.out.printf("%5d\t%3d\t%3d\t%3d\t%3d\n", tries, die1, die2, die3, sum);
        }

        System.out.print("\nRoll again? (y/n): ");
        again = kb.nextLine();
        System.out.println();
        }while (again.equals("y"));
    }
}
