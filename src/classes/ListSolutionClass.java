package classes;

import java.util.Collections;
import java.util.List;

public class ListSolutionClass {

    static public int solution(List<Integer> list) throws Exception {

        if (list == null) {
            throw new Exception("List is not initialized.");
        } else if (list.size() > 1e5) {
            throw new Exception("List size exceed allowed range.");
        } else if (list.size() == 0) {
            throw new Exception("List is empty.");
        }

        Collections.sort(list);
        if (list.get(0) < -1000000 || list.get(list.size() - 1) > 1000000) {
            throw new Exception("List contains non allowed value.");
        }

        int indexOfOne = list.indexOf(1);
//        int indexOfOne = -1;
//        for(int i=0; i<list.size(); i++) {
//            if(list.get(i) == 1) {
//                indexOfOne = i;
//                break;
//            }
//        }

        if (indexOfOne == -1) {
            return 1;
        }
        else {
            int last = 1;
            for (int i = indexOfOne + 1; i < list.size(); i++) {
                if (list.get(i) - last > 1) {
                    return (last + 1);
                }
                else {
                    last = list.get(i);
                }
            }
            return (list.size()+1);
        }

    }
}
