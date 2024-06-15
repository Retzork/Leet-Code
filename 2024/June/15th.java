class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital){
        int len = profits.length, ans = w, j = 0;

        int[][] arr = new int[len][2];
        for (int i = 0; i < profits.length; i++) {
            arr[i][1] = profits[i];
            arr[i][0] = capital[i];
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int round = 0; round < k; round++) {
            while (j < len && arr[j][0] <= ans) {
                maxHeap.offer(arr[j][1]);
                j++;
            }

            if (maxHeap.isEmpty()) break;
            ans += maxHeap.poll();
        }

        return ans;
    }
}
