
public class FizzBuzz {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//
//			int numOne = 3;
//			int numTwo = 5;
//			int numThree = numOne * numTwo;
//
//			if (i % numThree == 0) {
//				System.out.println(i + " FizzBuzz");
//			}
//
//			else if (i % numOne == 0) {
//				System.out.println(i + " Fizz");
//			}
//
//			else if (i % numTwo == 0) {
//				System.out.println(i + " Buzz");
//			}
//
//			else {
//				System.out.println(i);
//			}
//
//		}
//	}

//	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//
//			if (i % 3 == 0) {
//
//				if (i % 5 == 0) {
//					System.out.println(i + " FizzBuzz");
//				} else {
//					System.out.println(i + " Fizz");
//				}
//
//			}
//
//			else if (i % 5 == 0) {
//				System.out.println(i + " Buzz");
//			}
//
//			else {
//				System.out.println(i);
//			}
//
//		}
//	}

	public static void main(String[] args) {
		for (Integer i = 1; i <= 100; i++) {

			String msg = i.toString();

			if (i % 3 == 0) {
				msg = msg + " Fizz";
			}

			if (i % 5 == 0) {
				msg = msg + " Buzz";
			}

			System.out.println(msg);

		}
	}

}
