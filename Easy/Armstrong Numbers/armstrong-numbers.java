//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String armstrongNumber(int n) {
        // Aditya Konda
        int m=n; int r; double sum=0;
        while(n!=0){
            r=n%10;
            n/=10;
            sum=sum+Math.pow(r,3);
        }
        if(sum==m){
            return ("true");
        } else{
            return ("false");
        }
    }
}