import java.util.Scanner;
import java.Arrays;

public class StudentGrade {

	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How many students do you have? ");
		int numberOfStudent = scan.nextInt();

		System.out.println("How many student do they offer? ");
		int studentOffered = scan.nextInt();

		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.print("Svaed Successfully");
		System.out.println();

		int student = 4;
		int subject = 3;

		int[][] grades = new int[student][subject];

		for (int i = 0; i < student; i++) {

			System.out.printf("Entering score for student " + (i + 1) + "");
			System.out.println();

			for (int j = 0; j < subject; j++) {
				System.out.printf("Enter score for subject " + (j + 1) + "\n " + " ");
				grades[i][j] = scan.nextInt();
				System.out.println();
				System.out.println("Saving >>>>>>>>>>>>>>>>>");
				System.out.println("Saved Successfully");

			}

		}

		System.out.println("==============================================");
		System.out.printf("%s\t  %s \t %s\t%s \t%s \t %s    \t ", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
		System.out.println();
		System.out.println("==============================================");

		double average = 0.0;
		for (int index = 0; index < grades.length; index++) {

			int total = grades[index][0] + grades[index][1] + grades[index][2];
			average = (double) total / subject;

			// if(grades[subject] > ){

			// System.out.println(grade[index]);
			// }
			// else if(grades[subject] < total){
			// System.out.println(grades[index]);

			// }

			System.out.printf("%-10s %-6d  %-6d %-6d  %-3d  %.2f \n", "Student " + (index + 1), grades[index][0],
					grades[index][1], grades[index][2], total, average);

		}

		System.out.println("================================================");
		System.out.println("================================================");

		System.out.println("SUBJECT SUMMARY");
		// for (int count = 0; count < grades[subject]; count++) {
		// System.out.printf("Subject", grades[subject]);

		// }

	}

}