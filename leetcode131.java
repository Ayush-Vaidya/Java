class Solution {

    List<List<String>> list = new ArrayList<>();
	
    public List<List<String>> partition(String s) {
        func(s,new ArrayList<>());
        return list;
    }
    
    public void func(String s,ArrayList<String> li){
        if(s.length()==0){
            list.add(new ArrayList(li));
            return;
        }
		//partition string at every index, prefix contains first part, suffix contains second part
        for(int i=0;i<s.length();i++){
            String prefix = s.substring(0,i+1);
            String suffix = s.substring(i+1);
			
            //if prefix is valid palindrome, then find palindromes in rest of the string
            if(isPalin(prefix)){
                li.add(prefix);
                func(suffix,li);
                li.remove(li.size()-1);
            }
        }
    }
	
    //check palindrome
    public boolean isPalin(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }  
}
