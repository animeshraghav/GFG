#User function Template for python3

class Solution:
    def jugglerSequence(self, n):
        l=[n]
        while n>1:
            if n%2!=0:
                c=int(n**(1.5))
                l.append(c)
                n=c
            else:
                d=int(n**(0.5))
                l.append(d)
                n=d
        return l


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())

        ob = Solution()
        arr = ob.jugglerSequence(n)
        for i in (arr):
            print(i, end=" ")
        print()

# } Driver Code Ends