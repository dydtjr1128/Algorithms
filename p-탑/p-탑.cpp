#include <iostream>
#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> heights) {
    vector<int> answer;
    int len = heights.size();
    int num;
    bool isExist;
    for (int i = len - 1; i >= 0; i--) {
        num = heights[i];
        isExist = false;
        for (int j = i-1; j >= 0; j--) {
            if (num < heights[j]) {
                answer.insert(answer.begin(), j + 1);
                isExist = true;
                break;
            }
        }
        if (isExist == false) {
            answer.insert(answer.begin(), 0);
        }
    }

    return answer;
}

int main() {
    auto a = solution({ 6,9,5,7,4 });
    for (auto i : a) {
        std::cout << i << " ";
    }
    std::cout << std::endl;

    auto b = solution({ 3,9,9,3,5,7,2 });
    for (auto i : b) {
        std::cout << i << " ";
    }
    std::cout << std::endl;

    auto c = solution({ 1,5,3,6,7,6,5 });
    for (auto i : c) {
        std::cout << i << " ";
    }
    std::cout << std::endl;
}
