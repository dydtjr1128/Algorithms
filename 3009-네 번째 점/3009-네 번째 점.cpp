#include <iostream>

int main() {
	int x1, x2, x3, x4, y1, y2, y3, y4;
	std::cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3;

	if (x1 == x2) {
		x4 = x3;
		if (y3 == y1) {
			y4 = y2;
		}
		else { // y3 == y2
			y4 = y1;
		}
	}
	else { // x2 == x3
		x4 = x1;
		if (y1 == y2) {
			y4 = y3;
		}
		else { // y1 == y3
			y4 = y2;
		}
	}


	std::cout << x4 << " " << y4;

}