package Ex10_SQLite2.org;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class Ex10_SQLite2Activity extends Activity {
    MyDBHelper mDBHelper;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mDBHelper = new MyDBHelper(this, "Today.db", null, 1);
        SQLiteDatabase db = mDBHelper.getWritableDatabase(); //write ���Ҽ�����
        db.execSQL("INSERT INTO today VALUES(null, '���ɽð�', '2011/07/15', '12:00', '��ģ�� �Ļ�', '1')");
        db.execSQL("INSERT INTO today VALUES(null, '����ð�', '2011/07/16', '18:00', '��ģ�� �Ļ�', '2')");
        db.execSQL("INSERT INTO today VALUES(null, '��ħ�ð�', '2011/07/17', '08:00', '��ģ�� �Ļ�', '3')");
        
        Cursor cursor = db.rawQuery("SELECT _id,title, time, memo FROM today WHERE date = '2011/07/15'", null); 
        // SELECT �� �´°Ǹ� ����Ʈ�� ���
        
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, 
        		R.layout.itemlayout, 
        		cursor, 
        		new String[] {"title","time","memo"}, 
        		new int[] {R.id.text1,R.id.text2,R.id.text3});
        
        ListView list = (ListView)this.findViewById(R.id.listview);
        list.setAdapter(adapter);
        mDBHelper.close();
    }
}