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
            }//���� ª�� ������ String ã��
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
�迭���� ���� ª�� ������ String�� ã�Ƴ���.
�� String�� �������� �� String�� str[j].i �� ���Ѵ�. �׸��� output�� ����.
*/
}
