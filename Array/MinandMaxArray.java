class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i : arr){
            if(min>i){
                min=i;
            }
            if(max<i){
                max=i;
            }
        }
        list.add(min);
        list.add(max);
        return list;
    }
}
