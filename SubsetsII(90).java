/* 
LEETCODE - 90 
					(SUBSETS - II)
nums = [1,2,2]
Output : [[] , [1] , [1,2] ,[1,2,2] , [2] , [2,2] ]

*/

class Solution{
	public List<List<Integer>> subsetsWithDup(int [] nums){
		Arrays.sort(nums);
		backtrack(nums , 0 , new ArrayList<>() , result);
		return result ;
	}
	private void backtrack(
			int[]nums , 
			int index ,
			List<Integer>current ,
			List<List<Integer>>result 
	){
		result.add(new ArrayList<>(current));
		for(int i = index ; i <nums.length ; i++){
			//skip duplicates at the same level 
			if(i>index && nums[i] == nums[i-1]){
				continue ;
				
			}
			// choose 
			current.add(nums[i]);
			// explore 
			backtrack(nums , i+1 , current , result);
			//undo
			current.remove(current.size() -1 );
		}
	}
} 