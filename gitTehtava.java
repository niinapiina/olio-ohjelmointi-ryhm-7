import java.util.Scanner;

public class gitTehtava {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int input1 = 0;
        int input2 = 0;
        int operaatio;

        System.out.println("Tämä on yksinkertainen laskin, jolla voit laskea plus, miinus ja kertolaskuja."
        + "Syötä ensin kaksi numeroa, joilla haluat laskea.");
        System.out.println("Ensimmäinen luku: ");
        input1 = Integer.parseInt(in.nextLine());
        System.out.println("Toinen luku: ");
        input2 = Integer.parseInt(in.nextLine());
        System.out.println("Valitse operaatio valitsemalla numero: \n1: Pluslasku \n2: Miinuslasku \n3: Kertolasku \n4: Jakolasku");
        operaatio = Integer.parseInt(in.nextLine());
        while (operaatio < 1 || operaatio > 4) {
            System.out.println("Virhe");
            System.out.println("Valitse operaatio valitsemalla numero: \n1: Pluslasku \n2: Miinuslasku \n3: Kertolasku \n4: Jakolasku");
            operaatio = Integer.parseInt(in.nextLine());
        }

    }
}