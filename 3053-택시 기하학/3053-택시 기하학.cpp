#include <iostream>
#include <cmath>


//원의 정의는 한 점에서 같은 거리에 놓인 점들을 의미한다. => 다이아몬드꼴
int main() {
	int r;
	std::cin >> r;
	double pi = 3.1415926535897931;

	double a1 = pi * r * r;
	double a2 = 2.0 * r * r;

	std::cout << std::fixed;
	std::cout.precision(6);
	std::cout << a1 << std::endl;
	std::cout << a2;
}
