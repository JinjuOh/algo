package programmers.hashPractice;

import util.PerformCheck;

import java.util.HashMap;

public class Marathon {

    public static void main(String[] args) {

        PerformCheck.setStartTime();

        String[] participant = new String[] {};
        String[] completion = new String[] {};

        Marathon m = new Marathon();
        PerformCheck.setStartTime();
        m.solution(participant, completion);
        PerformCheck.setEndTime();
        m.solution2(participant, completion);

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

    public String solution2(String[] participant, String[] completion) {

        if(participant.length < 1 || participant.length > 100000) {
            return null;
        }

        if(completion.length != participant.length - 1 ) {
            return null;
        }

        HashMap<String, Integer> map = new HashMap();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0)+1);
        }
        for (String c : completion) {
            map.put(c, map.getOrDefault(c, 0)-1);
        }

        return map.entrySet().stream().filter(m->m.getValue()>0).findAny().get().getKey();
    }

}
