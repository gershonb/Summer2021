 public int[] twoSum(int[] nums, int target) {
        //create array with each number in index of that number (7 goes in pos 7)
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //add numbers to map with index as value
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){map.put(nums[i], i);}
            //(Can't add double keys to HashMap) so- check for doubles and if it is the answer return. Otherwise, they don't matter.
            else{if (nums[i] * 2 == target){
                return new int[]{map.get(nums[i]), i};
            }
            }
        }

        //loop through array and check if second number exists; if it does return the index and the value(index) in the hash map
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(target - nums[j])){
                //make sure it isn't finding itself
                if(!map.get(target - nums[j]).equals(map.get(nums[j]))){
                return new int[]{j, map.get(target - nums[j])};}
            }
        }


        return new int[]{-1, -1};
    }
