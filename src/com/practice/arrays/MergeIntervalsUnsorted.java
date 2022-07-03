package com.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeIntervalsUnsorted {

	public static void main(String[] args) {
		var input = new ArrayList<Interval>();
		input.add(new Interval(6, 7));
		input.add(new Interval(2, 4));
		input.add(new Interval(5, 9));
		List<Interval> mergeIntervals = mergeIntervals(input);
		System.out.println(mergeIntervals);

		
	}

	private static List<Interval> mergeIntervals(ArrayList<Interval> input) {

		Collections.sort(input, (a, b) -> Integer.compare(a.start, b.start));

		List<Interval> result = new ArrayList<>();
		result.add(input.get(0));

		for (int i = 1; i < input.size(); i++) {
			var previous = result.get(result.size() - 1);
			var next = input.get(i);

			if (previous.end >= next.start) {
				previous.end = Math.max(next.end, previous.end);
			} else {
				result.add(next);
			}
		}
		
		return result;
	}

}

class Interval {

	int start;

	int end;

	public Interval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
}

