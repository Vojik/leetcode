package com.vojik.algorithms;

import com.vojik.helpers.ListNode;

public class TwoPointersLinkedListTemplate {

  public static boolean template(ListNode head) {
    // Initialize slow & fast pointers
    ListNode slow = head;
    ListNode fast = head;

    //Change this condition to fit specific problem.
    //Attention: remember to avoid null-pointer error
    while (slow != null && fast != null && fast.next != null) {
      slow = slow.next;           // move slow pointer one step each time
      fast = fast.next.next;      // move fast pointer two steps each time
      if (slow == fast) {         // change this condition to fit specific problem
        return true;
      }
    }
    return false;   // change return value to fit specific problem
  }

}
