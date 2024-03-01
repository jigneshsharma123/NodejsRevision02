import java.util.*;

class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first integer: ");
            int a = sc.nextInt();
            System.out.println(a + " is the value entered by you");
        } catch (InputMismatchException e) {
            System.out.println(e);
            return;
        }
        return;
    }
}