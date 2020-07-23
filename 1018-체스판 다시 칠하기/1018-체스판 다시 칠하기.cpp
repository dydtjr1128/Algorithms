#include <iostream>
#include <string>
#include <algorithm>

int minVal = 50*50;
int n, m;
char** map;

std::string w_map[8] = {
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW"
};
std::string b_map[8] = {
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB"
};

int w_start_check(int row, int col) {
	int count = 0;

	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if (map[row + i][col + j] != w_map[i][j])
				++count;
		}
	}
	return count;
}

int b_start_check(int row, int col) {
	int count = 0;

	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if (map[row + i][col + j] != b_map[i][j])
				++count;
		}
	}
	return count;
}

int main() {
	std::cin >> n >> m;
	map = new char*[n];
	for (int i = 0; i < n; i++) {
		map[i] = new char[m];
		for (int j = 0; j < m; j++) {			
			std::cin >> map[i][j];			 
		}
	}

	for (int i = 0; i <= n - 8; i++) {
		for (int j = 0; j <= m - 8; j++) {
			int n = std::min(w_start_check(i, j), b_start_check(i, j));
			if (minVal > n)
				minVal = n;
		}
	}
	std::cout << minVal;
}
