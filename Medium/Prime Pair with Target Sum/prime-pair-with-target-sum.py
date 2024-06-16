
from typing import List


class Solution:
    def getPrimes(self, n):
        prime = [True] * n
        p = 2
        while (p * p < n):
            if (prime[p] == True):
                for i in range(p * p, n, p):
                    prime[i] = False
            p += 1
        
        for i in range(2, n // 2 + 1):
            if prime[i] and prime[n - i]:
                return [i, n - i]
        
        return [-1, -1]
        



#{ 
 # Driver Code Starts
class IntArray:

    def __init__(self) -> None:
        pass

    def Input(self, n):
        arr = [int(i) for i in input().strip().split()]  #array input
        return arr

    def Print(self, arr):
        for i in arr:
            print(i, end=" ")
        print()


if __name__ == "__main__":
    t = int(input())
    for _ in range(t):

        n = int(input())

        obj = Solution()
        res = obj.getPrimes(n)

        IntArray().Print(res)

# } Driver Code Ends