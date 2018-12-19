
import java.util.ArrayList;

public class P024 {
	public static void main (String[] args) {
		int k = 0;
		int i = 3;
		for (int i10 = 0; i10 < 10; i10++) {
			for (int i9 = 0; i9 < 9; i9++) {
				for (int i8 = 0; i8 < 8; i8++) {
					for (int i7 = 0; i7 < 7; i7++) {
						for (int i6 = 0; i6 < 6; i6++) {
							for (int i5 = 0; i5 < 5; i5++) {
								for (int i4 = 0; i4 < 4; i4++) {
									for (int i3 = 0; i3 < 3; i3++) {
										for (int i2 = 0; i2 < 2; i2++) {
											for (int i1 = 0; i1 < 1; i1++) {
												k++;
											}
										}
									}

								}
							}
						}
					}
				}
			}
		}
		System.out.println(k);
	}
	public static ArrayList<Integer> lexicographic (String numbers) {
		ArrayList<Integer> prmttn = new ArrayList<Integer>();


		return prmttn;
	}
}
