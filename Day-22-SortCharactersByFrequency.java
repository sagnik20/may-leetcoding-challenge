class Solution {
    /*
    
    // Using Java Streams 
    public String frequencySort(String s) {
        return s.chars()
                .mapToObj(Character::toString)                        //map to string character
                .collect(Collectors.groupingBy(Function.identity()))  //collect to Map<String, List<String>>
                .values()                                             //drop keys, we care only about values
                .stream()
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed()) //sort by list size in descending order
                .flatMap(strings -> strings.stream())                                 //flat map to stream of character strings
                .collect(Collectors.joining());                                       //build a string from the stream
    }
    
    */
    
    //StringBuilder with PriorityQueue Approach
     public String frequencySort(String s) {
        if(s == null || s.length() == 0) return s;
        
        int[] cnt_arr = new int[256];
        for(char c : s.toCharArray()){
            cnt_arr[c]++;
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> cnt_arr[b] - cnt_arr[a]);
        for(int i = 0; i < 256; i++){
            pq.offer((char)i);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Character c = pq.poll();
            for(int i = 0; i < cnt_arr[c]; i++){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
