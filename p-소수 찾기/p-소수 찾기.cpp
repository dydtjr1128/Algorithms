#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <unordered_set>

bool IsDecimal(const int& n) {
    if (n < 2)
        return false;

    for (int i = 2; i < n / 2 + 1; i++)
        if (n % i == 0)
            return false;

    return true;
}



int solution(std::string numbers) {
    int answer = 0;
    std::vector<int> val;
    for (int i = 0; i < numbers.size(); i++) {
        val.emplace_back((int)(numbers[i]-'0'));
    }
    std::sort(val.begin(), val.end());
    std::vector<int> ans;
    std::unordered_set<int> set;
    do {
        for (int i = 0; i <= val.size(); i++) {
            int tmp = 0;
            for (int j = 0; j < i; j++) {
                tmp = (tmp * 10) + val[j];
                if (set.find(tmp) == set.end()) {
                    ans.push_back(tmp);
                    set.insert(tmp);
                }                    
            }
        }    
    } while (std::next_permutation(val.begin(), val.end()));

    
    for (auto& i : ans) {
        if (IsDecimal(i))
            ++answer;
    }

    return answer;
}

int main(){
    std::cout << solution("17") << std::endl;
    std::cout << solution("011") << std::endl;
}