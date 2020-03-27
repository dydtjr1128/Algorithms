#include <iostream>
#include <unordered_set>

int main() {
    int n;
    std::unordered_set<int> set;
    for (int i = 0; i < 10; ++i) {
        std::cin >> n;
        set.insert(n % 42);        
    }
    std::cout << set.size();
}
