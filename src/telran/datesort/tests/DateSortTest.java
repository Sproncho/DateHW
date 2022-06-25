package telran.datesort.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

class DateSortTest {

	@Test
	void test() {
		String[] dates = { "07-05-1990", "28-01-2010", "11-08-1990", "15-01-2010", "16/06/1970" };
		String[] expected = { "16/06/1970", "07-05-1990", "11-08-1990", "15-01-2010", "28-01-2010", };
		Comparator<String> comp = (d1, d2) -> {
			String[] date1 = d1.split("[/\\-]");
			String[] date2 = d2.split("[/\\-]");
			if(Integer.parseInt(date1[2]) == Integer.parseInt(date2[2])){
				if(Integer.parseInt(date1[1]) == Integer.parseInt(date2[1]))
					return Integer.parseInt(date1[0]) - Integer.parseInt(date2[0]);
				return Integer.parseInt(date1[1]) - Integer.parseInt(date2[1]);
			}
			return Integer.parseInt(date1[2]) - Integer.parseInt(date2[2]);
		};
		Arrays.sort(dates, comp);
		assertArrayEquals(expected, dates);
	}

}
