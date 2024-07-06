// class Solution { my solution (o(n))
//     public int passThePillow(int n, int time) {
//         int ans = 1;
//         boolean ascending = true;
//         while(time > 0){
//             if(ascending){
//                 ans++;
//                 if(ans == n) ascending = false;
//             }else{
//                 ans--;
//                 if(ans == 1) ascending = true;
//             }
//             time--;
//         }

//         return ans;
//     }
// }

class Solution { // o(1) solution
    public int passThePillow(int n, int time) {
        int chunks = time / (n - 1);
        return chunks % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));
    }
}
