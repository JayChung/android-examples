package SiProject.rog;

import java.util.ArrayList;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Alim2 extends Activity {
	//static final String[] body = { "����Ʈ�� �̿�� �� �ǰ���", "�źϸ����ı�", "�հ��� �ո� ����",
	//		"�� ������ ����", "�׹� ��ȯ"};
	int mLastAction;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alim);

		ArrayList<MyItem> arrayItems=new ArrayList<MyItem>();
		
        arrayItems.add(new MyItem(R.drawable.a1,"  �źϸ� ���ı�","   �ڵ��� ������ �츮 �����̺���..."));
        arrayItems.add(new MyItem(R.drawable.a2,"  �հ��� �ո� ����","   ���� �ڵ����� ��ġ�ϴٺ���..."));
        arrayItems.add(new MyItem(R.drawable.a3,"  �� ������ ����","   ���� ������ ���� ���� ���� ����..."));
        arrayItems.add(new MyItem(R.drawable.a4,"  �׹� ��ȯ","   ���� ȭ��ǿ� �� �� �Ź� ���..."));
        arrayItems.add(new MyItem(R.drawable.a5,"  ��� ����","   ����Ʈ���� ����ȭ�Ǹ鼭 �̿�..."));
        
        CustomAdater adapter = new CustomAdater(this,R.layout.itemlayout,arrayItems);     
        ListView list = (ListView)this.findViewById(R.id.listview1);
        list.setAdapter(adapter);  
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				AlertDialog.Builder d = new AlertDialog.Builder(Alim2.this);
				// TODO Auto-generated method stub
				switch (arg2) {
				case 0:
					d.setTitle("�źϸ� ���ı�");
					d.setMessage("�ڵ��� ������ �츮 �����̺��� ���� ������ ������ ������ �ڿ������� ���� ������������.\n\n" +
							" ���� �������ϰ� �Ǹ鼭 �������� ����� C�ڰ� �ƴ� ���� ���·� ������ �Ǹ鼭 �źϸ� ���ı� ������ ��Ÿ���⵵ �ϴµ���.\n\n" +
							" �̷��� �ڼ��� ���� �����ϴٺ��� ���ϰԴ� ���ũ�� �ɸ� ���� ������ �����ؾ� �մϴ�.\n\n" +
							" ���� ��Ʈ������ ���̷��� ����Ʈ���� ���� ���� �̻�����,\n\n" +
							" ������ �Ÿ��� 30cm�� �����Ͻð� �Ȱ��� �ڼ��� 10�� �̻� �������� �ʵ��� ���÷� �ڼ��� �ٲ��ֽô°� ���ƿ�.");
					d.setNegativeButton("�ݱ�",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									// finish();
								}
							});
					d.show();
					break;
				case 1:
					d.setTitle("�հ��� �ո� ����");
					d.setMessage("���� �ڵ����� ��ġ�ϴٺ��� �հ����� ������ ������ ���⵵ ���� �ʳ���? \n\n" +
							"Ư�� ����Ʈ���� ���� Ű������ �������� �Ǿ� �ֱ� ������ �����ϰ� Ÿ�ڸ� ġ�� ���� �ݹ� �ո�� �հ����� ������. \n\n" +
							"�� ��쿡�� �ո��ͳ� ���ı��� ��Ÿ�� �� ������ �����ؾ� �ؿ�.\n\n " +
							"�ո��̳� �հ����� �����ϰ� ����� �ȿ��� ������ ���� �Ű��� ���� ���� �����ų� ������ �������� �Ǿ� ������ ������ �� �ִ�ϴ�.\n\n" +
							" ������ �ֺο��� ���� ��Ÿ���� �����̿��ٰ� �ϴµ�, ���� ��ǻ�� ����� ���� �����ε�, û�ҳ⿡�Ե� ���� ��Ÿ���ٰ� �ؿ�.\n\n" +
							" �ո��̳� �հ����� ������ �������� ����� �ߴ��ϰ�, ������ ��Ʈ��Ī�� ���ּ���. \n\n" +
							"������ ���� ���� ��� �ָ��� ����� �Ǳ⸦ 5~10�� ���� ���ֽô°͵� ���ƿ�.");
					d.setNegativeButton("�ݱ�",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									// finish();
								}
							});
					d.show();
					break;
				case 2:
					d.setTitle("�� ������ ����");
					d.setMessage("���� ������ ���� ���� ���� ���� �������ֱ� ������ ���� �����̴� Ƚ���� �پ��� �ǰ� �׷��� �Ǹ� ���� ���� ���������ϴ�.\n\n " +
							"���� �����ϸ� �Ƿΰ��� �������ų� �̹��� ������ �����⵵ ����.\n\n " +
							"�̷� ���� �ȱ� �������� ���� �ȱ� ��ȯ�� �ɸ� Ȯ���� ���� ���ƿ�.\n\n " +
							"�׷��� �ǵ����̸� ȭ���� ���� �ð����� ���� ���ð�, ���� �� ���� �ٶ󺸰ų� ���� ������ ���� ���������� ���� �����ּ���.\n\n " +
							"���� ���� ���ðų� ȭ���� ���ڸ� Ű�� ����. ȭ�� ��� ���������� ���� ��ȣ���ּ���.");
					d.setNegativeButton("�ݱ�",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									// finish();
								}
							});
					d.show();
					break;
				case 3:
					d.setTitle("�׹� ��ȯ");
					d.setMessage("���� ȭ��ǿ� �� �� �Ź� ��� ����Ʈ���� ��� ���� Ȱ���ϴ� ��찡 �����ϴ�. \n\n" +
							"������ ���⿡ �ɾ� �̰����� ���α׷��� �����鼭 �ڽŵ� �𸣰� �躯 �ð��� �þ�ϴ�. \n\n" +
							"���⿡ ���� �ɾ� ������ �ǰ� �׹����� ������ ������ �þ�ϴ�. \n\n" +
							"�̰��� ���� �ݺ��Ǹ� �þ ������ �����ų� �����·� ȸ������ �ʾ� �˹� ������ ���ɴϴ�.\n\n" +
							" �̸� ���� ���ؼ��� �켱 ȭ��ǿ� �� �� ������ ����Ʈ���� ��� ���� �ʴ� ���� ���ƿ�. \n\n" +
							"�Ұ����ϴٸ� �ǽ������� 10�оȿ� �躯�� ������ ���;� �ؿ�.");
					d.setNegativeButton("�ݱ�",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									// finish();
								}
							});
					d.show();
					break;
				case 4:
					d.setTitle("��� ����");
					d.setMessage("���� ����Ʈ�� �����ڰ� 1000���� �̻� �� 20~30�� ������ 60%�� ���� �߾�� \n\n" +
							"����Ʈ���� ����ȭ�Ǹ鼭 �̿� ���� ���ۿ뵵 ���� ����. Ư�� �ֱٿ��� ����Ʈ���� �º� PC ���� �޴�� �����б���� ������ ������� 30�� ������ ��� ȯ�ڰ� �����Ѵٳ׿�. \n\n" +
							"�̿� ������ ��鸮�� ������ ����ö���� ����Ʈ������ �Ź��� ���ų� e���� ���� üũ�ϴ� ������ �����̶�� �ϳ׿�\n\n" +
							"�Ϲ������� ����Ʈ�� ȭ�鿡 �� �ִ� �۾� ���� �鿩�ٺ� �� 1�д� ���� �����̴� Ƚ���� �� 5ȸ ���� �ȵ��� ������ ������� �ϻ��Ȱ�� �Ҷ� 15~20ȸ ���� ���� �����ε��� �̴� ���� ���ڰ� ������\n\n" +
							"����� �����ϱ� ���ؼ��� �������� ���� �۾��� ���� �� �����ؾ� �ؿ�. ������ �� 400��700�轺(�鿭�� �� ���� ���ĵ��������� �Բ� ����ϴ� ����)�� �����ϸ�, " +
							"������ ����ö���� ��鸮�� �������� å�� ���� ���� TV�� �� ���� ���� �Ѱ� ���� ���� ���ƿ�.\n\n4" +
							"��� ���� ���� �ϴ� �͵� �߿��ؿ�. ��ð� ��ǻ�� �۾��� �ϰų� �ٰŸ� �۾��� �� ���� 1�ð����� 5�� ���� ���� ���� �޽��� ���ϰ�, \n\n" +
							"���� �ǰ����� �������ٸ� ���� ���� �ȱ��� õõ�� �ȱ��� ������ ������ �ȵ���. �ָ� ������ ���� �ٶ󺸴� �͵� ���� �Ƿθ� Ǯ �� �ִ� ��������̰��.");
							
					d.setNegativeButton("�ݱ�",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									// finish();
								}
							});
					d.show();
					break;
				}
			}
		
        
        });
	}

		//ArrayAdapter adapter = new ArrayAdapter(this,
		//		android.R.layout.simple_list_item_1, body);
		//final ListView list = (ListView) this.findViewById(R.id.listview1);
		//list.setAdapter(adapter);   
        //setContentView(R.layout.alim);
     /*   ArrayList<MyItem> arrayItems2=new ArrayList<MyItem>();

        CustomAdater adapter2 = new CustomAdater(this,R.layout.itemlayout,arrayItems2);
       
        list = (ListView)this.findViewById(R.id.listview2);
        list.setAdapter(adapter2);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				// TextView text = (TextView)findViewById(R.id.li)
				AlertDialog.Builder d = new AlertDialog.Builder(Alim.this);
				switch (arg2) {
			
				}

			}

		});
		
	}
	*/
	/*@Override
	   public boolean dispatchTouchEvent(MotionEvent ev)
       {
               int action = ev.getAction();

              // boolean mbIsScrollEnabled = false;

                       //int mLastAction = 0;
					if (action == mLastAction) {
                               ev.setAction(MotionEvent.ACTION_CANCEL);
                               super.dispatchTouchEvent(ev);
                               return true;
                       }
                       mLastAction = action;


               return super.dispatchTouchEvent(ev);
       }*/
}



