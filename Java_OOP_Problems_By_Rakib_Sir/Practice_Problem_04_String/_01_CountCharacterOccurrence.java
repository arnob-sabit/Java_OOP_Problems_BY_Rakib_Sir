import java.util.Scanner;

public class _01_CountCharacterOccurrence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Enter the character: ");
        char a = scanner.next().charAt(0);

        int count = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == a){
                count++;
            }
        }

        System.out.println("The characters occurrence: " + count);
    }
}
