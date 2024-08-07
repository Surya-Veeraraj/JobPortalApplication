package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// Data for Job Protal Application
		int jobPostings = 50;
		int applicationReceived = 200;
		int newApplications = 30;

		// Addition
		int totalApplications = applicationReceived + newApplications;
		System.out.println("Total Applications Received: " + totalApplications);

		// Subtraction
		int remainingJobPostings = jobPostings - 10;
		System.out.println("Remaining Job Postings: " + remainingJobPostings);

		// Multiplication
		int doubledApplications = totalApplications * 2;
		System.out.println("Doubled Applications: " + doubledApplications);

		// Division
		int averageApplicationsPerJob = totalApplications / jobPostings;
		System.out.println("Average Applications Per Job: " + averageApplicationsPerJob);

		// Division with double result
		double applicationsPerPosting = (double) totalApplications / jobPostings;
		System.out.println("Applications Per POsting: " + applicationsPerPosting);

		// Modulus
		int leftoverApplications = totalApplications % jobPostings;
		System.out.println("Leftover Applications: " + leftoverApplications);

	}

}
