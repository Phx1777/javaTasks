package array;

public class ArraysTasks {
    public static void main(String[] args) {

    }

    public static boolean equal(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) return false;
            }
            return true;
        }
        return false;
    }

    public static void ingredientAt(String[] s, int i) {
        try {
            System.out.println(s[i]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("");
        }
    }

    public static String[] ingredientEdit(String[] s, int i, String v) {
        String[] newArray = new String[s.length];
        for (int j = 0; j < newArray.length; j++) {
            newArray[j] = s[j];
            newArray[i] = v;
        }
        return newArray;
    }

    public static int[] join(int[] array1, int[] array2) {
        int[] joined2Arrays = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            joined2Arrays[i] = array1[i];
            count++;
        }
        for (int j : array2) {
            joined2Arrays[count++] = j;
        }
        return joined2Arrays;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int j : array) {
            if (max <= j) {
                max = j;
            }
        }
        return max;
    }

    public static int mean(int[] array) {
        //int sum = 0;
        //for (int i : array) {
        //   sum += i;
        //}
        //return sum / array.length;
        int avg = 0;
        int sum = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            avg = sum / array.length;
        }
        return avg;
    }

    public static int median(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        int median;
        if (array.length == 0) return 0;
        if (array.length % 2 == 0) {
            return array[(int) Math.ceil((double) array.length / 2) - 1];
        } else {
            median = array[array.length / 2];
        }
        return median;
    }

    public static int min(int[] array) {
        if (array.length == 0) return 0;

        int min = array[0];

        for (int i = 0; i < array.length; i++) if (array[i] < min) min = array[i];

        return min;
    }

    /*Дается два массива чисел, вернуть числа из второго массива,
    которые не присутствуют в первом в отсортированном порядке.*/

    public static int[] missYou(int[] array1, int[] array2) {
        int[] newArray;
        int k = 0;
        int sizeNewArray = 0;

        for (int value : array2) {
            int j;
            for (j = 0; j < array1.length; j++) {
                if (value == array1[j]) {
                    break;
                }
            }
            if (j == array1.length) {
                sizeNewArray++;
            }
        }
        newArray = new int[sizeNewArray];

        for (int value : array2) {
            int j;
            for (j = 0; j < array1.length; j++) {
                if (value == array1[j]) {
                    break;
                }
            }
            if (j == array1.length) {
                newArray[k] = value;
                k++;
            }
        }
        java.util.Arrays.sort(newArray);
        return newArray;
    }

    /*Дается массив чисел, найти в массиве такой элемент,
    где сумма чисел слева равна сумме чисел справа.
    Если такое число есть, то вернуть true, в противном случае false.*/

    public static boolean perfectlyBalanced(int[] array) {
        int right = 0, left = 0;
        for (int i = 1; i < array.length; i++)
            right += array[i];

        for (int i = 0, j = 1; j < array.length; i++, j++) {
            right -= array[j];
            left += array[i];

            if (left == right)
                return true;
        }
        return false;
    }

    public static int[] range(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] rangeMinMax(int[] array, int min, int max) {
        int size = 0;
        for (int k : array) {
            if (k >= min && k <= max) {
                size = size + 1;
            }
        }
        int[] newArray = new int[size];
        int j = 0;
        for (int k : array) {
            if (k >= min && k <= max) {
                newArray[j] = k;
                j++;
            }
        }
        return newArray;
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    public static int[] slice(int[] array, int from, int to) {
        int size = to - from;
        int[] part = new int[size];
        for (int i = 0; i < part.length; i++) {
            part[i] = array[from + i];
        }
        return part;
    }

    public static void sort(int[] array) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            for (int j = 1; j < arraySize - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void stockBuy(int m, int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] + array[j] == m) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int data : array) {
            sum += data;
        }
        return sum;
    }

    public static void swap(int[] array, int i, int j) {
        try {
            int k = array[i];
            array[i] = array[j];
            array[j] = k;
        } catch (ArrayIndexOutOfBoundsException e) {
            Exception ignore;
        }
    }

}
