class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int occurrences = entry.getValue();
            if (k >= occurrences) {
                k -= occurrences;
                count++;
            } else {
                break;
            }
        }

        return entryList.size() - count;
    }
}
