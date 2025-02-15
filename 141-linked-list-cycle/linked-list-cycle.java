/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 // by using slow and first pointer approach will handle with constant SC
 public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode first=head;
        while(first!=null && first.next!=null)
        {
            slow=slow.next;
            first=first.next.next;
            if(slow ==first)
            {
                return true;
            }
        }
        return false;
    }
    
}
 
 
 
 
 // bruitforce sol using arraylist O(n) sc------------------------
 /*
public class Solution {
    public boolean hasCycle(ListNode head) {
       ArrayList <ListNode> tem=new ArrayList<>();
        ListNode current=head;
        while(current!=null)
        { if(tem.contains(current))
            {   return true;}
            else{tem.add(current);
                 current=current.next; }   
        }return false; }
}
*/
// bruitforce using hashset sol O(n) sc------------------------------
// notstore the value bcz in duplicate situation this approach will not work. wwill give wrong op
// store entire node  HashSet <ListNode> temp=new HashSet<>();
// here we have not mention int or boolean we have given entire node <ListNode>
/*
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet <ListNode> temp=new HashSet<>();
        ListNode current=head;
        while(current!=null)
        { if(temp.contains(current))
            {   return true;}
            else{
                temp.add(current);
                 current=current.next; }   
        }return false;
        }
}
*/

/*
// bruitforce using hasMap sol O(n) sc------------------------------
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map <ListNode, Integer> map=new HashMap<>();
        ListNode current=head;
        while(current!=null)
        { if(map.containsKey(current))
            {   return true;}
            else{
                map.put(current, 1);
                 current=current.next; }   
        }return false;
        }
}
*/
