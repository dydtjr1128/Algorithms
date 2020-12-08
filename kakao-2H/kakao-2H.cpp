#include <string>
#include <vector>
#include <algorithm>
#include <unordered_map>
#include <unordered_set>
using namespace std;

std::vector<std::vector<char>> Combination(vector<char> container, int r) {

	int len = container.size();
	if (len < r || r < 0)
		return {};

	std::vector<std::vector<char>> totVec;
	std::vector<char> tempVec(r);

	std::vector<bool> v(len);
	std::fill(v.end() - r, v.end(), true);
	int idx;
	do {
		idx = 0;
		for (int i = 0; i < len; ++i) {
			if (v[i]) {
				tempVec[idx++] = *(container.begin() + i);
			}
		}
		totVec.push_back(tempVec);
	} while (std::next_permutation(v.begin(), v.end()));

	return totVec;
}

unordered_map<string, int> checkValues(vector<string>& orders, vector<int>& course) {
	unordered_map<string, int> comMap;
	for (auto& cour : course) {
		for (auto& vec : orders) {
			vector<char> order;
			for (auto& i : vec)
				order.push_back(i);
			for (auto& orderCombination : Combination(order, cour)) {
				sort(orderCombination.begin(), orderCombination.end());
				string conStr;
				for (auto& el : orderCombination) {
					conStr += el;
				}
				if (comMap.find(conStr) != comMap.end()) {
					comMap.at(conStr)++;
				}
				else {
					comMap.insert(pair<string, int>(conStr, 1));
				}
			}
		}
	}
	return comMap;
}

vector<string> solution(vector<string> orders, vector<int> course) {
	vector<string> answer;

	auto comMap = checkValues(orders, course);

	for (auto& cour : course) {
		int max = 0;
		for (auto& ree : comMap) {
			if (ree.first.length() == cour) {
				if (ree.second > max) {
					max = ree.second;
				}

			}

		}
		for (auto& ree : comMap) {
			if (ree.second == max && ree.first.length() == cour && max > 1) {
				answer.push_back(ree.first);
			}

		}

	}
	sort(answer.begin(), answer.end());

	return answer;
}

int main() {

	vector<string> strVec{ "XYZ", "XWY", "WXA" };
	auto result = solution(strVec, { 2, 3, 4 });

	for (auto& r : result)
		cout << r << endl;

	return 0;
}