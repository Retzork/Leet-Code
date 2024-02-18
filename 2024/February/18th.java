class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int[] ans = new int[n];
        long[] times = new long[n];
        
        Arrays.sort(meetings, Comparator.comparingInt(meeting -> meeting[0]));
        
        for(int[] meeting : meetings){
            int start = meeting[0];
            int end = meeting[1];
            
            boolean foundRoom = false;
            
            int minIdx = -1;
            long minVal = Long.MAX_VALUE;
            
            for(int i = 0; i < n; i++){
                if(times[i] < minVal){
                    minVal = times[i];
                    minIdx = i;
                }
                if(times[i] <= start){
                    foundRoom = true;
                    ans[i]++;
                    times[i] = end;
                    break;
                }
            }
            if(!foundRoom){
                ans[minIdx]++;
                times[minIdx] += end - start;
            }
        }
        
        int maxx = -1, idx = -1;
        
        for(int i = 0; i < n; i++){
            if(ans[i] > maxx){
                maxx = ans[i];
                idx = i;
            }
        }
        
        return idx;
    }
}
