class Solution {
		public int getAnswer(String str,int k,char ch)
		{
				int left = 0;
				int ans = 0;
				int count = 0;
				for(int i = 0;i<str.length();i++)
				{
						if(str.charAt(i) == ch)
						{
							count++;
						}
						while(count > k)
						{
								if(str.charAt(left) == ch)
										count--;
								left++;
						}
						ans = Math.max(ans,i-left+1);
				}
				return ans;
		}
    public int maxConsecutiveAnswers(String str, int k) {
        return Math.max(getAnswer(str,k,'T'),getAnswer(str,k,'F'));
    }
}