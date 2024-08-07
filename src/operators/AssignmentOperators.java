package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		int jobs = 50;
		int apps = 200;
		int newApps = 30;
		boolean hashNew = true;
		
		// simple assignment
		int totalApps = apps;
		System.out.println("Total Apps (initial): " + totalApps);
		
		// Addition assignment
		totalApps += newApps; // equivalent to totalApps = totalApps + newApps
		System.out.println("Total Apps after += : " + totalApps);
		
		// Subtraction assignment
		jobs -= 10; // equivalent to jobs = jobs - 10
		System.out.println("Remaining Jobs after -= : " + jobs);
		
		// Multiplication assignment
		int doubleApps = totalApps; // initialize
		doubleApps *= 2; // equivalent to doubleApps = doubleApps * 2
		System.out.println("Doubled Apps after *= : " + doubleApps);
		
		// Division assignment
		int avgAppsPerJob = totalApps; // initialize
		avgAppsPerJob /= jobs; // equivalent to avgAppsPerJob = avgAppsPerJob / jobs
		
		// Modulus assignment
		int leftoverApps = totalApps; 
		leftoverApps %= jobs; // equivalent to leftoverApps = leftoverApps % jobs
		
		// Bitwise AND assignment
		int bitwiseAnd = apps; 
		bitwiseAnd &= newApps; // equivalent to bitwiseAnd = bitwiseAnd & newApps
		System.out.println("Bitwise AND result: " + bitwiseAnd);
		
		// Bitwise OR assignment
		int bitwiseOr = apps; 
		bitwiseOr |= newApps; // equivalent to bitwiseOr = bitwiseOr | newApps
		System.out.println("Bitwise OR result: " + bitwiseOr);
		
		// Bitwise XOR assignment
		int bitwiseXor = apps; 
		bitwiseXor ^= newApps; // equivalent to bitwiseXor = bitwiseXor ^ newApps
		System.out.println("Bitwise XOR result: " + bitwiseXor);
		
		// Left shift assignment
		int leftShift = apps;
		leftShift <<= 2; // equivalent to leftShift = leftShift << 2
		System.out.println("Left Shift result: " + leftShift);
		
		// Right Shift assignment
		int rightShift = apps; 
		rightShift >>= 2;
		System.out.println("Right Shift result: " + rightShift);
		
		// Unsigned right shift assignment
		int unsignedRightShift = apps;
		unsignedRightShift >>>= 2;
		System.out.println("Unsigned Right Shift result: " + unsignedRightShift);
		
	}

}
