#include <iostream>

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int answer = 100;
void dfs(string begin, string target, vector<string> words, vector<bool>& useCheck, int cnt) {
    for (int i = 0; i < words.size(); i++) {
        int count{ 0 };
        for (int j = 0; j < words[j].length(); j++)
            if (!useCheck[i] && begin[j] != words[i][j])    count++;
        if (count == 1) {
            if (target == words[i] && answer > cnt + 1) {
                answer = cnt + 1;
                return;
            }
            useCheck[i] = true;
            dfs(words[i], target, words, useCheck, cnt + 1);
            useCheck[i] = false;
        }
    }
}

int solution(string begin, string target, vector<string> words) {
    vector<bool> useCheck(words.size(), false);
    dfs(begin, target, words, useCheck, 0);
    if (answer == 100)   return 0;
    return answer;
}

void print(string begin, string target, vector<string> words, int answer) {
    ::answer = 100;
    int t = solution(begin, target, words);
    cout << t << " , ";
    if (t == answer)        cout << "정답" << endl;
    else        cout << "틀림" << endl;
}

int main() {
    print("hit", "cog", { "hot", "dot", "dog", "lot", "log", "cog" }, 4);
    print("hit", "cog", { "hot", "dot", "dog", "lot", "log" }, 0);
    print("hot", "lot", { "dot", "dog", "lot", "log" }, 1);
    print("hit", "wow", { "hot", "dot", "dog", "lot", "log", "cog", "wow" }, 0);
    return 0;
}