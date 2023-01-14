class Solution {
    // Global Array(Size : 26) to store all  characters Mapping
    int[] map;
    public void update(int x , int y)
    {
        x = get(x);
        y = get(y);
        if(x>y)
        map[x] = y;
        else if(x<y)
        map[y] = x;
    }
    //getting lexicographically smallest mapping of x
    int get(int x)
    {
        if(map[x]==x)
        return x;
        else
        {
          map[x] = get(map[x]);
        } return map[x];
    }
    // Main Driver Function
    public String smallestEquivalentString(String s1, String s2, String base){
    map = new int[26];
    //initially map each char to itself
    //using index of alphabet in alphabets as index of array e.g. a->0,b->1......
    for(int i = 0; i<26;i++)
    map[i] = i;

    //update exact mapping of char from s1 and s2
    for(int i = 0 ;i<s1.length();i++)
    update(s1.charAt(i)-'a',s2.charAt(i)-'a');

    //constructing result string by replacing each char of base String to its appropriate replacement
    String res = "";
    for(int i = 0; i<base.length(); i++)
    {
        res+=(char)(get(base.charAt(i)-'a')+'a');
    }
    return res;
    }
}
