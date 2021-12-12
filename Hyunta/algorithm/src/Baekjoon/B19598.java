package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B19598 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Meeting> totalMeeting = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			totalMeeting.add(new Meeting(start, end));
		}
		Collections.sort(totalMeeting);
		int cnt = getMinRooms(totalMeeting);
		System.out.println(cnt);
	}

	private static int getMinRooms(List<Meeting> totalMeeting) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int cnt = 1;
		minHeap.add(0);
		for (Meeting meeting : totalMeeting) {
			if (minHeap.peek() <= meeting.getStart()) {
				minHeap.poll();
				minHeap.add(meeting.getEnd());
			} else {
				cnt++;
				minHeap.add(meeting.getEnd());
			}
		}
		return cnt;
	}

}

class Meeting implements Comparable<Meeting> {
	private int start;
	private int end;

	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	@Override
	public String toString() {
		return "Meeting{" +
			"start=" + start +
			", end=" + end +
			'}';
	}

	@Override
	public int compareTo(Meeting meeting) {
		if (meeting.start < start) {
			return 1;
		}
		if (meeting.start > start) {
			return -1;
		}
		return 0;
	}
}
