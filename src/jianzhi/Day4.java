package jianzhi;
/**
 * Day:4
 * 面试题：3
 * 类型：数组操作
 * 题目：找出数组中重复的数字
 * @author 11094
 *
 */
import java.util.Scanner;

public class Day4{
private static int[]nums= {2,3,1,0,2};

public static int repeatedNumber(int []nums)
{
	int len=nums.length;
	for(int i=0;i<len;i++)
	{
		if(nums[i]==i)continue;
		else if(nums[nums[i]]==nums[i])return nums[i];
		else {
			int temp1=nums[i];
			int temp2=nums[nums[i]];
			nums[nums[i]]=temp1;
			nums[i]=temp2;
			
		}
	}
	return -1;
}
public static void main(String[] args) {
	int res=repeatedNumber(nums);
	System.out.println(res);
}
}
