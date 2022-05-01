package week5.day1.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		List<Integer> number = new ArrayList<Integer>();
		number.addAll(Arrays.asList(arr));
		Collections.sort(number);
		for (int i = 0; i <= number.size() - 1; i++) {
			if (number.get(i) != i + 1) {
				System.out.println("Missing number is: " + (i + i));
				break;
			}
		}
	}
}