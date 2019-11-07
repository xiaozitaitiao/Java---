package jianzhi;
/**
 * Day:5
 * 面试题：5
 * 类型：数组操作
 * 题目：替换空格
 * @author 11094
 *
 */
public class Day5 {

	private static String str="We are happy";
	
	public static String replaceBlank(String str)
	{
		return str.replace(" ", "%20");
	}
	public static String replaceSpace(StringBuilder str)
	{
		if(str.length()==0||str==null)return str.toString();
		int spaceNum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')spaceNum++;
		}
		int indexOld=str.length()-1;
		int newLength=str.length()+spaceNum*2;
		int indexNew=newLength-1;
		str.setLength(newLength);
		while(indexOld>=0)
		{
			if(str.charAt(indexOld)==' ')
			{
				str.setCharAt(indexNew--,'0');
				str.setCharAt(indexNew--,'2');
				str.setCharAt(indexNew--,'%');
			}
			else {
				str.setCharAt(indexNew--,str.charAt(indexOld));
			}
			indexOld--;
		}
		
		return str.toString();
	}
	public static void main(String[] args) {
		String res1=replaceBlank(str);
		String res2=replaceSpace(new StringBuilder(str));
		System.out.println(res2);
	}
}
