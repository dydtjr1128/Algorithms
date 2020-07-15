#include <iostream>

int main(){    
	int n, m;
	std::cin >> n >> m;
	int **map = new int*[n];
	for (int i = 0; i < n; i++) {
		map[i] = new int[m];
		for (int j = 0; j < m; j++) {
			std::cin >> map[i][j];
		}
	}
	

	std::cout << "Hello World!\n";
}
