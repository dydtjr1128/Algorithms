#include <iostream>

#include <string>
#include <vector>

using namespace std;

bool dfs(vector<vector<int>>& computers, int n) {
    if (computers[n][n] == 0)
        return false;

    computers[n][n] = 0;

    for (int i = 0; i < computers.size(); i++) {
        if (computers[n][i] == 1)
            dfs(computers, i);
    }
    return true;
}

int solution(int n, vector<vector<int>> computers) {
    int answer = 0;

    for (int i = 0; i < computers.size(); i++) {
        if(computers[i][i] == 1 && dfs(computers, i))
            ++answer;
    }

    return answer;
}

int main() {
    std::cout << solution(3, { {1, 1, 0}, {1, 1, 0}, {0, 0, 1} }) << std::endl;
}
