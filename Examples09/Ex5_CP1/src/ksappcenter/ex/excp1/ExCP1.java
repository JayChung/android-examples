package ksappcenter.ex.excp1;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ExCP1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sqlite2);
        
        // ����ó ������ ȹ��
        Cursor cursor = getContentResolver()
        				.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        
        //Ŀ���� �����ֱ⸦ ��Ƽ��Ƽ�� ����
        startManagingCursor(cursor);
        
        Log.d("cp", "aaa1");
        
        //���ϴ� ���� �Ӽ��̸� ȹ��
        int nameIdx = cursor.getColumnIndexOrThrow(ContactsContract.Contacts.DISPLAY_NAME);
        Log.d("cp", "nameIdx="+nameIdx);
        int idIdx = cursor.getColumnIndexOrThrow(ContactsContract.Contacts._ID);
        Log.d("cp", "idIdx="+idIdx);
             
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, 
        		android.R.layout.simple_list_item_2, 
        		cursor, 
        		new String[] {"DISPLAY_NAME", "_ID"}, 
        		new int[] {android.R.id.text1, android.R.id.text2});

        ListView list = (ListView)findViewById(R.id.list1);
        list.setAdapter(adapter);
    }
}