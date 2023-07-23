import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countOfSingulars {
    public static int countSingular(int[] arrNum) {
        
        Map<Integer, Integer> Count = new HashMap<>();

    
        for (int Id : arrNum) {
            if (Count.containsKey(Id)) {
                Count.put(Id, Count.get(Id) + 1);
            } else {
                Count.put(Id, 1);
            }
        }

        
        int singularCount = 0;
        for (int count : Count.values()) {
            if (count == 1) {
                singularCount++;
            }
        }

        return singularCount;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        int[] arrNum = new int[size];
        for(int i =0;i<size;i++)
        {
            arrNum[i] = sc.nextInt();
        }

        int output = countSingular(arrNum);
        System.out.println("Total number of Singular socks = " + output);
    }
}
