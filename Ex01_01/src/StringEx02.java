//����ڷκ��͵ΰ����������Է¹޾�, ��������Ʈ�����κ�ȯ�ϴ����α׷�
// ������
import java.io.*;
public class StringEx02 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int val1, val2;
		int result ; 
		String stresult ;
		System.out.println("���� 2�� �Է��ϼ���");
		val1 = Integer.parseInt(in.readLine());
		val2 = Integer.parseInt(in.readLine());
		
		result = val1+val2;
		
		stresult=Integer.toString(result);
		System.out.println("��Ʈ������ ��ȯ�� = " + stresult);
		
	}

}
