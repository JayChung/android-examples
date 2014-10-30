package Ex15_BR.org;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class BR extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.d("MY_TAG", "BroadcastReceiver onReceive()");

		if (intent.getAction()
				.equals("android.provider.Telephony.SMS_RECEIVED")) {
			String sb = "";
			Bundle bundle = intent.getExtras();

			if (bundle != null) {
				Object[] pdusObj = (Object[]) bundle.get("pdus");

				SmsMessage[] messages = new SmsMessage[pdusObj.length];
				for (int i = 0; i < pdusObj.length; i++) {
					messages[i] = SmsMessage.createFromPdu((byte[]) pdusObj[i]);
				}

				for (SmsMessage currentMessage : messages) {
					sb = sb + "���ڿ� ���ŵǾ����ϴ�.\n";
					sb = sb + "[�߽�����ȭ��ȣ].\n";
					sb = sb + currentMessage.getOriginatingAddress();
					sb = sb + "\n[���Ÿ޼���]\n";
					sb = sb + currentMessage.getMessageBody();

				}
			}
			Toast.makeText(context, sb, Toast.LENGTH_LONG).show();
		}

	}

}
