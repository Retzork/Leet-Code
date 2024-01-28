// tbh i dont really get this one, especially the 3 nested loop
// i get that it loop through all i j collumn then search the target with prefix and hash
// but i dont really get the logic
 
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int len1 = matrix.length, len2 = matrix[0].length, count = 0;

        for (int row = 0; row < len1; row++) {
            for (int col = 1; col < len2; col++) {
                matrix[row][col] += matrix[row][col - 1];
            }
        }
        
        for(int col1 = 0; col1 < len2; col1++){
            for(int col2 = col1; col2 < len2; col2++){
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0,1);

                int sum = 0;
                for(int row = 0; row < len1; row++){
                    sum += matrix[row][col2];
                    if(col1 > 0){
                        sum -= matrix[row][col1 - 1];
                    }

                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }                
            }
        }

        return count;
    }
}
