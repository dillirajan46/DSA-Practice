class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = x;
        int ans = 0;
        while(x!=0){
            int lastd = x % 10;
            ans = ans * 10 + lastd;
            x = x / 10;
        }
        if(ans==temp){
            return true;
        }
        else{
            return false;
        }
        //practicing git and github
    }
}