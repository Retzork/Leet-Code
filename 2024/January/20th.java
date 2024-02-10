class solution {
    public int sumSubarrayMins(int[] arr) {
        int min = 0, len = arr.length;
        if(len == 1) return arr[0];

        Deque<Integer> s1 = new LinkedList<>(), s2 = new LinkedList<>();
        int[] kanan = new int[len], kiri = new int[len];

        for (int i = 0; i < len; ++i) {
            while (!s2.isEmpty() && arr[s2.peek()] >= arr[i]) s2.pop();
            kiri[i] = s2.isEmpty() ? -1 : s2.peek();
            s2.push(i);
        }
        for(int i = len -1; i >= 0; --i){
            while(!s1.isEmpty() && arr[s1.peek()] > arr[i]) s1.pop();
            kanan[i] = s1.isEmpty() ? len : s1.peek();
            s1.push(i);
        }

        long sum = 0, mod = (int) 1e9 + 7;
        for(int i = 0; i < len; i++){
            sum += (long) (i - kiri[i]) * (kanan[i] - i) % mod * arr[i] % mod;
            sum %= mod;
        }
        return (int) sum;
    }
}
