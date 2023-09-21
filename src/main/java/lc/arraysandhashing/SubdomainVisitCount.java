package lc.arraysandhashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {
    // TC/SC: O(n)
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: cpdomains) {
            String[] array = s.split(" ");
            int number = Integer.parseInt(array[0]);
            int length = array[1].length();
            if (map.containsKey(array[1])) {
                map.put(array[1], map.get(array[1]+number));
            } else {
                map.put(array[1], number);
            }

            for (int i=0; i<length; i++) {
                if(array[1].charAt(i) == '.') {
                    String temp = array[1].substring(i+1, length);
                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + number);
                    } else {
                        map.put(temp,number);
                    }
                }
            }
        }
        List<String> answer = new LinkedList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            String number = entry.getValue() + "";
            answer.add(number + " " + entry.getKey());
        }
        return answer;
    }

    public static void main(String[] args) {
        SubdomainVisitCount svc = new SubdomainVisitCount();
        List<String> result = svc.subdomainVisits(new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
        System.out.println(result);
    }
}
