class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int mostFrequentElement = nums[0];
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentElement = entry.getKey();
            }
        }
        
        return mostFrequentElement;
    }
}
