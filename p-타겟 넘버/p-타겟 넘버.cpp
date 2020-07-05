#include <iostream>

#include <string>
#include <vector>

using namespace std;

int ans = 0;
void dfs(vector<int>& numbers, int target, int sum, int count) {
	if (count == numbers.size()) {
		if(sum == target)
			++ans;
		return;
	}

	dfs(numbers, target, sum + numbers[count], count + 1);
	dfs(numbers, target, sum - numbers[count], count + 1);
}


int solution(vector<int> numbers, int target) {
	dfs(numbers, target, 0, 0);

	return ans;
}
int main() {
	std::cout << solution({ 1,1,1,1,1 }, 3) << std::endl;
}