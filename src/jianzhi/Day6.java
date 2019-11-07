package jianzhi;

/**
 * Day:6 
 * 面试题：6 
 * 类型：链表操作
 * 题目：从尾到头打印链表
 * 
 * @author 11094
 *
 */
public class Day6 {

	
	public static void printListFromTailToHead(ListNode listNode) {
		if(listNode!=null)
		{
			if(listNode.next!=null)
			{
				printListFromTailToHead(listNode.next);
				
			}
			System.out.println(listNode.val);
		}

	}
	
	public static void main(String[] args) {
		ListNode head=new ListNode(2);
		head.next=new ListNode(4);
		head.next.next=new ListNode(1);
		head.next.next.next=new ListNode(6);
		printListFromTailToHead(head);
	}
}

class ListNode {

	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}