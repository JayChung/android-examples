//�ϳ��ǽ�Ʈ�����Է¹޾�, ó���ι��ڿ͸������ι��ڸ�����ϴ����α׷�
// ������
import java.io.*;
public class StringEx04 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String hangle;
		String jjal1,jjal2;
		
		System.out.println("���� 4���� �Է��ϼ���");
		
		hangle = in.readLine();
		
		//substring ����
		jjal2 = hangle.substring(0,2);
		System.out.println("��2�� = " + jjal2);
		jjal1 = hangle.substring(2);
		System.out.println("��2�� = " + jjal1);
		
		//����Ʈ��¥����
		byte[] t = hangle.getBytes();
		jjal1 = new String(t, 0, 4);
		jjal2 = new String(t, 4, 4);
		
		System.out.println("��2�� = " + jjal1);
		System.out.println("��2�� = " + jjal2);
		
	}
}

