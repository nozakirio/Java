
public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}

		int array[] = { 1, 2, 3, 4 };
		for (int count = 0; count < array.length; count++) {
			System.out.println(array[count]);
		}

		for (int num : array) {
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
		}
	}
}
