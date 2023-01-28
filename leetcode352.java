class SummaryRanges {

        /** Initialize your data structure here. */
        Set<int []> curSet;
        Set<Integer> curData;
        public SummaryRanges() {
            curSet = new HashSet<>();
            curData = new HashSet<>();
        }

        //O(1)
        public void addNum(int val) {
            if(!curData.contains(val)){
                int[] interval = new int[]{val, val};
                if(curData.contains(val - 1)){
                    for(int[] value : curSet){
                        if(value[1] == val - 1){
                            interval[0] = value[0];
                            curSet.remove(value);
                            break;
                        }
                    }
                }
                if(curData.contains(val + 1)){
                    for(int[] value : curSet){
                        if(value[0] == val + 1){
                            interval[1] = value[1];
                            curSet.remove(value);
                            break;
                        }
                    }
                }
                curData.add(val);
                curSet.add(interval);
            }
        }

        public int[][] getIntervals() {
            int [][] result = new int[curSet.size()][];
            int i = 0;
            for(int[] value : curSet){
                result[i++] = value;
            }
            //O(nlogn)
            Arrays.sort(result, (a, b) -> a[0] - b[0]);
            return result;
        }
    }
