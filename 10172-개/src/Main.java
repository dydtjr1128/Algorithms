import java.util.Scanner;
public class Main {
	public static void main(String[] args) {		
		Scanner S = new Scanner(System.in);
		int value[][] = new int[15][15];
		
		for(int i=0; i<value.length; i++) {
			value[i][0] = 1;
			value[0][i] = i+1;
		}		
		for(int i=1;i<value.length; i++) {
			for(int j=1; j<value.length; j++) {
				value[i][j] = value[i][j-1] + value[i-1][j];
				//System.out.println(i+"Ãþ"+(j+1)+"È£ : " + value[i][j-1] + " + " +  value[i-1][j] + "=" + value[i][j] );
			}
		}	
		int num = S.nextInt();		
		for (int i = 0; i < num; i++) {
			int k = S.nextInt();
			int n = S.nextInt();			
			System.out.println(value[k][n-1]);
		}
		S.close();
	}
}
