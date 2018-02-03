package RecursionDP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PowerSet {

    /*
    Write a method to return all subsets of a set.
     */

    public List<HashSet> powerSet(HashSet set) {
        List<HashSet> list = new ArrayList<>();
        powerSetHelper(set, new HashSet(), list);
        return list;
    }

    private void powerSetHelper(HashSet set, HashSet cur, List<HashSet> list) {
        if (set.size() == 0) {
            list.add(cur);
            return;
        }
        Iterator iterator = set.iterator();
        cur.add(iterator);
        set.remove(iterator);
        powerSetHelper(set, cur, list);
        cur.remove(iterator);
        set.add(iterator);
        powerSetHelper(set, cur, list);
    }

}
