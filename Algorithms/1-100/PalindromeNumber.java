class PalindromeNumber {
	public boolean isPalindrome(int x) {
        boolean check=true;
        if(x<0) check=false;
        else if(x==0);
        else{
            int j=1;
            int count=1;
            while(x/j>0 && x/j>9){
                j*=10;
                count++;
            }
            int div=10;
            for(int i=0;i<=count/2-1;i++){
                if(x/j%10!=x%div/(div/10)){
                    check=false;
                    break;
                }
                else if(x/j%10==x%div/(div/10)) {
                    j/=10;
                    div*=10;
                }
            }
        }
        return check;
}
/*
�켱, integer�� ���ڸ��ΰ�?
1 - ù°�ڸ�%�ڸ���
2 - ��°�ڸ�%�ڸ���-1
.
.
.
�߰�
*/
//�ٸ� ���̵��. �迭�� ����Ѵٸ� �����? �� ������ �� ����.
}
