#include <iostream>

int main() {
	int a, b, c, n, r;
	std::cin >> a >> b >> c;
	n = c - b;
	if (n <= 0) {
		r = -1;
	}
	else {
		r =  a / n + 1;
	}
	std::cout << r;
}