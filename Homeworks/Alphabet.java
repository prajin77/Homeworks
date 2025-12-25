import java.util.Scanner;

class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Letter :");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("This letter is an Alphabet");
        } else {
            System.out.println("This is not an Alphabet");
        }

        sc.close();
    }
}
