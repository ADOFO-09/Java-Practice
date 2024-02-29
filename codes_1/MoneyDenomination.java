package codes_1;
import java.util.Scanner;

public class MoneyDenomination {
    public static void main(String[] args){
        int amount, twohund, onehund, fifty, twenty, ten, five, two, one, keep;
        Scanner scan = new Scanner(System.in);
        final String LINE = "===========================================";
        System.out.print("Enter amount of money GHC:");
        amount = scan.nextInt();
        keep = amount;
        twohund = amount / 200;
        amount = amount % 200;
        onehund = amount / 100;
        amount = amount % 100;
        fifty = amount / 50;
        amount = amount % 50;
        twenty = amount / 20;
        amount = amount % 20;
        ten = amount / 10;
        amount = amount % 10;
        five = amount / 5;
        amount = amount % 5;
        two = amount / 2;
        amount = amount % 2;
        one = amount;

        System.out.println("Denomination\tQty\tAmount");
        System.out.println(LINE);
        System.out.println("200\t\t"+twohund+"\t"+(twohund * 200));
        System.out.println("100\t\t"+onehund+"\t"+(onehund * 100));
        System.out.println("50\t\t"+fifty+"\t"+(fifty * 50));
        System.out.println("20\t\t"+twenty+"\t"+(twenty * 20));
        System.out.println("10\t\t"+ten+"\t"+(ten * 10));
        System.out.println("5\t\t"+five+"\t"+(five * 5));
        System.out.println("2\t\t"+two+"\t"+(two * 2));
        System.out.println("1\t\t"+one+"\t"+one);
        System.out.println(LINE);
        System.out.println(" \t\t \t"+ keep);
        System.out.println(LINE);

        scan.close();
    }
}
