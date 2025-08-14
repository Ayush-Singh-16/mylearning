class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<Boolean>();
        int c=0;
        for(int i=0;i<candies.length;i++){
            c=candies[i]+extraCandies;
            list.add(true);
            for(int j=0;j<candies.length;j++){
                if(c<candies[j]){
                    list.set(i,false);
                    break;
                }
            }
        }
        return list;
    }
}