public class Q1{
    public static void main(String[] args){
        String name = "Hello";
        System.out.println("index:"+" ");
        for(int i = 0; i < name.length();i ++) {
            System.out.printf("%d\t", i);
        }
        System.out.println("\n");
        System.out.println("chars:"+" ");
        char ch[] = name.toCharArray();
        for(int i = 0;i < ch.length;i ++){
            System.out.printf("%C\t",ch[i]);
        }
    }
}