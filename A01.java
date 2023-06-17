import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.swap;

public class A01 {
    public static void main(String[] args) {
        String[] players = {"a","b","c","d"};
        String[] callings = {"c","c","d"};
        ArrayList<String> arrayList= new ArrayList<>(Arrays.asList(players));

        for (String calling : callings) {
            int idx = arrayList.indexOf(calling);
            swap(arrayList, idx - 1, idx);
        }
        System.out.println(arrayList);


//        // 맞는거 같은데 시간초과 뜸.
//        ArrayList<String> arrayList= new ArrayList<>(Arrays.asList(players));
//        System.out.println(arrayList);
//        //calling에서 불린 인덱스를 찾고
//        //지운다음에 인덱스-1에 다시 넣어준다.
//        for (int i = 0 ; i < callings.length ; i++){
//            int idx = arrayList.indexOf(callings[i]);
//            arrayList.remove(idx);
//            int replaceidx = idx-1;
//            arrayList.add(replaceidx,callings[i]);
//            System.out.println(arrayList);
//        }

    }
}
