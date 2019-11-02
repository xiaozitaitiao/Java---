package jianzhi;
/**
 * 1a
 */
import java.util.Scanner;

public class Soultion1 {
	public boolean hasPath(char[][]metrixs,int x,int y,int rows,int cols,String target,int len,boolean[][]visited)
	{
		if(len==target.length())return true;
		boolean flag=false;
		if(x>=0&&x<rows&&y>=0&&y<cols&&visited[x][y]==false&&target.charAt(len)==metrixs[x][y])
		{
			visited[x][y]=true;
			flag=hasPath(metrixs, x-1, y, rows, cols, target, len+1, visited)||
					hasPath(metrixs, x+1, y, rows, cols, target, len+1, visited)||
					hasPath(metrixs, x, y-1, rows, cols, target, len+1, visited)||
					hasPath(metrixs, x, y+1, rows, cols, target, len+1, visited);
			if(!flag)
			{
				visited[x][y]=false;
				len--;
			}

		}
		return flag;
	}
	
	
public static void main(String[] args) {
	char[][]metrixs= {
			{'a','b','t','g'},
			{'c','f','c','s'},
			{'j','d','e','h'}
	};
	Soultion1 soul= new Soultion1();
	int rows=3;
	int cols=4;
	boolean[][] visited=new boolean[3][4];
	System.out.println("ÊäÈë×Ö·û´®£º");
	Scanner scan=new Scanner(System.in);
	String target=scan.next();
	boolean res=false;
	outer:
	for(int i=0;i<rows;i++)
		for(int j=0;j<cols;j++)
		{
			if(soul.hasPath(metrixs, i,j, rows, cols, target, 0, visited)) {res=true;break outer;}
		}
	System.out.println(res);
	
		
	
	
			
}
}
