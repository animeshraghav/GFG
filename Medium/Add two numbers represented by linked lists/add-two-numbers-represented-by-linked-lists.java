//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node num1 = new Node(val);
            Node tail = num1;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node num2 = new Node(val);
            tail = num2;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    // Function to add two numbers represented by linked lists.
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        // return head of sum list
        if (num1 == null) {
            return num2;
        } else if (num2 == null) {
            return num1;
        }
        
        Node ptr1 = reverse(num1);
        Node ptr2 = reverse(num2);
        
        int carry = 0;
        Node ans = null;
        
        while (ptr1 != null || ptr2 != null) {
           int val1 = ptr1 != null ? ptr1.data : 0;
           int val2 = ptr2 != null ? ptr2.data : 0;
            
            int sum = val1 + val2 + carry;
            
            carry = sum/10;
            int d = sum%10;
            
            Node n = new Node(d);
            
            if (ans == null) {
                ans = n;
            } else {
                n.next = ans;
                ans = n;
            }
            
            ptr1 = ptr1 != null ? ptr1.next : null;
            ptr2 = ptr2 != null ? ptr2.next : null; 
        }
        if (carry > 0) {
               Node n = new Node(carry);
               
               if (ans == null) {
                   ans = n;
               } else {
                   n.next = ans;
                   ans = n;
               }
           }
           
           Node temp = ans;
           while (temp != null && temp.data == 0) {
               temp = temp.next;
           }
           if (temp == null) {
               return new Node(0);
           }
           return temp;
    }

    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}