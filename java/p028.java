package from_21_to_30;

public class Problem_28 {
	public static void main (String[] args) {
		int size = 1001;
		int [][] spiral = new int [size][size];
		int n = 1;
		int x = size/2;
		int y = size/2;
		spiral[x][y] = n;
		for(int steps = 2; x + steps <= size; steps++) {
			for (int i = 1; i < steps; i++) {
				x++;
				n++;
				spiral[x][y] = n;
			}
			for (int i = 1; i < steps; i++) {
				y++;
				n++;
				spiral[x][y] = n;
			}
			steps++;
			for (int i = 1; i < steps; i++) {
				x--;
				n++;
				spiral[x][y] = n;
			}
			for (int i = 1; i < steps; i++) {
				y--;
				n++;
				spiral[x][y] = n;
			}
		}
		x++;
		for (; x < size; x++) {
			n++;
			spiral[x][y] = n;
		}
		//printGrid(spiral);
		System.out.println(calculate(spiral));
	}

	public static boolean odd (int n) {
		return n % 2 != 0;
	}

	public static void printGrid(int spiral [][]){
		int n = spiral.length;
		for (int y = 0; y < n; y++){
			for (int x = 0; x < n; x++){
				if(spiral[x][y] > 9){
					System.out.print(spiral[x][y] + " ");
				} else {
					System.out.print("0"+spiral[x][y] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static int calculate(int spiral [][]) {
		int sum = 0;
		int len = spiral.length;
		for(int i = 0; i < len; i++) {
			sum += spiral[i][i];
			sum += spiral[len-i-1][i];
		}
		sum -= spiral[len/2][len/2];
		return sum;
	}
}
