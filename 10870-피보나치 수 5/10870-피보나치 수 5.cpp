#include <iostream>

int n, m = 0;

int fibo(int a, int b) {
	++m;
	if (m == n)
		return a + b;

	return fibo(a + b, a);
}

int main() {	
	std::cin >> n;
	if (n == 0) {
		std::cout << 0;
	}
	else {
		std::cout << fibo(0, 1);
	}
}
