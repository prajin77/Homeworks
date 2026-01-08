import java.util.Scanner;

class FunStudent {

    int a = 69;
    int b = 78;
    int c = 90;

    int total() {
        return a + b + c;
    }

    int percent() {
        return (a + b + c) / 3;
    }

    String result() {
        if (percent() >= 40)
            return "Pass";
        else
            return "Fail";
    }

    String grade() {
        int p = percent();

        if (p >= 75)
            return "A";
        else if (p >= 60)
            return "B";
        else if (p >= 40)
            return "C";
        else
            return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FunStudent std = new FunStudent();

        int e;

        do {
            System.out.println("\nEnter your Choice:");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");

            e = sc.nextInt();

            switch (e) {
                case 1:
                    System.out.println("Total = " + std.total());
                    break;

                case 2:
                    System.out.println("Percentage = " + std.percent());
                    break;

                case 3:
                    System.out.println("Result = " + std.result());
                    break;

                case 4:
                    System.out.println("Grade = " + std.grade());
                    break;

                case 5:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (e != 5);
    }
}
