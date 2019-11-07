package jianzhi;
/**
 * Day:3
 * 面试题：4
 * 类型：规律
 * 题目：二维数组中的查找
 * @author 11094
 *
 */
import java.util.Scanner;
public class Day3 {
private static int[][]nums= {
		{1,2,8,9},
		{2,4,9,12},
		{4,7,10,13},
		{6,8,11,15}
};
private static int target;
public static boolean isExist(int [][]nums,int target)
{
	int rows=nums.length;
	int cols=nums[0].length;
	int x=0;
	int y=cols-1;
	while(y>=0&&x<rows)
	{
		if(target==nums[x][y])
			return true;
		if(target>nums[x][y])
			x++;
		
		else if(target<nums[x][y])
			y--;
		
	}
	return false;
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("请输入目标数：");
	target=scan.nextInt();
	boolean res=isExist(nums,target);
	System.out.println(res);
}
}
