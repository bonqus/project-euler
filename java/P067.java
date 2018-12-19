
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.File;

public class P067 {
	
	public static void main (String[] args){
		
		int n=100;
		
		int grid[][] = new int [n][n];

		grid=loadGrid(grid);
		
		int temp;
		
		print(grid,n);

		
		for(int i = 0; i < n-1; i++){
			for(int l = 0; l < n-1; l++){
				if(grid[l][n-1-i] > grid[l+1][n-1-i]){
					temp = grid[l][n-1-i];
				}else{
					temp = grid[l+1][n-1-i];
				}
				grid[l][n-2-i] += temp;
			}
		}
		System.out.println(grid[0][0]);
		
	}
		
	public static int[][] loadGrid(int grid[][]){
		int k=0;
		int m=0;
		
		try{
			String filePath = "TextFiles\\Project_67.txt";
			File f = new File(filePath);
			FileInputStream fstream = new FileInputStream(f);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null)   {
				for(int i=0; i<strLine.length(); i++){
					try{
						
						grid[i][k]=Integer.parseInt(strLine.substring(i+m,i+2+m));
						m+=2;
						
					}catch (Exception e){}
				}
				m=0;
				k++;
			}
			in.close();
		}catch (Exception e){}
		
		return grid;
	}

	public static void print(int grid[][], int n){
		for (int i=0; i<n; i++){
			for(int l=i; l<n; l++){
				System.out.print("  ");
			}
			for (int k=0; k<n; k++){
				if(grid[k][i]!=0){
					if(grid[k][i]>9){
						System.out.print(grid[k][i] + "  ");
					}else{
						System.out.print("0"+grid[k][i] + "  ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void printlige(int grid[][], int n){
		for (int i=0; i<n; i++){
			for (int k=0; k<n; k++){
				if(grid[k][i]!=0){
					if(grid[k][i]>9){
						System.out.print(grid[k][i] + "  ");
					}else{
						System.out.print("0"+grid[k][i] + "  ");
					}
				}
			}
			System.out.println();
		}
	}
}
