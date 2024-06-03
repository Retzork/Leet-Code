class Solution {
public:
    int appendCharacters(string s, string t) {
        int x = 0, y = 0;
        while(x < s.length() && y < t.length()){
            if(s[x] == t[y]) y++;
            x++;
        }
        return t.length() - y;
    }
};
