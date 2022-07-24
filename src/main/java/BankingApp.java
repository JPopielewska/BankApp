import java.util.Scanner;


public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w aplikacji bankowej");
        int inputNumber;
        do {
            System.out.println("Co chcesz zrobić? \n 1. Pokaż informacje o koncie \n 2. Wpłata gotówki \n 3.Wypłata \n 4. Wyjście");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    System.out.println("Działa");
                    break;
            }
        }
        while(inputNumber != 4);
    }


}
