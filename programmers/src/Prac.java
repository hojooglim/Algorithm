public class Prac {
    public static void main(String[] args) {
        String my_string = "aBcDe";
//        char[] answer = my_string.toCharArray();
//        String trans = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            int tmp = (int)answer[i];
//            // 97 = a , 122 = z | 65 = A , 90 = Z
//            if (97 <= tmp && tmp <= 122) {
//                trans += (char)(tmp - 32);
//            } else {
//                trans += (char)(tmp + 32);
//            }
//        }
//        System.out.println(trans);

        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char trans = my_string.charAt(i);
            if('a' <= trans && trans <= 'z') {
                trans -= 32;
            }else{
                trans += 32;
            }
            answer += trans;
        }
        System.out.println(answer);
    }

}
