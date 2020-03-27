#include <iostream>

int main() {
	int maxValue = 0, maxIndex = 0;
	int n;
	for (int i = 1; i <= 9; ++i) {
		std::cin >> n;
		if (n > maxValue) {
			maxValue = n;
			maxIndex = i;
		}
	}
	printf("%d\n%d", maxValue, maxIndex);

}
