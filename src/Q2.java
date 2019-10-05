import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine().trim();
        int a = in.nextInt();
        System.out.println(name.substring(a));
    }
}
