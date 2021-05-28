package programmers.level2.전화번호목록;

import java.util.Arrays;

public class PhoneBook {

    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        for(int i=1; i<phone_book.length; i++){
            if(phone_book[i].startsWith(phone_book[i-1])){
                return false;
            }
        }

        return true;
    }

    public boolean check(String a, String b){
        if(b.substring(0,a.length()).equals(a)){
            return true;
        }
        return false;
    }

}
