#include <iostream>

int main() {
	int a, b, c;
	int max, t1, t2;
	while (true) {
		std::cin >> a >> b >> c;
		if (a == 0 && b == 0 && c == 0)
			break;
		else {
			if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
				std::cout << "right" << std::endl;
			}
			else {
				std::cout << "wrong" << std::endl;
			}
		}
	}
}