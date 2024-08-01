class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;

        for(String s : details){
            // System.out.println(s.substring(11, 13));
            if(Integer.parseInt(s.substring(11, 13)) > 60) ans++;
        }

        return ans;
    }
}
