package oopstask;

public class Check {

    
    void check(String a, char c) {
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                count++;
            }
        }

        System.out.println("Number of " + c + ": " + count);
    }

    // Display vowels
    void check(String s1) {
        s1 = s1.toLowerCase();

        System.out.println("Vowels:");

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                System.out.print(ch + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Check c = new Check();

        c.check("sucess", 's');
        c.check("computer");
    }
}
