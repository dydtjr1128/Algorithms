#include <iostream>
#include <algorithm>

int main()
{
	int num[3], d1, d2;
	for (int i = 0; i < 3; i++) {
		std::cin >> num[i];
	}
	int* min = std::min_element(num, num + 3);
	std::cin >> d1;
	std::cin >> d2;
	std::cout << *min + std::min(d1, d2) - 50;
}

