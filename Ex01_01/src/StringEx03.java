//����ڷκ��͵ΰ�����������Ʈ�������Է¹޾�, �μ���������Ʈ�����κ�ȯ�Ͽ�����ϴ����α׷�
// ������
import java.io.*;
public class StringEx03 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String val1, val2;
		int result;
		String result1;
		
		System.out.println("���� 2���� �Է��ϼ��� String ���Դϴ�.");
		val1=in.readLine();
		val2=in.readLine();
		
		int val11=Integer.parseInt(val1);
		int val12=Integer.parseInt(val2);
		result = val11+val12;
		
		result1= Integer.toString(result);
		
		System.out.println("�μ������� String���� ��ȯ�Ͽ� ��� = " + result1);
		}
}
