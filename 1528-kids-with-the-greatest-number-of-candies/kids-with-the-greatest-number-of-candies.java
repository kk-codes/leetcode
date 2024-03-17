class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //first i will find the maximum no of candies a kid have from candies array
        //create a new list to conatin array of boolean value
        //check whether the candies after adding extra candies is greater or equal to than maximum candies
        //if yes add true to the list in ith place else false.
        int n = candies.length;
        int maxCandies = candies[0];
        for(int element:candies)
        {
            if(element>maxCandies)
                maxCandies = element;
        }
        List<Boolean> list = new ArrayList<>();
        for(int element:candies)
        {
            if(element+extraCandies>=maxCandies)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}