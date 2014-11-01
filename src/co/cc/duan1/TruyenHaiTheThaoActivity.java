package co.cc.duan1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class TruyenHaiTheThaoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_truyen_hai_the_thao);
	}
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	    	// TODO Auto-generated method stub
	    	getMenuInflater()
			.inflate(R.menu.mymenu, menu);
			return true;
	    }
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	    	// TODO Auto-generated method stub
	    	switch(item.getItemId())
			{
			case R.id.item_truyenhai:
				//Xử lý xem danh sách sinh viên
				Intent intent = new Intent(TruyenHaiTheThaoActivity.this,TruyenHaiActivity.class);
				startActivity(intent);
				break;
			case R.id.item_truyenkinhdi:
				//xử lý xem thông tin lớp DHTH1A
				Intent a = new Intent(TruyenHaiTheThaoActivity.this,TruyenKinhDiActivity.class);
				startActivity(a);
				break;
			case R.id.item_truyentinhcam:
				Intent b = new Intent(TruyenHaiTheThaoActivity.this,TruyenTinhCamActivity.class);
				startActivity(b);
				break;
			case R.id.item_truyenbua:
				Intent c = new Intent(TruyenHaiTheThaoActivity.this,TruyenBuaActivity.class);
				startActivity(c);
				break;
			case R.id.item_haithethao:
				Intent z = new Intent(TruyenHaiTheThaoActivity.this,TruyenHaiTheThaoActivity.class);
				startActivity(z);
				break;
			}
			return super.onOptionsItemSelected(item);
	    }
}
