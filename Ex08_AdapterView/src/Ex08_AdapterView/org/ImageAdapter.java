package Ex08_AdapterView.org;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	private ArrayList<Integer> mArrayItem;

	public ImageAdapter(Context c, ArrayList<Integer> arrayItem) {
		mContext = c;
		mArrayItem = arrayItem;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mArrayItem.size(); // ���� return
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mArrayItem.get(arg0); // �ش�Ǵ� position�� ����
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0; // �ش�Ǵ� position�� id
	}

	@Override
	public View getView(int arg0, View arg1/* item�� ���Ѻ� �ϳ��ϳ� */, ViewGroup arg2/*
																				 * ��
																				 * ��ü
																				 */) {
		// TODO Auto-generated method stub
		ImageView imageview;

		if (arg1 == null) {

			imageview = new ImageView(mContext);
			imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageview.setPadding(8, 8, 8, 8);
		} else {
			imageview = (ImageView) arg1;
		}
		imageview.setImageResource(mArrayItem.get(arg0));
		return imageview;

	}

}
