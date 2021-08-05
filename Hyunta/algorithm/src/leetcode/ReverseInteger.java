package leetcode;

public class ReverseInteger {
    class Solution {
        public int reverse(int x) {
            int rev = 0;
            while (x!=0) {

                int pop = x % 10;
                int newRev = rev * 10 + pop;
                if ((newRev - pop) / 10 != rev){
                    return 0;
                }
                rev = newRev;
                x = x/10;
            }

            return rev;
        }
    }
}
