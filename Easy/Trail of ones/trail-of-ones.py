#User function Template for python3
class Solution:
    def numberOfConsecutiveOnes(self, n):
        if n == 2:
            return 1
        a, b = 0, 1
        ans = 1
        mod = pow(10, 9) + 7
        for i in range(3, n + 1):
            c = (a + b) % mod
            a, b = b, c
            ans = ((ans * 2) % mod + c) % mod
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):

        N = int(input())

        ob = Solution()
        print(ob.numberOfConsecutiveOnes(N))

# } Driver Code Ends