package misc.problem_solving;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class CountItemsMatchingARule {
    public static void main(String[] args) {

        // Create listOfLists in Java
        List<List<String>> items = new ArrayList<>();

        // Creating innerList
        List<String> innerList = new ArrayList<>();

        // Adding elements to innerList
        innerList.add("phone");
        innerList.add("blue");
        innerList.add("pixel");

        // Adding innerList to listOfLists
        items.add(innerList);

        // Creating another inner list
        List<String> innerList2 = new ArrayList<>();

        // Adding elements to innerList2
        innerList2.add("computer");
        innerList2.add("blue");
        innerList2.add("lenovo");

        // Adding innerList2 to listOfLists
        items.add(innerList2);

        // Printing listOfLists elements
        System.out.println(items);

        String rules = "color";
        String ruleValue = "blue";

        System.out.println(countMatches2(items, rules, ruleValue));

    }

    // pure java solution
    // O(n), O(1)
    static int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, index=0;
        if(ruleKey.equals("color"))
            index = 1 ;
        else if(ruleKey.equals("name"))
            index = 2 ;

        for(int i=0 ; i<items.size() ; i++)
            if((items.get(i).get(index)).equals(ruleValue))
                count++;
        return count ;
    }
}
