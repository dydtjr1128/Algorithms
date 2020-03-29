#include <iostream>

int main() {
	int x, y, w, h;
	int max = w > h ? w : h ;
	std::cin >> x >> y >> w >> h;
	if (max > x) max = x;
	if (max > y) max = y;
	if (max > w-x) max = w-x;
	if (max > h-y) max = h-y;
	std::cout << max;
}