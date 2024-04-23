//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends

class Solution {
    public static int minChar(String s) {
        int n = s.length();
        int count = 0;
        int i = 0, j = n-1;
        
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                if(i == 0) j--;
                else i--;
                count++;
            }
        }
        
        return count;
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main(String[] args) throws IOException
	{
	    var sc = new FastReader();
	    int test = sc.nextInt();
	    while(test-->0){
    		String s = sc.nextString();
    		System.out.println(Solution.minChar(s));
	    }
	}
    
    public static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		private void read() throws IOException
		{
			st = new StringTokenizer(br.readLine());
		}

		public String nextString() throws IOException
		{
			while(!st.hasMoreTokens())
				read();
			return st.nextToken();
		}

		public int nextInt() throws IOException
		{
			return Integer.parseInt(nextString());
		}

		public long nextLong() throws IOException
		{
			return Long.parseLong(nextString());
		}
	}
}
// } Driver Code Ends