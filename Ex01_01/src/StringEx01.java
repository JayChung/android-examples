// ����ڷκ��͵ΰ��ǽ�Ʈ�����Է¹޾�,���̿ͳ����̰��������ϴ����α׷�
// ������
import java.io.*;
public class StringEx01 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String in1, in2;
		System.out.println("ù��° ���� �Է�");
		in1 = in.readLine();
		System.out.println("�ι�° ���� �Է�");
		in2 = in.readLine();
		
		if(in1.equals(in2) && in1.length() == in2.length()){
			//if(in1==in2){
			System.out.println("���׿�");
			//}
		}
		else{
			System.out.println("�ٸ��׿�");
		}
	}
}
