class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        if(strs.length!=0){
            int min_length=strs[0].length();
            int min_index=0;
            boolean check=true;
            for(int i=0;i<strs.length;i++){
                if(strs[i].length()<min_length){
                    min_length=strs[i].length();
                    min_index=i;
                }
            }//가장 짧은 길이의 String 찾기
            for(int i=0;i<min_length;i++){
                for(int j=0;j<strs.length;j++){
                    if(strs[min_index].charAt(i)!=strs[j].charAt(i)) check=false;
                }
                if(check==true) prefix+=strs[min_index].charAt(i);
                else break;
            }
        }
        return prefix;
}
/*
배열에서 가장 짧은 길이의 String을 찾아낸다.
그 String을 기준으로 각 String의 str[j].i 를 비교한다. 그리고 output에 저장.
*/
}
