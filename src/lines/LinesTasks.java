package lines;

public class LinesTasks {

    public static void main(String[] args) {

    }


    /*Реализовать функцию capitalize, которая принимает массив символов str.
    Функция должна перевести первую букву каждого слова в заглавную,
    а остальные в нижний регистр. Слова разделяются пробельными символами (англ. "whitespace").*/

    public static void capitalize(char[] str) {
        boolean foundSpace = true;
        String message = String.valueOf(str).toLowerCase();
        for (int i = 0; i < str.length; i++) {
            if (Character.isLetter(str[i])) {
                str[i] = Character.toLowerCase(str[i]);
                if (foundSpace) {
                    str[i] = Character.toUpperCase(str[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        message = String.valueOf(str);
    }

    public static int compareTo(char[] str1, char[] str2) {
        int n = str1.length;

        for (int i = 0; i < n; i++) {
            if (str1[i] < str2[i]) {
                return -1; //list1 is smaller lexicographically
            }
            if (str1[i] > str2[i]) {
                return 1; //list2 is smaller lexicographically
            }
        }
        return 0;  //list1 and list2 are equal
    }

    public static boolean compare(char[] str1, char[] str2) {
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] < str2[i]) {
                return false;
            }
            if (str1[i] > str2[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] concat(char[] str1, char[] str2) {
        char[] concatChars = new char[str1.length + str2.length];
        int cont = 0;
        for (int i = 0; i < str1.length; i++) {
            concatChars[i] = str1[i];
            cont++;
        }
        for (int i = 0; i < str2.length; i++) {
            concatChars[cont++] = str2[i];
        }
        return concatChars;
    }

    public static boolean contains(char[] str, char[] substr) {
        int targetIndex = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == substr[targetIndex]) {
                targetIndex = targetIndex + 1;
                if (targetIndex == substr.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int findChar(char[] str, char c) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                return i;
            }
        }
        return -1;
    }

    /*Анаграмма - это слово или словосочетание, образованное путём перестановки букв,
    составляющих другое слово (или словосочетание).
    Примеры анаграмм: пила и липа, пост и стоп
    Реализовать функцию isAnagram, которая принимает массивы символов str1 и str2.
    Функция должна вернуть true, если строки являются анаграммами. Вернуть false в обратном случае.*/

    public static boolean isAnagram(char[] str1, char[] str2) {
        if (str1.length != str2.length) return false;
        java.util.Arrays.sort(str1);
        java.util.Arrays.sort(str2);
        return java.util.Arrays.equals(str1, str2);
    }


/*  Реализовать функцию isCapitalized, которая принимает массив символов str.
    Функция должна вернуть true, если каждое слово написано с большой буквы.
    Вернуть false в противоположном случае.*/

    public static boolean isCapitalized(char[] str) {
        char[] myChars = new char[str.length];

        for (int i = 0; i < str.length; i++) {
            myChars[i] = str[i];
        }
        capitalize(myChars);

        for (int i = 0; i < str.length; i++) {
            if (Character.isDigit(str[i])) {
                return false;
            } else {
                return compare(myChars, str);
            }
        }
        return false;
    }

    public static boolean isLetter(char c) {
        return c >= 65 && c <= 90 || c >= 97 && c <= 122;
    }

    public static boolean isLetterOrDigit(char c) {
        return c >= 65 && c <= 90 || c >= 97 && c <= 122 || c >= 48 && c <= 57;

    }

    public static boolean isLower(char c) {
        return c >= 97 && c <= 122;
    }

    public static boolean isNumeric(char c) {
        return c >= 48 && c <= 57;
    }

    /*Палиндром - это слово или фраза, которые одинаково читаются слева направо и справа налево.
    Пример: Я иду с мечем судия или топот
    Реализовать функцию isPalindrome, которая принимает массив символов str1.*/

    public static boolean isPalindrome(char[] str1) {
        String input = String.valueOf(str1);
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }

    public static boolean isUpper(char c) {
        return c >= 65 && c <= 90;
    }

    public static boolean isWhitespace(char c) {
        return c == 32 || c == 9 || c == 10;
    }


    /*Реализовать функцию parseInt, которая принимает массив символов str.
    Функция должна перевести строку в число int. Верните получившееся число.
    При тестировании, будут передаваться валидные числовые строки.

    Пример
    char[] str  = {'-','1','2','3'};

    int result = parseInt(str);

    System.out.println(result);
    -123       */

    public static int parseInt(char[] str) {
        int result = 0;
        int start = 0;
        boolean negative = false;

        if (str[0] == '-') {
            start = 1;
            negative = true;
        }

        for (int i = start; i < str.length; i++) {
            int digit = (int) str[i] - (int) '0';
            if ((digit < 0) || (digit > 9)) throw new NumberFormatException();
            result *= 10;
            result += digit;
        }

        if (negative) {
            result = -result;
        }
        return result;
    }

    public static void printAlphabet() {
        for (int i = 97; i <= 122; i++) {
            System.out.print(Character.toChars(i));
        }
    }

    public static void printReverseAlphabet() {
        for (int i = 122; i >= 97; i--) {
            System.out.print(Character.toChars(i));
        }
    }


    /* split string on whitespace characters
    for example

    char[] str  = {
            'o','n','e','\t',
            't','w','o',' ',
            't','h','r','e','e' };

      // one
      // two
      // three
    */

    public static char[][] split(char[] str) {
        int[] num = new int[str.length];
        int x = 1;
        int y = 1;
        int z = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ' || str[i] == '\t' || str[i] == '\n') {
                if (i != str.length - 1 && i != 0 && z != 0) {
                    y++;
                }
                z = 0;
            } else {
                z++;
            }
            if (x < z) x = z;
            if (z != 0) num[y - 1] = z;
        }
        char[][] result = new char[y][];
        for (int a = 0; a < y; a++) {
            result[a] = new char[num[a]];
        }
        y = 0;
        x = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ' || str[i] == '\t' || str[i] == '\n') {
                if (i != str.length - 1 && i != 0 && x != 0) y++;
                x = 0;
            } else {
                result[y][x] = str[i];
                x++;
            }
        }
        return result;
    }

    /*Реализовать функцию startsWith, которая принимает массивы символов str1 и with1.
    Функция должна вернуть true, если str1 начинается с with1.
    Вернуть false в противоположном случае.*/

    public static boolean startsWith(char[] str1, char[] with1) {
        int size = str1.length;
        for (int i = 0; i < size; i++) {
            if (str1[i] == with1[i]) {
                return true;
            } else return false;
        }
        return false;
    }

  /*  Реализовать функцию strlen, которая принимает массив символов word.
    Функция должна вернуть длину массива.*/

    public static int strlen(char[] word) {
        int size = 0;
        for (int i = 0; i < word.length; i++) {
            size++;
        }
        return size;
    }

    public static void toLowerCase(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] == (Character.toLowerCase(array[i]))))
                array[i] = Character.toLowerCase(array[i]);
        }
    }

    public static void toUpperCase(char[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toUpperCase(str[i]);
        }
    }


    /*Реализовать функцию trim, которая принимает массив символов str.
    Функция должна удалить все начальные и конечные пробельные символы (англ. "whitespace").*/

    public static char[] trim(char[] str) {
        for (int i = 0; i < str.length; i++) {
            if (Character.isLetterOrDigit(str[i])) {
                str[i] = str[i];
            }
        }
        return str;
    }




}
