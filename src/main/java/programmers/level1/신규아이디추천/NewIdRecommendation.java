package programmers.level1.신규아이디추천;

public class NewIdRecommendation {
    public String solution(String new_id) {
        StringBuffer sb = new StringBuffer();
        new_id = new_id.toLowerCase();

        for(int i=0; i<new_id.length(); i++){
            char x = new_id.charAt(i);
            if('a'<=x&&x<='z'){
                sb.append(x);
            }
            else if('0'<=x&&x<='9'){
                sb.append(x);
            }
            else if(x=='-'||x=='_'){
                sb.append(x);
            }
            else if(x=='.'){
                if(sb.length()!=0 &&sb.charAt(sb.length()-1)!=x){
                    sb.append(x);
                }
            }
        }

        if(sb.length()!=0){
            while(sb.charAt(sb.length()-1)=='.'){
                sb.deleteCharAt(sb.length()-1);
            }
        }

        if(sb.length()==0){
            return "aaa";
        }
        else if(sb.length()>=16){
            sb.delete(15,sb.length());
            while(sb.charAt(sb.length()-1)=='.'){
                sb.deleteCharAt(sb.length()-1);
            }
            return sb.toString();
        }
        else if(sb.length()<=2){
            while(sb.length()<3){
                sb.append(sb.charAt(sb.length()-1));
            }
            return sb.toString();
        }

        return sb.toString();
    }

}
