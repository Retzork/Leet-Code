class 23rd {
    private int res = 0;
    
    public int maxLength(List<String> arr) {
        int len = arr.size();
        dfs(arr,"", 0);
        return res;
    }

    private void dfs(List<String> arr, String path, int idx) {
        boolean isUniqueChar = valid(path);

        if (isUniqueChar) res = Math.max(path.length(), res);
        if (idx == arr.size() || !isUniqueChar) return;

        for (int i = idx; i < arr.size(); i++) {
            dfs(arr, path + arr.get(i), i + 1);
        }
    }
    private boolean valid(String input){
        HashSet<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!charSet.add(c)) return false;
        }
        return true;
    }
}
