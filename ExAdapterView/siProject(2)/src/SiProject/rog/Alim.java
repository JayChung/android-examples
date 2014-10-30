package SiProject.rog;

import java.util.ArrayList;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Alim extends Activity {
	//static final String[] body = { "����Ʈ�� �̿�� �� �ǰ���", "�źϸ����ı�", "�հ��� �ո� ����",
	//		"�� ������ ����", "�׹� ��ȯ"};
	int mLastAction;
	ProgressDialog dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alim);

		ArrayList<MyItem> arrayItems=new ArrayList<MyItem>();
		
		arrayItems.add(new MyItem(R.drawable.a1,"  ����Ʈ�� �ߵ� �ڰ�����","   �ɰ��� ����Ʈ�� �ߵ��� �����սô�..."));
		arrayItems.add(new MyItem(R.drawable.a2,"  �ùٸ� ����Ʈ�� ����","   ����Ʈ���� �ٸ��� ����սô�..."));
        arrayItems.add(new MyItem(R.drawable.a3,"  �� �ǰ���","   7���� �ǰ���..."));
        arrayItems.add(new MyItem(R.drawable.a4,"  ���� ���� ����","   ���� �����Դϴ�..."));
        arrayItems.add(new MyItem(R.drawable.a5,"  ��Ʈ��Ī ���","   �Բ��ϴ� ��Ʈ��Ī..."));
        arrayItems.add(new MyItem(R.drawable.a6,"  ��Ʈ��Ī ������(daum)","   �Բ��ϴ� ��Ʈ��Ī..."));
        
        CustomAdater adapter = new CustomAdater(this,R.layout.itemlayout,arrayItems); 
        ListView list = (ListView)this.findViewById(R.id.listview1);
        list.setAdapter(adapter);  
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent;
				AlertDialog.Builder d = new AlertDialog.Builder(Alim.this);
				// TODO Auto-generated method stub
				switch (arg2) {
				case 0:
					intent = new Intent(Alim.this, Jagates.class);
					startActivity(intent);
					break;
				case 1:
					d.setTitle("����Ʈ�� �ùٸ� ����");
					d.setMessage("1.����ϰ� ������� ����Ʈ���� �ü��� ���� ���̷� �ø���.\n\n"
							+ "2.������ ���� �Ÿ��� 30cm �̻� �����Ѵ�.\n\n" + "3.�� �հ����� ����ϴ� ���� �����Ѵ�.\n\n"
							+ "4.��� �� ���� ������ ������ �ϴ� �ߴ��ϰ� ������ ���� ���� �㰡 5~10�� ���� ����� ���ֱ⸦ �ݺ��Ѵ�.\n\n"
							+ "5.��ð� ����� ��� ���� ������ �����ų� �ո� ������,�б�,���� ���� ������ ���� �� ��Ʈ��Ī���� ƴƴ�� ������ Ǯ���ش�.\n\n");

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
					d.setTitle("����Ʈ�� �̿�� �� �ǰ���");
					d.setMessage("1.30cm �̻� �������� ����.\n\n"
							+ "2.1�ð� �̻� ���� ����� ���Ѵ�.\n\n" + "3.�ֱ������� �� ���� �����Ѵ�\n\n"
							+ "4.��ð� ����� ��� �� �������� �ǽ������� �Ѵ�.\n\n"
							+ "5.���ų� ���帮�� �ڼ��� ���Ѵ�.\n\n"
							+ "6.���� �Ƿ��ϴٰ� �Ŀ��� ���� �Ժη� ���� �ʴ´�.\n\n"
							+ "7.��ο� ���� ���ϰ� �ǵ��� ���� ������ ����Ѵ�.");
					
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
					Toast.makeText(Alim.this, "Wi-Fi�� ��õ�帳�ϴ�.!! Wi-Fi�� �ƹ����� ��������??", Toast.LENGTH_SHORT).show();
					timeThread();
					intent = new Intent(Alim.this, Str11.class);
					startActivity(intent);
					break;
				case 4:
					Toast.makeText(Alim.this, "Wi-Fi�� ��õ�帳�ϴ�.!! Wi-Fi�� �ƹ����� ��������??", Toast.LENGTH_SHORT).show();
					intent = new Intent(Alim.this, Stretching.class);
					startActivity(intent);
					break;
				case 5:			
					Toast.makeText(Alim.this, "Wi-Fi�� ��õ�帳�ϴ�.!! Wi-Fi�� �ƹ����� ��������??", Toast.LENGTH_SHORT).show();
					Intent intent2 = new Intent(Alim.this, DaumapiActivity.class);
					startActivity(intent2);
					
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
public void timeThread(){
		
		
		dialog = new ProgressDialog(this);
		dialog = new ProgressDialog(this);
		dialog.setTitle("Wait...");
		dialog.setMessage("Please wait while loading...");
		dialog.setIndeterminate(true);
		dialog.setCancelable(true);
		dialog.show();
		new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);
				} catch (Throwable ex) {
					ex.printStackTrace();
				}
				dialog.dismiss();
			}
		}).start();	
	}
}



