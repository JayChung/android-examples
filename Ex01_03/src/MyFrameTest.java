import java.awt.event.*;

import javax.swing.*;

public class MyFrameTest extends JFrame implements ActionListener{
	//private static final long serialVersionUID = -6573426247835446924L;
	private JButton button;
	public MyFrameTest(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel = new JPanel();
		button = new JButton("��ư�� ��������");
		button.addActionListener(this);
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
	}
	public static void main(String[] ar){
		MyFrameTest t = new MyFrameTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button){
			button.setText("��ư�� ���Ƚ��ϴ�");
		}
	}
}


