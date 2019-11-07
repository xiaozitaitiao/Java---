package jianzhi;
/**
 * Day:2
 * 面试题：42
 * 类型：动态规划
 * 题目：连续子数组的最大和
 * @author 11094
 *
 */

public class Day2 {
	
	private static final  int nums[]= {1,-2,3,10,-4,7,2,-5};

	private static int maxSum;
	public static int getMaxSum(final int nums[])
	{
		if(nums==null||nums.length<=0)
			return 0;
		int maxSum=nums[0];
		int curSum=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			if(curSum>=0)curSum+=nums[i];
			else curSum=nums[i];
			if(maxSum<curSum)maxSum=curSum;

		}
		
		return maxSum;
	}
	public static void main(String[] args) {
		int res=getMaxSum(nums);
		System.out.println(res);
	}
}
