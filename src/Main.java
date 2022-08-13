import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static boolean isPalindrome(String word) {
        int length = word.length();
        // Двигаемся с обоих концов слова к серидине
        for (int i = 0; i < (length / 2); i++) {
            // Сравниваем символы попарно
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                // Если найдено несоответствие - слово не палиндром
                return false;
            }
        }
        return true;
    }

    static int numberOfSteps(int num) {
        int ans = 0;
        for (; num > 0; ans++)
            if (num % 2 == 1) num--;
            else num /= 2;
        return ans;
    }

    static String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
    //public String restoreString(String s, int[] indices) {
    //StringBuilder res = new StringBuilder(s);
    //for (int i = 0; i < indices.length; i++) {
    //  res.setCharAt(indices[i], s.charAt(i));
    //}
    //return res.toString();

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < word1.length; i++)
            s1 += word1[i];
        for (int j = 0; j < word2.length; j++)
            s2 += word2[j];
        return s1.equals(s2);
    }

    static int sumOddLengthSubarrays(int[] arr) {
        int result = 0;

        // i: j is the range of a sub-array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j += 2) {
                // iterate over sub-array
                for (int k = i; k < j; k++) {
                    result += arr[k];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        boolean h = isPalindrome("ABSA");
        System.out.println(h);

        int g = numberOfSteps(14);
        System.out.println(g);

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String s1 = restoreString(s, indices);
        System.out.println(s1);

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean k = arrayStringsAreEqual(word1, word2);
        System.out.println(k);

        int[] arr = {1,4,2,5,3};
        int rez = sumOddLengthSubarrays(arr);
        System.out.println(rez);

        int i=9;
        int j=4;
        int sum=i+j;
        int multiply=i*j;
        int subtract=i-j;
        int divide=i/j;
        int mod=i%j;
        System.out.println("The sum of the given numbers is "+sum);
        System.out.println("The result of multiplying the given numbers is "+multiply);
        System.out.println("The result of subtracting the given numbers is "+subtract);
        System.out.println("The division of the given numbers is "+divide);
        System.out.println("The remainder of dividing the given numbers is "+mod);
        System.out.println();

        System.out.print("Odd numbers from 1 to 20:: ");
        for (int x=1; x<21; x=x+2){
            if (x == 19){
                System.out.print(x+".");
                break;}
            System.out.print(x+",");}
        System.out.println();

        System.out.println();
        System.out.println("Let's take two variables: x=25 and y=10");
        System.out.println("And now you need to change the values \u200B\u200Bof the variables among themselves using the third variable");
        int x=25;
        int y=10;
        int temp=x;
        x=y;
        y=temp;
        System.out.println("Now x="+x+",and y="+y);
        System.out.println();

        System.out.println("Enter three different numbers of type int");
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        int max=0;
        if (a == b || a == c || b == c) {System.out.println("Enter all three numbers different!");}
        else if(a>b && a>c) {max=a;}
        else if (b>a && b>c) {max=b;}
        else if (c>a && c>b) {max=c;}
        System.out.println("The maximum of the entered numbers: "+max);

        System.out.println();
        System.out.println("Enter two numbers from -10 to 10");
        System.out.println("Enter the first number:");
        Scanner sca = new Scanner(System.in);
        int a1 = sca.nextInt();
        System.out.println("Enter the second number:");
        int b1 = sca.nextInt();
        if (a1>0) {System.out.println("The entered first number is positive");}
        else {System.out.println("The first number entered is negative");}
        if (b1>0) {System.out.println("The entered first number is positive");}
        else {System.out.println("The first number entered is negative");}

        System.out.println();
        String oldString = "ABC";
        String newString =  oldString.replace('A', 'B');
        System.out.println("Old string: " + oldString);
        System.out.println("New string: " + newString);

        System.out.println();
        int[] array = {10, 30, 20, 50, 40, 10};
        int sum1 = 0;
        // цикл для обхода каждого элемента массива
        for( int num : array) {
            // суммирование каждого элемента массива
            sum1 = sum1 + num;
        }
        System.out.println("The sum of the array elements is: " + sum1);

        System.out.println();
        int[] my_array = {
                100, 10, 20, 50, 70,
                40, 90, 30, 60, 80};
        System.out.println("Numeric array : "+Arrays.toString(my_array));
        Arrays.sort(my_array);
        int index = my_array.length-1;
        while(my_array[index]==my_array[my_array.length-1]){
            index--;}
        System.out.println("The second largest number in the array: " + my_array[index]);

    }
}