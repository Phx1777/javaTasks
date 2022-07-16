package loops_and_recursion;

public class LoopsAndRecursionTasks {

    public static void main(String[] args) {

    }

    /*Реализуйте метод bruteforcePass, который вернет пароль соответстующий хеш-значению.

      Ограничения
      0 < длина оригинального пароля <= 5

      Sample Input:
      52663

      Sample Output:
      568   */

    public static String hashPass(String password) {
        int code = password.hashCode();
        String hashed = Integer.toString(code);
        return hashed;
    }

    public static String allowedChars = "0123456789";

    public static String result = "";

    public static void brute(int i, char[] chars, String hashedPass) {
        if (i == chars.length) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : chars) {
                stringBuilder.append(c);
            }
            if (hashPass(stringBuilder.toString()).equals(hashedPass)) {
                result = stringBuilder.toString();
            }
        } else {
            for (char next = '0'; next <= '9'; ++next) {
                chars[i] = next;
                brute(i + 1, chars, hashedPass);
            }
        }
    }

    public static void findPass(int i, String hashedPass) {
        char[] chars = new char[i];
        brute(0, chars, hashedPass);
    }

    public static String bruteforcePass(String hashedPass) {
        for (int i = 1; i < 6; ++i) {
            findPass(i, hashedPass);
        }
        return result;
    }

    ////

    public static void hanoiTower(int n) {
        int from = 1;
        int to = 3;
        int aux = 2;
        towerOfHanoi(n, from, to, aux);
    }


    static void towerOfHanoi(int n, int from_rod, int to_rod, int aux_rod) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Диск " + n + " с башни " + from_rod + " переложить в башню " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }


    public static int iterFactorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        if (n > 0 && n < Integer.MAX_VALUE) {
            for (int i = 1; i <= n; ++i) {
                result *= i;
            }
        }
        return result;
    }

    public static int recursiveFactorial(int n) {
        int result = 1;
        if (n == 0) return 1;
        if (n > 0 && n < Integer.MAX_VALUE) {
            result = n * recursiveFactorial(n - 1);
        }
        return result;
    }

    public static int iterFibonacci(int n) {
        int a = 0, b = 1, c;
        if (n > 0 && n < Integer.MAX_VALUE) {
            if (n <= 1) return n;
            for (int i = 2; i < n; ++i) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        return b;
    }

    public static int recursiveFibonacci(int n) {
        if (n == 1) return 0;
        if (n <= 2) return 1;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static boolean iterIsPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int iterPrime(int n) {
        int num = 1, count = 0, i;
        while (count < n) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count = count + 1;
            }
        }
        return num;
    }

    public static int recursiveGCD(int m, int n) {
        if (n != 0)
            return recursiveGCD(n, m % n);
        else
            return m;
    }

    public static int recursivePow(int a, int b) {
        if (b == 0) return 1;
        else return (a * recursivePow(a, b - 1));
    }

    public static void recursiveReversePrint(char[] c, int k) {
        k = c.length;
        if (k > 0) {
            System.out.print(c[c.length - 1]);
            char[] temp = new char[c.length - 1];
            System.arraycopy(c, 0, temp, 0, temp.length);

            recursiveReversePrint(temp, k);
        }
    }

}
