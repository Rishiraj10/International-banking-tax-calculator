import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
    Scanner tax = new Scanner(System.in);
    System.out.print("ENTER YOUR TOTAL AMOUNT(IN INR):- "); float AMOUNT = tax.nextFloat(); System.out.print("Your Tax Amount is:- "); System.out.print(AMOUNT*4/100); System.out.println(" INR");
    System.out.print("Your Final Amount is:- "); System.out.print(AMOUNT*4/100+AMOUNT); System.out.print(" INR");
    // System.out.print("Your Final Amount is:- "); System.out.println(taxee);
    }
}
