import java.util.Scanner;
public class Q3 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine().trim();
        name = name.toLowerCase();
        name = name.replace('a','*');
        name = name.replace('e','*');
        name = name.replace('e','*');
        name = name.replace('i','*');
        name = name.replace('o','*');
        name = name.replace('u','*');
        System.out.println(name);

    }
}
