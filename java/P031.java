package from_31_to_40;

public class Problem_31 {
	public static void main (String[] args) {
		System.out.println(posibilitys());
	}

	public static int posibilitys() {
		int poss = 0;
		int [] coin = {1,2,5,10,20,50,100,200};

		for (int a = 0; a*coin[0] <= coin[7]; a++) {
			for (int b = 0; b*coin[1] <= coin[7]; b++) {
				for (int c = 0; c*coin[2] <= coin[7]; c++) {
					for (int d = 0; d*coin[3] <= coin[7]; d++) {
						for (int e = 0; e*coin[4] <= coin[7]; e++) {
							for (int f = 0; f*coin[5] <= coin[7]; f++) {
								for (int g = 0; g*coin[6] <= coin[7]; g++) {
									for (int h = 0; h*coin[7] <= coin[7]; h++) {
										if((coin[0]*a) + (coin[1]*b) + (coin[2]*c) + (coin[3]*d) + (coin[4]*e) + (coin[5]*f) + (coin[6]*g) + (coin[7]*h) == coin[7]) {
											poss++;
										}
									}
								}
							}
						}
					}
				}
			}

		}
		return poss;
	}
}
