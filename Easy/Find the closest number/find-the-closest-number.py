
from typing import List

class Solution:
    def findClosest(self, n : int, k : int, arr : List[int]) -> int:
        
        from math import inf
        minabsdiff=inf
        for i in range(n):
            absdiff=abs(arr[i]-k)
            if absdiff>minabsdiff: return arr[i-1]
            minabsdiff=absdiff
        return arr[i]


#{ 
 # Driver Code Starts

class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n = int(input())
        
        
        k = int(input())
        
        
        arr=IntArray().Input(n)
        
        obj = Solution()
        res = obj.findClosest(n, k, arr)
        
        print(res)
        

# } Driver Code Ends