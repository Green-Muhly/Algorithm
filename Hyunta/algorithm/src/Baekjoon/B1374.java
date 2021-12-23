package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1374 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int lectureCount;

	public static void main(String[] args) throws IOException {
		lectureCount = Integer.parseInt(br.readLine());

		List<Lecture> lectureInfo = getLectureInfo();
		Collections.sort(lectureInfo);

		int minRoom = getMinRoom(lectureInfo);
		System.out.println(minRoom);
	}

	private static int getMinRoom(List<Lecture> lectureInfo) {
		PriorityQueue<Long> currentLecture = new PriorityQueue<>();
		int minRoom = 1;

		currentLecture.add(lectureInfo.get(0).getEndTime());
		for (int i = 1; i < lectureInfo.size(); i++) {
			Long minEndTime = currentLecture.poll();
			if (lectureInfo.get(i).getStartTime() < minEndTime) {
				currentLecture.add(minEndTime);
			}
			currentLecture.add(lectureInfo.get(i).getEndTime());
			minRoom = Math.max(minRoom, currentLecture.size());
		}
		return minRoom;
	}

	private static List<Lecture> getLectureInfo() throws IOException {
		List<Lecture> lectureInfo = new ArrayList<>();
		for (int i = 0; i < lectureCount; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
			long lectureNumber = Long.parseLong(stringTokenizer.nextToken());
			long startTime = Long.parseLong(stringTokenizer.nextToken());
			long endTime = Long.parseLong(stringTokenizer.nextToken());
			lectureInfo.add(new Lecture(startTime, endTime));
		}
		return lectureInfo;
	}

	private static class Lecture implements Comparable<Lecture> {
		private long startTime;
		private long endTime;

		public Lecture(long startTime, long endTime) {
			this.startTime = startTime;
			this.endTime = endTime;
		}

		public long getStartTime() {
			return startTime;
		}

		public long getEndTime() {
			return endTime;
		}

		@Override
		public int compareTo(Lecture lecture) {
			if (this.startTime > lecture.startTime) {
				return 1;
			} else if (this.startTime < lecture.startTime) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
