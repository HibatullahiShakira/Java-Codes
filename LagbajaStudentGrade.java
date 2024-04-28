import java.util.Scanner;

	public class LagbajaStudentGrade{

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Enter number of students:  ");
		int student = scanner.nextInt();

		System.out.println("Enter number of subjects:  ");
		int subject = scanner.nextInt();

			scanner.nextLine();

		int[][] studentSubject = new int[student][subject];
		int[] totalScores = new int[student];
		int[] totalAverage = new int[student];

		for(int i = 0; i < student; i++) {
			System.out.println("Entering score for student " + (i + 1) + ":  ");
			for(int j = 0; j < subject; j++) {
				System.out.println("Enter score for subject " + (j + 1) + ":  ");
				studentSubject[i][j] = scanner.nextInt();
				totalScores[i] += studentSubject[i][j];
				totalAverage[i] = (float) totalScores[i] / (student);


				}
		}
		
	System.out.print("=============================================================================================================================");
	for(int i = 0; i < student; i++) { 	
	System.out.print("\nStudent\t" + (i + 1)); 
		for(int j = 0; j < subject; j++) {
		System.out.print(studentSubject[i][j] + "\t");
		}
		System.out.println();
		}

	System.out.print("===============================================================================================================================");


	int pass = 0;
	int fail = 0;

	for(int i = 0; i < student; i++) {

	if(studentSubject[student][subject] <= 50) {
		fail++;}
	if(studentSubject[student][subject] > 50) {
		pass++;}

	int highestScore = studentSubject[0][0];
	for (int i = 0; i < studentSubject.length; i++) {
		for (int j = 0; j < studentSubject.length; j++){
			if(studentSubject[i][j] > highestScore) highestScore = studentSubject[i][j];
		}
	}

	int lowestScore = studentSubject[0][0];
	for (int i = 0; i < studentSubject.length; i++) {
		for (int j = 0; j < studentSubject.length; j++){
			if(studentSubject[i][j] < lowestScore) lowestScore = studentSubject[i][j];
		}
	}


	
			scanner.close();
}
}






