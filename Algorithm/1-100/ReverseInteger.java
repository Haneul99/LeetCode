class ReverseInteger {
    public int reverse(int x) {
        String str;
        char c;
        if(x>=0){
            str=Integer.toString(x);
            StringBuilder builder = new StringBuilder(str);
            for(int i=0;i<=str.length()/2-1;i++){
                c=str.charAt(i);
                builder.setCharAt(i,str.charAt(str.length()-1-i));
                builder.setCharAt(str.length()-1-i, c);
                str=builder.toString();
            }
        }//����ΰ��
        else{
            str=Integer.toString(x);
            StringBuilder builder = new StringBuilder(str);
            for(int i=1;i<=str.length()/2;i++){
                c=str.charAt(i);
                builder.setCharAt(i,str.charAt(str.length()-i));
                builder.setCharAt(str.length()-i, c);
                str=builder.toString();
            }
        }//�����ΰ��
    
        try {
        	x=Integer.parseInt(str);
        	return x;
		}
		catch(Exception e) {
			System.out.println("Overflow");
            return 0;
		}
}
/*
String ��ȯ�ϸ� �ȵǴ� ��������... ��ȯ���� ����
�⺻���� ����
�ϴ� ������� �������� �ľ��ϱ�.
�׸��� String���� ��ȯ.
-�� ���) 1��° index����(i�� .length, i+1�� .length-1 ...)
+�� ���) 0��° index����
�ϰ� �ٽ� INTEGER�� ��ȯ.
*/
}
