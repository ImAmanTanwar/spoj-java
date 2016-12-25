import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Edist {
	public static void main(String s[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String src=br.readLine();
			int l_s=src.length();
			String dest=br.readLine();
			int l_d=dest.length();
			long[][] mem=new long[l_d+1][l_s+1];
			for(int i=0;i<=l_d;i++)
				mem[i][0]=i;
			for(int i=0;i<=l_s;i++)
				mem[0][i]=i;
			for(int i=1;i<=l_d;i++) {
				for(int j=1;j<=l_s;j++) {
					if(src.charAt(j-1)==dest.charAt(i-1))
						mem[i][j]=mem[i-1][j-1];
					else 
						mem[i][j]=1+Math.min(mem[i-1][j], Math.min(mem[i][j-1], mem[i-1][j-1]));
				}
			}
			System.out.println(mem[l_d][l_s]);
			for(int i=1;i<=l_d;i++)  {
				for(int j=1;j<=l_s;j++)
					System.out.print(mem[i][j]);
				System.out.println();
			}
			}
	}
}
