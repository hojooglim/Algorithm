import java.util.ArrayList;

public class A01 {
    public static void main(String[] args) {
        String[] p = {"a","b","c","d"};
        String[] c = {"c","c","d"};



        // 맞는거 같은데 시간초과 뜸.
        ArrayList<String> arrayList= new ArrayList<>();
        for (String pp :p){
            arrayList.add(pp);
        }
        //calling에서 불린 인덱스를 찾고
        //지운다음에 인덱스-1에 다시 넣어준다.
        for (int i = 0 ; i < c.length ; i++){
            int idx = arrayList.indexOf(c[i]);
            arrayList.remove(idx);
            int replaceidx = idx-1;
            arrayList.add(replaceidx,c[i]);
        }

    }
}
