class Solution {
public:
    int longestPalindrome(string s) {
        std::unordered_set<char> charSet;
        int ans = 0;
        
        for (char c : s) {
            if (charSet.find(c) != charSet.end()) {
                charSet.erase(c);
                ans += 2;
            } else {
                charSet.insert(c);
            }
        }
        
        if (!charSet.empty()) ans++;
        
        return ans;
    }
};
