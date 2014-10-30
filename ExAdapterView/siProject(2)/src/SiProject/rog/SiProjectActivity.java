package SiProject.rog;

//import android.app.Activity;



import java.text.DecimalFormat;
import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TabActivity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class SiProjectActivity extends Activity implements OnClickListener {
    public static final int NOTIFY_1 = 0x1001; // �˸� �ĺ���
    Notification notify;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    
	    AlarmManager alarm = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
	    Intent intent = new Intent("android.intent.action.TIME_SET");
		PendingIntent pender = PendingIntent.getBroadcast(
				this, 0, intent, 0);
		
		//���� ��¥ �������� �ð� �� ���� ���� 
		  Calendar rightNow = Calendar.getInstance();// ��¥ �ҷ����� �Լ�
		  int year = rightNow.get(Calendar.YEAR);// 100�� ������ �⵵ǥ�ø� 2009->9����
		  // decimal�������� 09�� ǥ��
		  int month = rightNow.get(Calendar.MONTH);// ��
		  int date = rightNow.get(Calendar.DATE);// ��
          
		  //String result = decimalFormat.format(year)
		  // + decimalFormat.format(month) + decimalFormat.format(date);
		  //Toast.makeText(this, Integer.toString(year)+Integer.toString(month)+Integer.toString(date), Toast.LENGTH_SHORT).show();
		
		 Calendar calendar = Calendar.getInstance();
	     calendar.set(year, month, date, 16, 30, 1);
	    
	     alarm.cancel(pender); 
	     alarm.set(AlarmManager.RTC, calendar.getTimeInMillis(), pender);
	    
    
        //Intent intentt = new Intent(this, Myservice.class);
        //ComponentName cpn = this.startService(intentt);
	    
	    Intent intent3 = new Intent("com.hardrock.service.test");
	    startService(intent3);

		
	    //Intent intent2 = new Intent(this,
		//		ScreenReceiver.class);
		//PendingIntent pender = PendingIntent.getBroadcast(
		//		this, 0, intent2, 0);

		Button btn1 = (Button)this.findViewById(R.id.but1);
		btn1.setOnClickListener(this);
		Button btn2 = (Button)this.findViewById(R.id.but2);
		btn2.setOnClickListener(this);
		Button btn3 = (Button)this.findViewById(R.id.but3);
		btn3.setOnClickListener(this);
		Button btn4 = (Button)this.findViewById(R.id.but4);
		btn4.setOnClickListener(this);
		
//		TabHost tabhost = getTabHost();
//		tabhost.addTab(tabhost.newTabSpec("tag").setIndicator("�˸�")
//				.setContent(new Intent(this, Alim.class)));
//		//tabhost.addTab(tabhost.newTabSpec("tag1").setIndicator("����")
//		//		.setContent(new Intent(this, exit.class)));
//		tabhost.addTab(tabhost.newTabSpec("tag1").setIndicator("����")
//				.setContent(new Intent(this, Setting.class)));

		
        // NotificationManager ��ü�� �����Ѵ�. NotificationManager�� �ý��� �����̹Ƿ�,
        // getSystemService() �޼��带 �̿���  ��ü�� ��´�.
        NotificationManager notifier =
            (NotificationManager) getSystemService(
            		Context.NOTIFICATION_SERVICE);

        // Notification ��ü�� �����ϰ�,
        // �˸� �߻��� ���� �ٿ� ǥ���� ������, ticker-text, �˸� �߻� �ð��� �����Ѵ�.
        notify =
            new Notification(R.drawable.allsbu, "�ý�", System.currentTimeMillis());
        
        notify.flags = Notification.FLAG_ONGOING_EVENT; // flag���� �Ӽ� �ٲ� .

        // �˸� �޼����� Ȯ�� �ؽ�Ʈ�� Ŭ���� ���, ������ ��Ƽ��Ƽ�� ����Ʈ�� �����Ѵ�.
        Intent intent2 = new Intent(this, SiProjectActivity.class);
        PendingIntent launchIntent =
            PendingIntent.getActivity(this, 0, intent2, 0);

        // setLatestEventInfo() �޼��带 ����� �˸� �޼����� ���� ����� ������ ǥ���ϰ�,
        // �˸� �޼����� Ȯ�� �ؽ�Ʈ�� Ŭ���� ��� ����Ʈ�� �Ѱ� ������ ��Ƽ��Ƽ�� �����Ѵ�.
        notify.setLatestEventInfo(this,
            "�ý�", "�ùٸ� ����Ʈ��Ȱ", launchIntent);

        // �˸� Ƚ���� �����Ѵ�.
       // notify.number = 4;

        // notify() �޼����, NotificationManager�� Notification ��ü�� �Ѱ�
        // �˸� �޼����� ǥ���Ѵ�.
        notifier.notify(NOTIFY_1, notify);
        //Intent intent2=new Intent(this,exit.class);
	}
//	@Override
//	protected void onPause() {
//		// TODO Auto-generated method stub
//		IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
//		filter.addAction(Intent.ACTION_SCREEN_OFF);
//		BroadcastReceiver mReceiver = new ScreenReceiver();
//		registerReceiver(mReceiver, filter);
//		if (ScreenReceiver.wasScreenOn) { 
//			Toast.makeText(this, "SCREEN TURNED OFF", Toast.LENGTH_LONG).show();
//		}else{
//			
//		}
//		super.onPause();
//	}
//	@Override
//	protected void onResume() {
//		// TODO Auto-generated method stub
////		IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
////		filter.addAction(Intent.ACTION_SCREEN_OFF);
////		BroadcastReceiver mReceiver = new ScreenReceiver();
////		registerReceiver(mReceiver, filter);
//		if (!ScreenReceiver.wasScreenOn) {
//			Toast.makeText(this, "SCREEN TURNED ON", Toast.LENGTH_LONG).show();
//		}else{
//			
//		}
//		super.onResume();
//	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent3;
		switch(arg0.getId()){
		case R.id.but1://�ǰ�
			intent3 = new Intent(this, Alim.class);
			startActivity(intent3);
			break;
		case R.id.but2://����
			intent3 = new Intent(this, Alim2.class);
			startActivity(intent3);
			break;
		case R.id.but3://����
			intent3 = new Intent(this, Setting.class);
			startActivity(intent3);
			break;
		case R.id.but4://����
			//intent = new Intent(this, Alim.class);
			//startActivity(intent);
			break;
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuItem item = menu.add(0,1,0, "exit");
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onOptionsItemSelected(item);
		
		switch(item.getItemId()){
		case 1:
			NotificationManager nm = 
		      (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
		     
		     // Cancel Notification
		SiProjectActivity a11 = new SiProjectActivity();
		
		nm.cancel(0x1001);
		finish();
		}
		
		return true;
	}

}