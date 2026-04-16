1) Read a single Digit Number and write in word : 


import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) System.out.println("Zero");
        else if (num == 1) System.out.println("One");
        else if (num == 2) System.out.println("Two");
        else if (num == 3) System.out.println("Three");
        else if (num == 4) System.out.println("Four");
        else if (num == 5) System.out.println("Five");
        else if (num == 6) System.out.println("Six");
        else if (num == 7) System.out.println("Seven");
        else if (num == 8) System.out.println("Eight");
        else if (num == 9) System.out.println("Nine");
        else System.out.println("Invalid");
    }
}


2) Read a Number 1,10,100,1000 and display unit, ten hundred :


import java.util.Scanner;

public class NumberCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 1) System.out.println("Unit");
        else if (num == 10) System.out.println("Ten");
        else if (num == 100) System.out.println("Hundred");
        else if (num == 1000) System.out.println("Thousand");
        else System.out.println("Invalid");
    }
}
