class solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int element : arr) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        Set<Integer> uniqueValues = new HashSet<>();
        for (Integer value : countMap.values()) {
            if (!uniqueValues.add(value)) {
                return false;
            }
        }
        return true;
    }
}
