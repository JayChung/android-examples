package ks.appcenter.exadapterview;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ExListView extends Activity implements OnItemClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        
        
        //1. ������ ����
        //String[] arrayItems = {"item1", "item2", "item3", "item4"}; 
        ArrayList<String> arrayItems = new ArrayList<String>();
        arrayItems.add("item0");
        arrayItems.add("item1");
        arrayItems.add("item2");
        arrayItems.add("item3");
        
        //2. ����� ����
        ArrayAdapter<String> adapter 
        	= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayItems);
        
        //3. ����Ϳ� ����ͺ� ����
        ListView list1 = (ListView) findViewById(R.id.list1);
        list1.setAdapter(adapter);
        
        //4. �̺�Ʈ������ ���
        list1.setOnItemClickListener(this);
                
    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(ExListView.this, ConnectedActivity.class);
		intent.putExtra("Param1", arg2);
		startActivity(intent);	
	}
}