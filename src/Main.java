import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {


//            System.out.println("i = " + i);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int nr = scanner.nextInt();
        int silnia = 1;
        for(int i =1; i<=nr; i++){
            silnia*=i;
        }
        System.out.println("Silnia wynosi:" + silnia);




    }
}