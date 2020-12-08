#include <iostream>

int main() {
    int s = 0;
    for (int i = 0; i < 5; i++) {
        int n = 0;
        std::cin >> n;
        s += (n * n);
    }
    s %= 10;
    std::cout << s;
}