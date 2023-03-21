
class Solution {
    public int getDecimalValue(ListNode head) {
        int answer = head.val;
        while(head.next != null){
            answer = answer * 2 + head.next.val;
            head = head.next;
        }
        return answer;
    }
}
