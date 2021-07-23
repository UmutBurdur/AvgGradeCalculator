import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creating variables
        int math, phy, che, tur, his, mus;

        Scanner scan = new Scanner(System.in);

        // Taking exam results as input
        System.out.print("Result of Mathematics exam: ");
        math = scan.nextInt();

        System.out.print("Result of Physics exam: ");
        phy = scan.nextInt();

        System.out.print("Result of Chemistry exam: ");
        che = scan.nextInt();

        System.out.print("Result of Turkish exam: ");
        tur = scan.nextInt();

        System.out.print("Result of History exam: ");
        his = scan.nextInt();

        System.out.print("Result of Music exam: ");
        mus = scan.nextInt();

        int total = (math + phy + che + tur + his + mus);
        double average = total / 6;
        System.out.println("Average of your exam results is: " + average );

        String pf = average >= 60 ? "Passed" : "Failed";
        System.out.println(pf);



    }


}
