
public class P015 {
	public static void main (String[] args){
		int n = 20+1;
		long grid[][] = new long [n][n];
		
		for (int i=0; i<n; i++){
			grid[0][i]=1;
			grid[i][0]=1;
		}
		for (int i=0; i<n; i++){
			for (int k=0; k<n; k++){
				if (grid[i][k]==0){
					grid[i][k]=grid[i-1][k]+grid[i][k-1];
				}
			}
		}
		
		System.out.println(grid[n-1][n-1]);
		print(grid,n);

	}

	// clear grid
	public static void clear (long grid[][], int n){
		for (int i=0; i<n; i++){
			for (int k=0; k<n; k++){
				grid[k][i]=0;
			}
		}
	}

	// print grid
	public static void print(long grid[][], int n){
		for (int i=0; i<n; i++){
			for (int k=0; k<n; k++){
				System.out.print(grid[k][i] + " ");
			}
			System.out.println();
		}
	}
}
