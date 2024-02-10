class solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> noLose = new ArrayList<>();
        List<Integer> oneLose = new ArrayList<>();

        Map<Integer, Integer> count = new HashMap<>();

        for(int[] match : matches){
            count.put(match[0], count.getOrDefault(match[0], 0) + 0);
            count.put(match[1], count.getOrDefault(match[1], 0) + 1);
        }

        count.forEach((key, value) -> {
            if(value == 0) noLose.add(key);
            if(value == 1) oneLose.add(key);
        });

        Collections.sort(noLose);
        Collections.sort(oneLose);

        ans.add(noLose);
        ans.add(oneLose);

        return ans;
    }
}
