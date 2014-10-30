package ks.appcenter.exadapterview;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ExSpinner extends Activity implements OnItemSelectedListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
        
        
        //1. ������ ����
        //String[] arrayItems = {"item1", "item2", "item3", "item4"}; 
        ArrayList<String> arrayItems = new ArrayList<String>();
        arrayItems.add("item0");
        arrayItems.add("item1");
        arrayItems.add("item2");
        arrayItems.add("item3");
        
        //2. ����� ����
        ArrayAdapter<String> adapter 
        	= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, arrayItems);
        
        //3. ����Ϳ� ����ͺ� ����
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setPrompt("Select item."); //���ǳʿ����� �ۼ�
        spinner1.setAdapter(adapter);
        
        //4. �̺�Ʈ������ ���
        spinner1.setOnItemSelectedListener(this);
                
    }

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		Toast.makeText(this, arg2 + "th item is selected", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}