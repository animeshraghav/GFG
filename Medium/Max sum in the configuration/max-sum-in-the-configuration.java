//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            System.out.println(new Solution().max_sum(arr, n));

            t--;
        }
    }
}

// } Driver Code Ends

class Solution {
    long max_sum(int a[], int n) {
        long s=0,cs=0;
        long ind;
        for(int i=0;i<n;i++){
            s+=a[i];
            ind=i;
            cs+=ind*a[i];
        }
        long ans=cs;
       int k=n-1;
       long N=n;
       while(k>0){
           cs=cs+s-(N*a[k]);
           ans=Math.max(ans,cs);
           k--;
       }
       
        return ans;

        
    }
    
}