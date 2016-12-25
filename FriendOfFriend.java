import java.util.Scanner;

public class FriendOfFriend {
	public static void main(String s[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] mem=new int[10000];
		while(t-->0) {
			int friend=sc.nextInt();
			mem[friend]=1;
			int fof=sc.nextInt();
			while(fof-->0) {
				int x=sc.nextInt();
				if (mem[x]==0)
					mem[x]=2;
			}
		}
		int count=0;
		for(int i=0;i<10000;i++)
			if(mem[i]==2)
				count++;
		System.out.println(count);
		sc.close();
	}
}
