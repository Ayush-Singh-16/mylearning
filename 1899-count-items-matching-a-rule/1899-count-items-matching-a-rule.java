class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        ArrayList<String> arr=new ArrayList<>();
        int out=0;
        int rk=0;
        if(ruleKey.equals("type")){
            rk=0;
        }
        else if(ruleKey.equals("color")){
            rk=1;
        }
        else if(ruleKey.equals("name")){
            rk=2;
        }
        for(int i=0;i<items.size();i++){
            
            
                if(items.get(i).get(rk).equals(ruleValue)){
                    out++;
                }
            
        }
        return out;
    }
}