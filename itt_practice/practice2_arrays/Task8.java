
public class Task8 {
	public static void main(String[] args) {
		int n = 4;
		boolean[][] a = { { false, false, false, false }, 
				{ false, false, false, false },
				{ false, false, false, false }, 
				{ false, false, true, false }, 
			};
		
		boolean hasTrueValueAboveSecondDiagonal = false;
		for (int row = 0; row < n-1; row++) {
			for (int col=0; col < n-1-row; col++) {
				if (a[row][col] == true) {
					hasTrueValueAboveSecondDiagonal = true;
					break;
				}
			}
		}
		
		if (hasTrueValueAboveSecondDiagonal) {
			System.out.println("Ima");
		}
		else {
			System.out.println("Nqma");
		}
	}
}
