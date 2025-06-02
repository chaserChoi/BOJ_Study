class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int walletMax = wallet[0] > wallet[1] ? wallet[0] : wallet[1];
        int walletMin = wallet[0] < wallet[1] ? wallet[0] : wallet[1];
        int billMax = bill[0] > bill[1] ? bill[0] : bill[1];
        int billMin = bill[0] < bill[1] ? bill[0] : bill[1];
        
        while (billMin > walletMin || billMax > walletMax) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            
            billMax = bill[0] > bill[1] ? bill[0] : bill[1];
            billMin = bill[0] < bill[1] ? bill[0] : bill[1];
            
            answer++;
        }
        
        return answer;
    }
}