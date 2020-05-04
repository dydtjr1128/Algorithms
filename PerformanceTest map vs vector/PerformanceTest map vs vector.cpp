#include <iostream>
#include <ctime>
#include <chrono>
#include <vector>
#include <unordered_map>

int main() {
	int size = 1000000;
	int c = 0;
	std::vector<int> vector;
	std::unordered_map<int, int> map;

	srand(time(NULL));

	for (int i = 0; i < size; ++i) {
		int n = (rand() % 10000) + 1;
		vector.push_back(n);
		map.emplace(i, n);
	}

	auto s = std::chrono::system_clock::now();
	c = 0;
	std::cout << "vector loop : ";
	for (const auto& n : vector) {
		c = n;
	}
	std::cout << std::chrono::duration<double>(std::chrono::system_clock::now() - s).count() << "ms" << std::endl;

	s = std::chrono::system_clock::now();
	c = 0;
	std::cout << "unordered_map loop : ";
	for (const auto& f : map) {
		c = f.second;
	}
	std::cout << std::chrono::duration<double>(std::chrono::system_clock::now() - s).count() << "ms" << std::endl;

}