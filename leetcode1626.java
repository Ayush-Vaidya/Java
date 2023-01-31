class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        if(scores.length==0 || ages.length==0)
            return 0;
        int n=scores.length;
        int[][] team = new int[n][2];
        for(int i=0;i<n;i++)
        {
            team[i][0]=ages[i];
            team[i][1]=scores[i];
        }
        Arrays.sort(team, (a,b)-> ( a[0]==b[0]? a[1]-b[1]:a[0]-b[0]));
        
        int[] dp=new int[n];
        dp[0]=team[0][1];
        int max=dp[0];
        for(int i=1;i<n;i++)
        {
            dp[i]=team[i][1];
            for(int j=0;j<i;j++)
            {
                if(team[j][1]<=team[i][1])
                {
                    dp[i]= Math.max( dp[i] ,dp[j]+team[i][1]);
                }
            }
            max= Math.max( max, dp[i]);
        }
        
        return max;
        
    }
}
