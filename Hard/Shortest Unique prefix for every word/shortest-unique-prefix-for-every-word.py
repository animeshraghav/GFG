#User function Template for python3

class Solution:
   def findPrefixes(self, arr, N):
        # code here
        visited={}
        mapp={}
        temp=arr[:]
        temp.sort()
        for i in range(N-1):
            word1=temp[i]
            word2=temp[i+1]
            i=0
            j=0
            s=""
            while i<len(word1) and j<len(word2) and word1[i]==word2[j]:
                s+=word1[i]
                i+=1
                j+=1
                visited[s]=True
            while i<len(word1):
                s+=word1[i]
                if s not in visited.keys():
                    mapp[word1]=s
                    visited[s]=True
                    break
                i+=1
        lastword=temp[-1]
        s=""
        i=0
        while i<len(lastword):
            s+=lastword[i]
            if s not in visited.keys():
                mapp[lastword]=s
                break
            i+=1
        li=[]
        for word in arr:
            li.append(mapp[word])
        return li


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import sys
sys.setrecursionlimit(10**6)
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        arr=list(map(str,input().split()))
        
        ob = Solution()
        res = ob.findPrefixes(arr,N)
        for i in res:
            print(i,end=" ")
        print()
# } Driver Code Ends