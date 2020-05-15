#include <string>
#include <vector>
#include<unordered_map>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
	string answer = "";
	unordered_map<string, int> participantMap;
	for (auto p : participant) {
		if (participantMap.find(p) == participantMap.end())
			participantMap.emplace(p, 1);
		else
			participantMap.at(p)++;
	}

	for (auto c : completion) {
		if (participantMap.find(c) == participantMap.end()) {
			answer = c;
			break;
		}
		else {
			int n = --participantMap.at(c);
			if (n == 0) {
				participantMap.erase(c);				
			}
		}
	}
	for (auto& t : participantMap) {
		answer = t.first;
		break;
	}
	

	return answer;
}

int main() {
	//solution({ "marina", "josipa", "nikola","vinko","filipa" }, { "josipa", "filipa", "marina", "nikola" });
	solution({ "mislav", "stanko", "mislav", "ana" }, { "stanko", "ana", "mislav" });
}