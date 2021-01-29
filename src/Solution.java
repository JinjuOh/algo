import java.util.*;

class Solution {

    public static void main(String[] args) {

    }
    public String solution(String[] participant, String[] completion) {

        if(participant.length < 1 || participant.length > 100000) {
            return null;
        }

        if(completion.length != participant.length - 1 ) {
            return null;
        }

        HashMap<String, Integer> pmap = new HashMap();

        for (String p : participant) {
            pmap.put(p, pmap.getOrDefault(p, 0)+1);
        }
        for (String c : completion) {
            pmap.put(c, pmap.getOrDefault(c, 0)-1);
        }
        for(String key : pmap.keySet()) {
            if(pmap.get(key)>0) {
                return key;
            }
        }

        return null;
    }
}