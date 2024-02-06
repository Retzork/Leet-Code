class 6th {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> dict = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(String word : strs){
            System.out.println(word);

            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if (dict.containsKey(sortedString)){
                List<String> val = dict.get(sortedString);
                val.add(word);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(word);
                dict.put(sortedString, newList);
            }
        }

        for (Map.Entry<String, List<String>> entry : dict.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}
