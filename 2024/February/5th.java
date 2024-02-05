class 5th {
    public int firstUniqChar(String s) {
        // o(n) solution
        // HashMap<Character, Integer> charPositionMap = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
            
        //     if (charPositionMap.containsKey(c)) {
        //         charPositionMap.put(c, -1);
        //     } else {
        //         charPositionMap.put(c, i);
        //     }
        // }

        // int ans = Integer.MAX_VALUE;
        // for (int position : charPositionMap.values()) {
        //     if (position != -1 && position < ans) {
        //         ans = position;
        //     }
        // }

        // return ans == Integer.MAX_VALUE ? -1 : ans;

        // o(1) solution
        int ans = Integer.MAX_VALUE;
        for(char c = 'a'; c <= 'z' ; c++){
            int index = s.indexOf(c);

            if(index != -1 && index == s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
