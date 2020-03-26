#include <iostream>

int main()
{
	int n;
	std::cin >> n;

	for (int i = 1; i < n; i++) {
		for (int j = 0; j < i-1; j++) {
			std::cout << " ";
		}
		for (int j = 2 * (n - i); j >= 0; j--) {
			std::cout << "*";
		}
		std::cout << std::endl;
	}

	for (int i = 0; i < n-1; i++)
		std::cout << " ";
	std::cout << "*";
	if (n > 1)
		std::cout << std::endl;

	for (int i = n - 1; i > 0; i--) {
		for (int j = 0; j < i-1; j++) {
			std::cout << " ";
		}
		for (int j = 2 * (n - i); j >= 0; j--) {
			std::cout << "*";
		}
		if (i > 1)
			std::cout << std::endl;
	}
}
