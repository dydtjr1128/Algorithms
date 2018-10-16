import java.util.HashMap;
import java.util.LinkedList;

public class Solution {
	class User {
		public User(String userId, String nickname, String state) {
			super();
			this.userId = userId;
			this.nickname = nickname;
			this.state = state;
		}

		String userId;
		String nickname;
		String state;
	}

	public String[] solution(String[] strings) {
		//java.util.ArrayList<User> arraylist = new java.util.ArrayList<>();
		LinkedList<User> linkedList = new LinkedList<>();
		HashMap<String, User> userMap = new HashMap<>(); 
		int count = 0;
		int num = 0;
		for (int i = 0; i < strings.length; i++) {
			String sentences[] = strings[i].split(" ");// 0 state 1 userId 2 nickname
			// System.out.println(sentences[0] + " " + sentences[1] + " " + sentences[2]);

			if (sentences[0].charAt(0) == 'E') {
				for (int j = 0; j < linkedList.size(); j++) {
					User user = linkedList.get(j);
					if (user.userId.equals(sentences[1])) {
						user.nickname = sentences[2];
					}
				}
				User user = new User(sentences[1], sentences[2], sentences[0]);
				userMap.put(user.userId, user);
				linkedList.add(user);
				count++;
			} else if (sentences[0].charAt(0) == 'L') {
				for (int j = 0; j < linkedList.size(); j++) {
					User user = linkedList.get(j);
					if (user.userId.equals(sentences[1])) {
						String nickname = user.nickname;
						linkedList.add(new User(sentences[1], nickname, "Leave"));
						break;
					}
				}
				count++;
			} else if (sentences[0].charAt(0) == 'C') {
				for (int j = 0; j < linkedList.size(); j++) {
					User user = linkedList.get(j);
					if (user.userId.equals(sentences[1])) {
						user.nickname = sentences[2];
					}
				}
			}
		}
		String answer[] = new String[count];
		for (int i = 0; i < linkedList.size(); i++) {
			User user = linkedList.get(i);

			if (user.state.equals("Enter")) {
				answer[num++] = user.nickname + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
			} else {
				answer[num++] = user.nickname + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
			}
		}
		return answer;
	}

}
