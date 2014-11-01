package co.cc.duan1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
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
				Intent intent = new Intent(MenuActivity.this,TruyenHaiActivity.class);
				startActivity(intent);
				break;
			case R.id.item_truyenkinhdi:
				//xử lý xem thông tin lớp DHTH1A
				Intent a = new Intent(MenuActivity.this,TruyenKinhDiActivity.class);
				startActivity(a);
				break;
			case R.id.item_truyentinhcam:
				Intent b = new Intent(MenuActivity.this,TruyenTinhCamActivity.class);
				startActivity(b);
				break;
			case R.id.item_truyenbua:
				Intent c = new Intent(MenuActivity.this,TruyenBuaActivity.class);
				startActivity(c);
				break;
			case R.id.item_haithethao:
				Intent z = new Intent(MenuActivity.this,TruyenHaiTheThaoActivity.class);
				startActivity(z);
				break;
			}
			return super.onOptionsItemSelected(item);
	    }
}
