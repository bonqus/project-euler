
public class P142 {
	public static void main (String[] args) {
		boolean found = false;
		int x = 3;
		while (!found) {
			x++;
			for(int y = 2; y < x; y++) {
				for(int z = 1; z < y; z++) {
					if(isSquare(x + y) && isSquare(x - y) && isSquare(x + z) && isSquare(x - z) && isSquare(y + z) && isSquare(y - z)) {
						System.out.println("x:" + x + " y:" + y + " z:" + z);
						found = true;
					}
				}
			}
		}
	}

	public static boolean isSquare(int i){
		return Math.sqrt(i) % 1 == 0;
	}
}
