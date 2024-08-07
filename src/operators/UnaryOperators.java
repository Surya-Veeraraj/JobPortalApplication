package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int jobPostings = 50;
		int applicationsReceived = 200;
		boolean hasNewApplications = true;

		// Unary plus (usually reduntant, but shown for completeness)
		int positiveJobPostings = +jobPostings;
		System.out.println("Positive Job Postings: " + positiveJobPostings);

		// Unary minus (negates the value)
		int negativeApplications = -applicationsReceived;
		System.out.println("Negative Applications: " + negativeApplications);

		// Pre-increment (increments before use)
		int preIncrementJobPostings = ++jobPostings;
		System.out.println("Pre-increment Job Postings: " + preIncrementJobPostings);

		// Post-increment (increments after use)
		int postIncrementJobPostings = jobPostings++;
		System.out.println("Post-increment Job Postings: " + postIncrementJobPostings);
		System.out.println("Job Postings after Post-increment: " + jobPostings);

		// Pre-decrement (decrements before use)
		int preDecrementApplications = --applicationsReceived;
		System.out.println("Pre-decrement Applications: " + preDecrementApplications);

		// Post-decrement (decrements after use)
		int postDecrementApplications = applicationsReceived--;
		System.out.println("Post-decrement Applications: " + postDecrementApplications);
		System.out.println("Applications after Post-decrement: " + applicationsReceived);

		// Logical NOT (inverts a boolean value)
		boolean noNewApplications = !hasNewApplications;
		System.out.println("No New Applications: " + noNewApplications);

	}

}
