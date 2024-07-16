/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node temp = reverseList(head);
        int max = temp.data;
        
        Node curr = temp.next;
        Node prev = temp;
        while(curr != null){
            if(curr.data >= max){
                prev = curr;
                max = curr.data;
            }else{
              prev.next = curr.next;
            }
            
            curr = curr.next;
        }
        
        return reverseList(temp);
    }
    
    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
 