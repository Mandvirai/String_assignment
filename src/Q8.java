import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String :");
        String stringInput = s.nextLine();

        int upperCaseWeight = 0;
        for (int i = 0; i < stringInput.length(); i++) {
            if (stringInput.charAt(i) >= 'A' && stringInput.charAt(i) <= 'Z') {
                upperCaseWeight += (int) stringInput.charAt(i);
            }
        }

        System.out.println("UpperCaseWeight of input String :" + upperCaseWeight);
    }
}
