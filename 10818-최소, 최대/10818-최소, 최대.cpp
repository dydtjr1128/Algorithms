#include <iostream>

int main() {
	std::ios::sync_with_stdio(false); std::cin.tie(0);
	int maxValue = -1000000, minValue = 1000000;
	int n,m;
	std::cin >> n;
	for (int i = 0; i < n; ++i) {
		std::cin >> m;
		if (m > maxValue) {
			maxValue = m;
		}
		if (m < minValue) {
			minValue = m;
		}
	}
	printf("%d %d", minValue, maxValue);
}
