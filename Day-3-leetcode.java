// Day 3
// Problem 5
// Reverse a LinkList
// Winner winner chicken dinner.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;

        ListNode prev = null;
        
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

//Problem 6
//Valid Parentheses
// This one hurt my head I couldnt get this all the way. So this was a bust
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> hashMap = new HashMap<Character, Character>();
        hashMap.put(')', '(');
        hashMap.put('}', '}');
        hashMap.put(']', '[');
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()){
            if(stack.empty() || hashMap.containsValue(c)){
                stack.push(c);
                continue;
            }
            if(hashMap.containsKey(c)){
                if(stack.peek() == hashMap.get(c)){
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
        
    }
}