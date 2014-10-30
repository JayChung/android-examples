package SiProject.rog;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Jagates extends Activity implements OnClickListener  {
	Button bt1,bt2,bt3;
	TextView tv;
	@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
    requestWindowFeature(Window.FEATURE_NO_TITLE); 
	super.onCreate(savedInstanceState);
	setContentView(R.layout.jaga);
	tv = (TextView)this.findViewById(R.id.tv);
	tv.setText("\n  1. ȭ��ǿ� �� �� ����Ʈ���� ����Ѵ�\n\n"+
			"  2. �ָӴϿ� ����Ʈ���� ������ �дл��¿� ������\n\n"+
"  3. ����Ʈ�� ����ڳ��� ������ �� ����Ʈ�� �̾߱⸸ �Ѵ�\n\n"+
"  4. ����Ʈ���� ���峪�� ģ���� ���� �� ���� ������ ���\n\n"+
"  5. ������ ���͸��� �Ϸ� ���� ���ӵǱ� �����\n\n"+
"  6. ����Ʈ�� ����� �����ϱ� ���� ��Ȱ�� ���δ�\n\n"+
"  7. �� ����Ʈ���� ���� ���� ����Ʈ���� ���� �˾ƺ���\n\n"+
"  8. �Ϸ��� ��� ������ ��� ����Ʈ�� �ȿ� ����� �ִ�\n\n"+
"  9. ����Ʈ���� ���� 30�� ���� ��ġ �� �ְ�, �װ��� ��� ����Ѵ�\n\n"+
"  10. ����Ʈ�� �Ǽ����� ���Կ� ����Ʈ�� ���ݺ��� �� ���� ���� ����\n\n");
	bt1 = (Button)this.findViewById(R.id.but1);
	bt1.setOnClickListener(this);
	bt2 = (Button)this.findViewById(R.id.but2);
	bt2.setOnClickListener(this);
	bt3 = (Button)this.findViewById(R.id.but3);
	bt3.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.but1:
			tv.setText("0�� ~ 3�� \n�����Դϴ�.");
			tv.setTextSize(40.0f);
			tv.setGravity(Gravity.CENTER_VERTICAL);
			
			bt1.setVisibility(View.INVISIBLE);
        	bt2.setVisibility(View.INVISIBLE);
        	bt3.setVisibility(View.INVISIBLE);
		break;
		case R.id.but2:
			tv.setText("0�� ~ 3�� \n�ߵ� �ʱ� �����Դϴ�.");
			tv.setTextSize(40);
		
			tv.setTextColor(0xFF0000ff);
			bt1.setVisibility(View.INVISIBLE);
        	bt2.setVisibility(View.INVISIBLE);
        	bt3.setVisibility(View.INVISIBLE);
			break;
		case R.id.but3:
			tv.setText("8�� ~ 10�� \n���� �ߵ� �����Դϴ�.");
			tv.setTextSize(40);
		
			tv.setTextColor(0xFFff0000);
			bt1.setVisibility(View.INVISIBLE);
        	bt2.setVisibility(View.INVISIBLE);
        	bt3.setVisibility(View.INVISIBLE);
			break;
		}
		
	}

	
}

