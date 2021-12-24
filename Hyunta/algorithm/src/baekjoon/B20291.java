package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class B20291 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		TreeMap<String, Integer> fileMap = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			String file = br.readLine();
			String fileExtension = getExtension(file);
			fileMap.put(fileExtension, fileMap.getOrDefault(fileExtension, 0) + 1);
		}
		for (String key : fileMap.keySet()) {
			System.out.println(key + " " + fileMap.get(key));
		}
	}

	private static String getExtension(String file) {
		StringTokenizer st = new StringTokenizer(file, ".");
		String fileName = st.nextToken();
		String fileExtension = st.nextToken();
		return fileExtension;
	}
}
