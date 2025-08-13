import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String res="";
        if(s.charAt(8) == 'A' && s.substring(0,2).equals("12")){
            res = "00"+s.substring(2,8);
        }
        else if(s.charAt(8)=='A'){
            res = s.substring(0,8);
        }
        else if(s.charAt(8)=='P' && s.substring(0,2).equals("12")){
            res = s.substring(0,8);
        }
        else{
            int newt = 12 + Integer.parseInt(s.substring(0,2));
            res = newt + s.substring(2,8);
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
