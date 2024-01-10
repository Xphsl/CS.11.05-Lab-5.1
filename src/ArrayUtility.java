import java.lang.Math;
public class ArrayUtility {

    public static void print(int[] array) {
        System.out.print(array);
    }

    public static int sum(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++){
            result += array[i];
        }

        return result;

    }

    public static double average(int[] array) {
        double result = 0;
        double mean = array.length;
        double average = 0;

        for (int i = 0; i < mean; i++){
            average += array[i];
        }

        result = average/mean;
        result *= 100;
        result = Math.floor(result);
        result /= 100;


        return result;
    }


    public static int minimum(int[] array) {
        int min = 99999999;
        for (int i = 0; i < array.length; i++){
            if (array[i]<min){
                min = array[i];
            }
        }

        return min;
    }


    public static int maximum(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }

        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        int counting = 0;
        for (int i : array){
            if (array[counting]%2==0){
                count++;

            }
            counting++;
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int result[] = new int[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[count] = array[i];
            count++;
        }
        return result;
    }

    public static void reverseTwo(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

    }

    public static boolean linearSearchInt(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (str.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i =0; i<array.length; i++){
            array[i]*=2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i =0; i<array.length; i++){
            array[i]*=n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int i = 0; i<array.length; i++){
            if (i!=array.length-1) {
                result += array[i] + ", ";
            }
            else{
                result += array[i];
            }
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {

        for (int i = 0; i<array.length; i++){
            int test = array[i];
            for (int x =0; x<array.length; x++){
                if (array[x]+test==num&&x!=i){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int lastelement = array[array.length-1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }

        array[0] = lastelement;
    }

    public static void shiftLeft(int[] array) {
        int firstelement = array[0];
        for (int i = 1; i < array.length; i++){
            array[i-1] = array[i];
        }
        array[array.length-1] = firstelement;

    }

    public static void shiftRightNTimes(int[] array, int n) {

        int shiftAmount = n % array.length;

        for (int shift = 0; shift < shiftAmount; shift++) {
            int lastElement = array[array.length - 1];

            for (int i = array.length - 2; i >= 0; i--) {
                array[i + 1] = array[i];
            }

            array[0] = lastElement;
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int shiftAmount = n % array.length;

        for (int shift = 0; shift < shiftAmount; shift++) {
            int firstElement = array[0];

            for (int i = 1; i < array.length; i++) {
                array[i - 1] = array[i];
            }

            array[array.length - 1] = firstElement;
        }
    }
}