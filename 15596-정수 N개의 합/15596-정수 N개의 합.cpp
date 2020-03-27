#include <vector>
long long sum(std::vector<int>& a) {
	long long result = 0;
	for (auto val : a) {
		result += val;
	}
	return result;
}
