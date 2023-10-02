import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AlphabetCheck {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is uppercase or lowercase");

        int letter = input.next().trim().charAt(0);

        if(letter >= 65 && letter < 90){
            System.out.println("UpperCase");
        }
        else{
            System.out.println("LowerCase");
        }
    }
}