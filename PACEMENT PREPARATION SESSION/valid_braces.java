import java.util.Scanner;

class valid_braces {

    boolean ValidateBraces(String s) {
        String y = s;
        int zz = y.length();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < zz; i++) {
            if (y.charAt(i) == '{' || y.charAt(i) == '}') {
                a++;
            }
            if (y.charAt(i) == '(' || y.charAt(i) == ')') {
                b++;
            }
            if (y.charAt(i) == '[' || y.charAt(i) == ']') {
                c++;
            }
        }

        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) { 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String x = sc.next();
        valid_braces obj = new valid_braces();
        boolean z = obj.ValidateBraces(x);
        if (z == true) {
            System.out.println("The String has valid pair of braces");
        } else {
            System.out.println("The String has invalid pair of braces");
        }
    }
}

