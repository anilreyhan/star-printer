import java.util.Scanner;

public class HW3_Part2 {

	public static void main(String[] args) {

		int n, col, row, centerCol;

		Scanner scan = new Scanner(System.in);

		// Getting the 'n' number from the user.
		System.out.println("Please enter a 'N' number: ");
		n = scan.nextInt();

		// Calculating the number of row and columns.
		col = row = ((2 * n) - 1);

		// Calculating the center column.
		centerCol = (col / 2);

		// Building a square grid.
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				// Printing the first line.
				if (i == 0) {

					// Calling the method to print the first line.
					firstAndLastLine(col, j);
				}

				// Printing the upper half lines.
				else if (i > 0 && i <= centerCol) {

					if (centerCol - i != j && centerCol + i != j) {

						// Printing the '+' symbols and gaps when the 'n' number
						// is an even number.
						if (j % 2 == 1 && n % 2 == 0) {

							if (j > centerCol - i && j < centerCol + i) {
								System.out.print("+ ");
							} else {
								System.out.print("  ");
							}
						}
						// Organizing the gaps.
						else if (n % 2 == 0) {
							System.out.print("  ");

						}
						// Printing the '+' symbols and gaps when the 'n' number
						// is an odd number.
						if (j % 2 == 0 && n % 2 == 1) {

							if (j > centerCol - i && j < centerCol + i) {
								System.out.print("+ ");
							} else {
								System.out.print("  ");
							}
						}
						// Organizing the gaps.
						else if (n % 2 == 1) {
							System.out.print("  ");

						}
					}

					// Printing the '*' symbol.
					else {
						System.out.print("* ");
					}

				}

				// Printing the lower lines.
				else if (i > centerCol && i != row - 1) {

					if (i - centerCol != j && col - i + centerCol - 1 != j) {

						// Printing the '+' symbols and gaps when the 'n' number
						// is an even number.
						if (j % 2 == 1 && n % 2 == 0) {
							if (j > i - centerCol && j < col - i + centerCol - 1) {
								System.out.print("+ ");
							} else {
								System.out.print("  ");
							}
						}

						// Organizing the gaps.
						else if (n % 2 == 0) {
							System.out.print("  ");

						}

						// Printing the '+' symbols and gaps when the 'n' number
						// is an odd number.
						if (j % 2 == 0 && n % 2 == 1) {
							if (j > i - centerCol && j < col - i + centerCol - 1) {
								System.out.print("+ ");
							} else {
								System.out.print("  ");
							}
						}
						// Organizing the gaps.
						else if (n % 2 == 1) {
							System.out.print("  ");

						}

					}

					// Printing the '*' symbol.
					else {
						System.out.print("* ");
					}

				}

				// Printing the last line.
				if (i == (row - 1) && i != 0) {
					// Calling the method to print the last line.
					firstAndLastLine(col, j);
				}

			}
			// Moving the cursor to the next line when the columns are finished
			// in the current line.
			System.out.println("");
		}
	}

	public static void firstAndLastLine(int colCount, int colIndex) {

		int b;
		// Finding the center column.
		b = colCount / 2;

		// Printing the '*' symbol if the cursor is in the center column.
		if (colIndex == b) {
			System.out.print("* ");
		}
		// Printing gaps if the cursor is not in the center column to form a
		// grid.
		else {
			System.out.print("  ");
		}
	}
}
