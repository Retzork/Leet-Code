class Solution {
    public double averageWaitingTime(int[][] customers) {
        int availableAt = 0;
        double totalWait = 0;
        for (int[] customer : customers) {
            int arrival = customer[0];
            availableAt = Math.max(availableAt, arrival) + customer[1];
            totalWait += availableAt - arrival;
        }
        return totalWait / customers.length;
    }
}
