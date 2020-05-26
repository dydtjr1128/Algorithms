#include <iostream>

#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(int bridge_length, int weight, vector<int> truck_weights) {
    int answer = 0;

    int bridge_truck_weight = 0;
    int size = truck_weights.size();

    std::queue<int> onBridge;

    for (int i = 0; i < size; ++i) {
        int t = truck_weights[i];
        while (true) {
            if (onBridge.empty()) {
                onBridge.push(t);
                bridge_truck_weight += t;
                ++answer;
                break;
            }
            else if (onBridge.size() == bridge_length) {
                bridge_truck_weight -= onBridge.front();
                onBridge.pop();
            }
            else {
                if (bridge_truck_weight + t <= weight) {
                    bridge_truck_weight += t;
                    onBridge.push(t);
                    ++answer;
                    break;
                }
                else {
                    onBridge.push(0);
                    ++answer;
                }
            }
        }
    }

    return answer + bridge_length;
}

int main() {
    std::cout << solution(2, 10, {7, 4, 5, 6}) << std::endl;
    std::cout << solution(100, 100, { 10 }) << std::endl;
    std::cout << solution(100, 100, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }) << std::endl;
}

