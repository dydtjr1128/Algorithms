#include <algorithm>
#include <iostream>
#include <ctime>
#include <chrono>
#include <vector>
#include <unordered_map>

int main() {
	size_t size = 30000000, c = 0;
	std::vector<int> vector;
	std::unordered_map<int, int> map;

	srand((unsigned int)time(NULL));

	for (size_t i = 0; i < size; ++i) {
		int n = (rand() % 10000) + 1;
		vector.push_back(n);
	}

	auto s = std::chrono::system_clock::now();
	std::cout << "normal for loop : ";
	c = 0;
	auto ss = vector.size();
	for (auto i = 0; i < ss; ++i) {
		vector[i] *= 2;
		++c;
	}
	std::cout << std::chrono::duration<double>(std::chrono::system_clock::now() - s).count() << " seconds " << c << std::endl;

	s = std::chrono::system_clock::now();
	std::cout << "range-based loop : ";
	c = 0;
	for (auto& n : vector) {
		n *= 2;
		++c;
	}
	std::cout << std::chrono::duration<double>(std::chrono::system_clock::now() - s).count() << " seconds " << c << std::endl;

	s = std::chrono::system_clock::now();
	std::cout << "iterator-based loop : ";
	c = 0;
	for (auto i = vector.begin(); i != vector.end(); ++i) {
		*i *= 2;
		++c;
	}
	std::cout << std::chrono::duration<double>(std::chrono::system_clock::now() - s).count() << " seconds " << c << std::endl;

	s = std::chrono::system_clock::now();
	std::cout << "STL std::foreach loop : ";
	c = 0;
	std::for_each(vector.begin(), vector.end(), [&](int& i) { i *= 2; ++c; });

	std::cout << std::chrono::duration<double>(std::chrono::system_clock::now() - s).count() << " seconds " << c << std::endl;




}