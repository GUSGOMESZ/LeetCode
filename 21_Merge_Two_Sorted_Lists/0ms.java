class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode p1 = list1, p2 = list2, dummy = new ListNode();
    ListNode list = dummy;

    while(p1 != null && p2 != null) {
      if(p1.val <= p2.val) {
        list.next = p1;
        p1 = p1.next;
      } else {
        list.next = p2;
        p2 = p2.next;
      }
      list = list.next;
    }

    if(p1 != null) {
      list.next = p1;
    } else {
      list.next = p2;
    }

    return dummy.next;
  }
}
