package datastructure;

import java.util.Arrays;

/**
 * @author Wael M Elmahask
 */
public class CollectionMethods{


    public boolean isPalindromeString(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeString1(String text) {
        boolean is = false;
        if (text.charAt(0) == text.charAt(text.length() - 1)) {
            for (int i = 0, j = text.length() - 1; i < text.length() / 2; i++, j--) {
                System.out.println("i(" + i + ")" + text.charAt(i) + "  j(" + j + ")" + text.charAt(j));
                is = text.charAt(i) == text.charAt(j);
            }
        }
        return is;
    }

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }

    public boolean isPalindromeNumber(int number) {
        int r, sum = 0, temp;
        // int number = 454;//It is the number variable to be checked for palindrome  
        temp = number;
        while (number > 0) {
            r = number % 10;  //getting remainder  
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
            return true;
        } else {
            System.out.println("not palindrome");
            return false;
        }
    }

    public boolean isNumberPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;

        // Compute the reverse
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // The integer is palindrome if integer and reverse are equal
        return integer == reverse; // Improved by Peter Lawrey
    }

    public boolean isAnagram(String str1, String str2) {
        // Get lenghts of both strings 
        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same, 
        // tan they cannot be anagram 
        if (n1 != n2) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        // Sort both strings 
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted strings 
        for (int i = 0; i < n1; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            int wordLength = word.length();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }

    // function check whether  
    // a number is prime or not 
    private static boolean isPrime(int n) {
        // Corner case 
        if (n <= 1) {
            return false;
        }
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print primes 
    public static void printPrime(int n) {
        for (int me = 2; me <= n; me++) {
            if (isPrime(me)) {
                System.out.print(me + " ");
            }
        }
    }

    public String removeCharFromString(String str, char c) {
        if (str == null) {
            return null;
        }
        return str.replaceAll(Character.toString(c), "");
    }

    public boolean compare2String(String str1, String str2) {
        int compareTo = str1.compareTo(str2);
        if (compareTo == 0) {
            return true;
        }
        return false;
    }

    public char[] convertString2Char(String str) {
        if (str.isEmpty()) {

        }
        return str.toCharArray();
    }

    public int[] reverseArrayInteger(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[(arr.length - 1) - i];
        }
        return result;
    }

    public int[] reverseInTheSameArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public int sumArrayWithRecursion(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return (sumArrayWithRecursion(arr, n - 1) + arr[n - 1]);
    }

    public int factorialWithRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return factorialWithRecursion(n - 1) * n;
    }

    public int[] findMinMaxValue(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int[] minMax = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        minMax[0] = min;
        minMax[1] = max;
        System.out.println("min " + min);
        System.out.println("max " + max);
        return minMax;
    }

    public int[] sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int min = arr[j];
            int index = j;
            for (int i = j; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                    System.out.println("min " + min);
                }
            }
            int temp = arr[j];
            arr[j] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}
