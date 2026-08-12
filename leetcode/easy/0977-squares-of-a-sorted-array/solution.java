class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        //seperate neg and pos
        for(int num : nums ){
            if (num < 0) 
                neg.add(num);
                else 
            pos.add(num);
        }
        
        //case-1 (No neg)
        if (neg.size() == 0) {
            for (int i=0; i<pos.size(); i++) 
            pos.set(i, pos.get(i) * pos.get(i));
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }
        //case-2 (No pos)
        if (pos.size() == 0) {
            for (int i=0; i<neg.size(); i++)
                neg.set(i, neg.get(i) * neg.get(i));
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
            }
        //case-3 Both Neg and pos
         int i = 0, j = 0, id = 0;   
        int n1=neg.size();
        int n2= pos.size();
        int[] res= new int[n1+n2];

        // Square negatives and reverse them 
        for (i=0; i<n1; i++)
            neg.set(i, neg.get(i) * neg.get(i));
        Collections.reverse(neg);

        //Square Pos
        for(i=0; i<n2; i++) 
            pos.set(i, pos.get(i) * pos.get(i));

        // Merge two sorted lists 
        i =0;
        j=0;
        while (i<n1 && j<n2) {
            if (neg.get(i) <= pos.get(j)) {
                res[id++] = neg.get(i++);
            }
            else {
                res[id++] = pos.get(j++);
            }
        } 

        while (i<n1)
        res[id++] = neg.get(i++);

        while (j<n2) 
        res[id++] = pos.get(j++);
                    return res;
         
        
        
    }
}
