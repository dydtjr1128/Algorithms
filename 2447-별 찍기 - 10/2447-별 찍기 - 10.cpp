#include <iostream>

void draw(int x, int y, int size) {
	if ((x / size) % 3 == 1 && (y / size) % 3 == 1)
		std::cout << ' ';
	else {
		if (size / 3 == 0)
			std::cout << '*';
		else
			draw(x, y, size / 3);
	}
}

int main() {
	int n;
	std::cin >> n;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			draw(j, i, n);
		}
		std::cout << std::endl;
	}
	
}