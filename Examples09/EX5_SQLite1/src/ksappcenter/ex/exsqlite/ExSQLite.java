package ksappcenter.ex.exsqlite;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class ExSQLite extends Activity implements OnClickListener {
	WordDBHelper mHelper;
	EditText mText;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exsqlite);
        
        mHelper = new WordDBHelper(this, "EngDic.db", null, 1); //SQLiteOpenHelper Ŭ���� ����
        
        mText = (EditText)findViewById(R.id.text1);
        
        findViewById(R.id.insert).setOnClickListener(this);
        findViewById(R.id.delete).setOnClickListener(this);
        findViewById(R.id.update).setOnClickListener(this);
        findViewById(R.id.select).setOnClickListener(this);
    }
    
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		SQLiteDatabase db;
		ContentValues row; //record
		
		switch(v.getId()){
		case R.id.insert:
			db = mHelper.getWritableDatabase();
			
			//SQL
			db.execSQL("INSERT INTO dic VALUES(null, 'girl', '�ҳ�');");;
			
			//insert method
			row = new ContentValues(); //���ڵ忡 ���Ե� �ʵ��̸��� �� (map)
			row.put("eng", "boy"); // (attribute, Value)
			row.put("han", "�ҳ�");
			db.insert("dic", null, row);
			
			mHelper.close();
			mText.setText("Insert Success");
			break;
			
		case R.id.delete:
			db = mHelper.getWritableDatabase();
			
			db.execSQL("DELETE FROM dic");
			//db.delete("dic", null, null);
			
			mHelper.close();
			mText.setText("Delete Success");
			break;
			
		case R.id.update:
			db = mHelper.getWritableDatabase();
			
			db.execSQL("UPDATE dic SET han='�ҳ�' WHERE eng='boy';");
			//row = new ContentValues();
			//row.put("han", "�ҳ�");
			//db.update("dic", row, "eng='boy'", null);
			
			mHelper.close();
			mText.setText("Upgrade Success");
			break;
			
		case R.id.select:
			db = mHelper.getReadableDatabase();
			Cursor cursor; //����¿����� ���� ���ڵ� ��ġ (�ʱⰪ=ù���ڵ�������)
			
			cursor = db.rawQuery("SELECT eng, han FROM dic", null);
			//cursor = db.query("dic", new String[]{"eng", "han"}, null, null, null, null, null);
			
			String result = "";
			while(cursor.moveToNext()){
				String eng = cursor.getString(0);
				String han = cursor.getString(1);
				result = result + eng + " = " + han + "\n";				
			}
			
			if(result.length() == 0){
				mText.setText("Empty Set");
			} else{
				mText.setText(result);
			}
			
			cursor.close();
			mHelper.close();
			break;
		}
		
	}
}