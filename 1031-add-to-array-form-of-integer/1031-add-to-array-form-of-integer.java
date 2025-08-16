class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            array.add(0,(num[i]+k)%10);
            k=(k+num[i])/10;
        }
        while(k>0){
            array.add(0,k%10);
                k/=10;
            }
        
        return array;
    }
}