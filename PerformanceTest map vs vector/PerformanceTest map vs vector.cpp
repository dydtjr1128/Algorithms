#include <iostream>
#include <ctime>
#include <chrono>
#include <vector>
#include <unordered_map>

int main() {
	int size = 100000;
	int c = 0;
	std::vector<int> vector;
	std::unordered_map<int, int> map;

	srand(time(NULL));
	int findVal = 0;
	for (int i = 0; i < size-1; ++i) {
		int n = (rand() % 10000) + 1;
		vector.push_back(n);
		map.emplace(i, n);			
	}
	int n = (rand() % 10000) + 1;
	vector.push_back(n);
	map.emplace(size-1, n);
	findVal = n;

	auto s = std::chrono::system_clock::now();
	c = 0;
	std::cout << "vector loop : ";
	for (const auto& n : vector) {
		//c += n;
		//c -= n / 2;
		//c -= n / 2;
		c = n;
	}
	std::cout << std::chrono::duration_cast<std::chrono::microseconds>(std::chrono::system_clock::now() - s).count() << "ms" << std::endl;

	s = std::chrono::system_clock::now();
	c = 0;
	std::cout << "unordered_map loop : ";
	for (const auto& f : map) {
		//int n = f.second;
		//c += n;
		//c -= n / 2;
		//c -= n / 2;
		c = f.second;
	}
	std::cout << std::chrono::duration_cast<std::chrono::microseconds>(std::chrono::system_clock::now() - s).count() << "ms" << std::endl;



	int loopSize = 10000;


	s = std::chrono::system_clock::now();
	c = 0;
	std::cout << "vector loop : ";
	for (int i = 0; i < loopSize; i++) {
		auto t = std::find(vector.begin(), vector.end(), findVal);
	}
	std::cout << std::chrono::duration_cast<std::chrono::microseconds>(std::chrono::system_clock::now() - s).count() << "ms" << std::endl;

	s = std::chrono::system_clock::now();
	c = 0;
	std::cout << "unordered_map loop : ";
	for (int i = 0; i < loopSize; i++) {
		auto t = map.find(findVal);
	}
	std::cout << std::chrono::duration_cast<std::chrono::microseconds>(std::chrono::system_clock::now() - s).count() << "ms" << std::endl;

}