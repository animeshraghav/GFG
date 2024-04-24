//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            List<String> dict = new ArrayList<String>();
            for(int i = 0;i < n;i++)
                dict.add(arr[i]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            List<String> ans = new ArrayList<String>();
            ans = ob.wordBreak(n, dict, s);
            if(ans.size() == 0)
                System.out.println("Empty");
            else{
                List<String> sol = ans.stream().sorted().collect(Collectors.toList());
                for(int i = 0;i < sol.size();i++)
                    System.out.print("("+sol.get(i)+")");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution{
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
   trav(s,0,s.length(),"",dict);
        List<String> h=new ArrayList<>(l);
        l.clear();
        return h;
  
    }
static List<String> l=new ArrayList<>();

    static void trav(String s,int i,int n,String g,List<String> d){
        if(i==n){
            l.add(g);
            return ;
        }
        for(int j=i;j<n;j++){
            String h=s.substring(i,j+1);
            if(d.contains(h)){
               String q=g.length()>0?g+" "+h:g+""+h;
                trav(s,j+1,n,q,d);
            }
            
        }
        
       
    }
}