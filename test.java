import java.util.Scanner;
public class test {    
    public static void main(String[] args) {
        String a = "abc";
        //String b = "abc";
        Scanner input = new Scanner(System.in);
        String b = input.next(); 
        System.out.println(a==b);
    }
}
