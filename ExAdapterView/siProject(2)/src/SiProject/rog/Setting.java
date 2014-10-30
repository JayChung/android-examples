package SiProject.rog;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Setting extends Activity {
	//static final String[] body = { "����", "�ð� ����", "��뷮", "�˸���", "�˸�����", "����"
//};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settingn);

		//ArrayAdapter adapter = new ArrayAdapter(this,
		//		android.R.layout.simple_list_item_1, body);
		//final ListView list = (ListView) this.findViewById(R.id.lv1);
		ArrayList<MyItem> arrayItems=new ArrayList<MyItem>();

		arrayItems.add(new MyItem(R.drawable.a1,"  ��뷮","   Smart phone �̿�ð�"));
	
		arrayItems.add(new MyItem(R.drawable.a2,"  �ð� ����","   ���� �ð� ���� �˸�"));
		arrayItems.add(new MyItem(R.drawable.a3,"  �˸���","   ���ϴ� �˸��� ����"));
		arrayItems.add(new MyItem(R.drawable.a4,"  �˸� ����","   ����� �˸��� ��Ÿ���� ����"));

		arrayItems.add(new MyItem(R.drawable.a5,"  ����","   ���α׷��� ���� ����"));
		arrayItems.add(new MyItem(R.drawable.a6,"  ���� ����","   �ý� Ver 1.0.0"));
	
		CustomAdater adapter = new CustomAdater(this,R.layout.itemlayout,arrayItems);
		
		ListView list = (ListView)this.findViewById(R.id.lv1);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			
		
			
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent;
				switch(arg2){
				case 0: //��뷮
					intent = new Intent(Setting.this, Today.class);
					startActivity(intent);
					break;
				case 1: // �ð�����
					intent = new Intent(Setting.this, Times.class);
					startActivity(intent);
					break;
				case 2: // �˸���
					//SubMenu sub=menu.
					intent = new Intent(Setting.this, Alimgle.class);
					startActivity(intent);
				break;
				case 3: // �˸� ����
					intent = new Intent(Setting.this, Alimhung.class);
					startActivity(intent);
					break;
				case 4: // ����
					break;
				case 5: // ���� ����
					break;
				case 6:
					break;
				}
				
				
			}
		});
		
		/*ArrayList<MyItem> arrayItems2=new ArrayList<MyItem>();
	
		
		CustomAdater adapter2 = new CustomAdater(this,R.layout.itemlayout,arrayItems2);
		
		ListView list2 = (ListView)this.findViewById(R.id.lv2);
		list2.setAdapter(adapter2);
		list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			}
		});
		
		ArrayList<MyItem> arrayItems3 = new ArrayList<MyItem>();

	
		
		CustomAdater adapter3 = new CustomAdater(this,R.layout.itemlayout,arrayItems3);
		
		ListView list3 = (ListView)this.findViewById(R.id.lv3);
		list3.setAdapter(adapter3);
		list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			}
		});*/
		
		
	}

}
