/*Question 2: Find missing numbers in array -

Skill Mapping: Basic

Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

Sample input: arrNum = {1, 2, 4, 5, 6}

Output: 3

Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}

Output: 4, 7, 9, 12, 13
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        int[] arrNum = new int[size];
        for(int i =0;i<size;i++)
        {
            arrNum[i] = sc.nextInt();
        }
        int[] missingNumbers = findMissingNumbers(arrNum);
        System.out.println(Arrays.toString(missingNumbers));
    }

    private static int[] findMissingNumbers(int[] arrNum) {
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < arrNum.length - 1; i++) {
            if (arrNum[i + 1] - arrNum[i] > 1) {
                int diff = arrNum[i + 1] - arrNum[i];
                for (int j = 1; j < diff; j++) {
                    missingNumbers.add(arrNum[i] + j);
                }
            }
        }
        return missingNumbers.stream().mapToInt(i -> i).toArray();
    }
}


    

