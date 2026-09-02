class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int arr[] = new int[26];
        for(int i=0;i<sentence.length();i++){
           arr[(int)(sentence.charAt(i) - 'a')]++;
        }
        for(int elem : arr){
            if(elem==0){
                return false;
            }
        }
        return true;
    }
}