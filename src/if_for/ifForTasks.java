package if_for;

public class ifForTasks {

    public static void main(String[] args) {

    }

    public static double calcDeposit(int n, int k, int b) {
        double result = b;
        for (int i = 0; i < n; i++) {
            result += result * k / 100;
        }
        return result;
    }

    public static void checkOverflowInt(int a, int b) {
        if (Integer.MAX_VALUE < (long) a + b || Integer.MIN_VALUE > (long) a + b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int countLeapYear(int n) {
        return (n / 4) - (n / 100) + (n / 400);
    }

    public static void divAndMod(int a, int b) {
        System.out.println(a / b + " " + a % b);
    }

    public static boolean doublePrecision(double a, double b, double c) {
        return Math.abs((a + b) - c) < 0.0001;
    }

    public static int intCmp(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a == b) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void lastDigit(int a) {
        int lastDigit = a % 10;
        System.out.println(lastDigit);
    }

    public static void tenDigit(int a) {
        System.out.println(a / 10 % 10);
    }

    public static int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int pow(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a * pow(a, b - 1);
        }
    }

    public static void printEven(int a, int b) {
        if (!(a % 2 == 0)) a++;
        for (int i = a; i <= b; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void sortNumsThree(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = -Math.max(-a, Math.max(-b, -c));
        int mid = (a + b + c) - (max + min);

        System.out.printf("%d %d %d", min, mid, max);
    }

    public static int sqrSum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            int sum = i * i;
            result += sum;
        }
        return result;
    }

    public static int sum1n(int a) {
        if (a == 1) return 1;
        return a + sum1n(a - 1);
    }

    public static int swapBits(int a) {
        a = (a & 0x0F) << 4 | (a & 0xF0) >> 4;
        return a;
    }

}
