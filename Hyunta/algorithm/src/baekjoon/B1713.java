package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class B1713 {
	private static int frameCount;
	private static int votesCount;
	private static final List<Integer> votes = new ArrayList<>();
	private static final List<Student> frame = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		getSourceData();
		getFinalCandidates();
		printResult();
	}

	private static void getSourceData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		frameCount = Integer.parseInt(br.readLine());
		votesCount = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < votesCount; i++) {
			votes.add(Integer.parseInt(st.nextToken()));
		}
	}

	private static void getFinalCandidates() {
		for (int i = 0; i < votesCount; i++) {
			addCandidate(votes.get(i), i);
		}
	}

	private static void addCandidate(int number, int order) {
		Collections.sort(frame);
		int index = getIndexOfStudent(number);

		if (frameContainsStudent(number)) {
			frame.get(index).count++;
			return;
		}

		if (frame.size() == frameCount) {
			frame.remove(0);
		}
		frame.add(new Student(number, 1, order));
	}

	private static boolean frameContainsStudent(int number) {
		for (int i = 0; i < frame.size(); i++) {
			if (frame.get(i).number == number) {
				return true;
			}
		}
		return false;
	}

	private static int getIndexOfStudent(int number) {
		for (int i = 0; i < frame.size(); i++) {
			if (frame.get(i).number == number) {
				return i;
			}
		}
		return -1;
	}

	private static void printResult() {
		List<Integer> result = new ArrayList<>();
		for (Student student : frame) {
			result.add(student.number);
		}
		Collections.sort(result);
		String resultString = result.stream().map(String::valueOf)
			.collect(Collectors.joining(" "));
		System.out.println(resultString);

	}

	static class Student implements Comparable<Student> {
		int number;
		int count;
		int order;

		public Student(int number, int count, int order) {
			this.number = number;
			this.count = count;
			this.order = order;
		}

		@Override
		public String toString() {
			return "Student{" +
				"number=" + number +
				", count=" + count +
				", order=" + order +
				'}';
		}

		@Override
		public int compareTo(Student o) {
			if (this.count == o.count) {
				return this.order - o.order;
			}
			return this.count - o.count;
		}
	}
}
