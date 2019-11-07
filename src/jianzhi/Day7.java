package jianzhi;

import java.util.Arrays;
import java.util.Stack;

/**
 * Day:7
 * 面试题：7
 * 类型：二叉树
 * 题目：重建二叉树
 * 
 * @author 11094
 *
 */
public class Day7 {
	public static BinaryTreeNode constructTree(int[]preorde,int[]inorder)
	{
		if(preorde.length==0)return null;
		BinaryTreeNode head;
		head=new BinaryTreeNode(preorde[0]);
		int pos=0;
		for(int i=0;i<inorder.length;i++)
		{
			if(preorde[0]==inorder[i])pos=i;
			else {
				continue;
			}
		}
		int[] newPre=Arrays.copyOfRange(preorde, 1,pos+1 );
		int[] newIn=Arrays.copyOfRange(inorder, 0, pos);
		head.left=constructTree(newPre, newIn);
		newPre=Arrays.copyOfRange(preorde, pos+1,preorde.length );
		newIn=Arrays.copyOfRange(inorder, pos+1, inorder.length);
		head.right=constructTree(newPre, newIn);
		return head;
	}
	public static void main(String[] args) {
		int[]pre= {1,2,4,7,3,5,6,8};
		int[]in= {4,7,2,1,5,3,8,6};
		BinaryTreeNode h=constructTree(pre, in);
	
		Stack<BinaryTreeNode> s=new Stack<BinaryTreeNode>();
		s.push(h);
		//栈实现前序遍历
		while(!s.isEmpty())
		{
			BinaryTreeNode temp=s.pop();
			System.out.println(temp.val);
			if(temp.right!=null)s.push(temp.right);
			if(temp.left!=null)s.push(temp.left);
	

		}
	}

}

class BinaryTreeNode{
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
	BinaryTreeNode(int v){
		val=v;
	}
}