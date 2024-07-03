// class Solution { my solution
//     public int[] intersect(int[] nums1, int[] nums2) {
//         Map<Integer, Integer> occ1 = countOccurrences(nums1);
//         Map<Integer, Integer> occ2 = countOccurrences(nums2);

//         List<Integer> intersectionList = new ArrayList<>();
        
//         for (Map.Entry<Integer, Integer> entry : occ1.entrySet()) {
//             int num = entry.getKey();
//             if (occ2.containsKey(num)) {
//                 int minOccurrences = Math.min(entry.getValue(), occ2.get(num));
//                 for (int i = 0; i < minOccurrences; i++) {
//                     intersectionList.add(num);
//                 }
//             }
//         }
        
//         int[] intersectionArray = new int[intersectionList.size()];
//         for (int i = 0; i < intersectionList.size(); i++) {
//             intersectionArray[i] = intersectionList.get(i);
//         }
        
//         return intersectionArray;
//     }

//     public static Map<Integer, Integer> countOccurrences(int[] array) {
//         Map<Integer, Integer> occurrenceMap = new HashMap<>();
        
//         for (int num : array) {
//             if (occurrenceMap.containsKey(num)) {
//                 occurrenceMap.put(num, occurrenceMap.get(num) + 1);
//             } else {
//                 occurrenceMap.put(num, 1);
//             }
//         }
        
//         return occurrenceMap;
//     }
    
// }
class Solution { // faster solution
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while( i < l1 && j < l2)
        {
            if(nums1[i] < nums2[j])
            {
                i++;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
            }
            else
            {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
