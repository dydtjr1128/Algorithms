package ¹æ±Ý±×°î;

public class Solution {
	class MusicData {
		public String startTime;
		public String endTime;
		public String name;
		public String musicInfo;
		public String fullMusicInfo;
		public int playingTime;

		public String splitMusicInfo[];// [B,C,D,C#]
		public int splitMusicInfoLen;

		public void addMusicData(String musicinfos) {
			String splitData[] = musicinfos.split(",");
			startTime = splitData[0];
			endTime = splitData[1];
			name = splitData[2];
			musicInfo = splitData[3];

			splitMusicInfo = new String[1440];
			splitMusicInfoLen = 0;
			fullMusicInfo = "";

			// calc playing time
			String splitStartTime[] = startTime.split(":");
			String splitEndTime[] = endTime.split(":");
			playingTime = (Integer.parseInt(splitEndTime[0]) * 60 + Integer.parseInt(splitEndTime[1]))
					- (Integer.parseInt(splitStartTime[0]) * 60 + Integer.parseInt(splitStartTime[1]));

			for (int i = 0; i < musicInfo.length() - 1; i++) {
				if (musicInfo.charAt(i + 1) == '#') {
					splitMusicInfo[splitMusicInfoLen++] = musicInfo.charAt(i) + "" + musicInfo.charAt(i + 1);
					i++;
				} else {
					splitMusicInfo[splitMusicInfoLen++] = musicInfo.charAt(i) + "";
				}
			}
			if (musicInfo.charAt(musicInfo.length() - 1) != '#')
				splitMusicInfo[splitMusicInfoLen++] = musicInfo.charAt(musicInfo.length() - 1) + "";

			int replayCount = playingTime / splitMusicInfoLen;
			int replayCountRemainMinute = playingTime % splitMusicInfoLen;
			for (int i = 0; i < replayCount; i++) {
				for (int j = 0; j < splitMusicInfoLen; j++)
					fullMusicInfo += splitMusicInfo[j];
			}

			for (int i = 0; i < replayCountRemainMinute; i++) {
				fullMusicInfo += splitMusicInfo[i];
			}
			// System.out.println(fullMusicInfo);

		}
	}

	public String solution(String m, String[] musicinfos) {
		String answer = "";
		boolean isFind = false;
		MusicData musicDatas[] = new MusicData[1000];
		int musicDatasCount = 0;
		String mm[] = new String[1440];
		int mmLen = 0;

		for (int i = 0; i < m.length() - 1; i++) {
			if (m.charAt(i + 1) == '#') {
				mm[mmLen++] = m.charAt(i) + "" + m.charAt(i + 1);
				i++;
			} else {
				mm[mmLen++] = m.charAt(i) + "";
			}
		}
		if (m.charAt(m.length() - 1) != '#')
			mm[mmLen++] = m.charAt(m.length() - 1) + "";
		// System.out.println(mmLen);
		for (int i = 0; i < musicinfos.length; i++) {
			MusicData musicData = new MusicData();
			musicData.addMusicData(musicinfos[i]);
			if (musicData.fullMusicInfo.contains(m)) {
				if (musicData.fullMusicInfo
						.charAt(musicData.fullMusicInfo.indexOf(m) + m.length()) != '#') {
					// System.out.println(musicData.fullMusicInfo.indexOf(m));
//					System.out.println(musicData.fullMusicInfo + " " + musicData.name + "@@");
					musicDatas[musicDatasCount++] = musicData;
					isFind = true;
				}

			}

			// m = A#BC
		/*	for (int j = 1; j <= mmLen; j++) {
				String tempm = "";
				for (int q = 0; q < j; q++) {
					tempm += mm[q] + "";
				}
				System.out.println(tempm + " " + musicData.fullMusicInfo);
				if (musicData.fullMusicInfo.contains(tempm)) {
					if (musicData.fullMusicInfo
							.charAt(musicData.fullMusicInfo.indexOf(tempm) + tempm.length()) != '#') {
						// System.out.println(musicData.fullMusicInfo.indexOf(m));
						musicDatas[musicDatasCount++] = musicData;
						isFind = true;
					}

				}
			}*/

		}
		MusicData findMusicData = musicDatas[0];
		for (int i = 1; i < musicDatasCount; i++) {
			if (findMusicData.playingTime < musicDatas[i].playingTime) {
				findMusicData = musicDatas[i];
			}
		}
		if (isFind) {
			answer = findMusicData.name;
		} else {
			answer = "`(None)`";
		}
		return answer;
	}
}