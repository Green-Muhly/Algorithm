package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B11000 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Lecture> lectures = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
			int startTime = Integer.parseInt(stringTokenizer.nextToken());
			int endTime = Integer.parseInt(stringTokenizer.nextToken());
			lectures.add(new Lecture(startTime, endTime));
		}
		Collections.sort(lectures);
		int cnt = getMinRooms(lectures);
		System.out.println(cnt);
	}

	private static int getMinRooms(List<Lecture> lectures) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		minHeap.add(0);
		int cnt = 1;
		for (Lecture lecture : lectures) {
			if (minHeap.peek() <= lecture.getStartTime()) {
				minHeap.poll();
				minHeap.add(lecture.getEndTime());
			} else {
				cnt++;
				minHeap.add(lecture.getEndTime());
			}
		}
		return cnt;
	}
}

class Lecture implements Comparable<Lecture> {
	private int startTime;
	private int endTime;

	public Lecture(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	@Override
	public int compareTo(Lecture lecture) {
		if (lecture.startTime < startTime) {
			return 1;
		}
		if (lecture.startTime > startTime) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Lecture{" +
			"startTime=" + startTime +
			", endTime=" + endTime +
			'}';
	}
}
