package datad4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Schedule {

	public static void main(String[] args) {
		int[][] schedule = { { 1, 2, 2 }, { 3, 1, 4 } };
		int[][] schedule1 = { { 1, 1, 5, 2, 3 }, { 4, 5, 6, 4, 3 }, { 9, 4, 4, 1, 5 } };
		int[][] schedule2 = { { 4, 3 }, { 5, 5 }, { 6, 2 } };
		System.out.println(findDup(schedule));
		System.out.println(findDup(schedule1));
		System.out.println(findDup(schedule2));
	}

	public static Set<Integer> findDup(int[][] array) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicateNumbers = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (set.contains(array[i][j])) { // if set already contained the integer value, add that number to
													// Duplicate set
					duplicateNumbers.add(array[i][j]);

				} else {
					// add only unique values
					set.add(array[i][j]);
				}

			}
		}
		return duplicateNumbers;
	}

}
