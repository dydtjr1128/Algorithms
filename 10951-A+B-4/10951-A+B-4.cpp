#include <iostream>

int main() {
	int a, b;
	while (true) {
		std::cin >> a;
		std::cin >> b;
		if (std::cin.eof())
			break;
		std::cout << (a + b) << std::endl;
	}
}