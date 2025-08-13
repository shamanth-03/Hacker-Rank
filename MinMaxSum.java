import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        //long sum=0;
        Collections.sort(arr);
        // int sum_a=0;
        // int sum_b=0;
        // int max=0;
        // for(int i=0; i<=arr.size()-1; i++){
        //     if(i!=0){
        //         sum_a +=arr.get(i);
        //     }
        //     if(arr.size()-1!=i){
        //         sum_b +=arr.get(i);
        //     }
        // }
        // System.out.println(sum_b+" "+sum_a);
        long sum=0;
        for(int i=0; i<arr.size(); i++){
            sum += arr.get(i);
        }
        System.out.println(sum-arr.get(arr.size()-1)+" "+(sum-arr.get(0)));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
