class Solution {
    private Set<String> set = new HashSet<>();
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        for (String w : words) {
            set.add(w);
        }

        List<String> ans = new ArrayList<>();
        for (String w : words) {
            if (isConcat(w)) {  
                ans.add(w);    
            }
        }

        return ans;
    }

    private boolean isConcat(String s) {        
        for (int i = 0; i < s.length(); i++) {
            String prefix = s.substring(0, i);  
            String suffix = s.substring(i);    
            if (set.contains(prefix) && (set.contains(suffix) || isConcat(suffix))) {
                return true;    
            }
        }

        return false;  
    }
}
