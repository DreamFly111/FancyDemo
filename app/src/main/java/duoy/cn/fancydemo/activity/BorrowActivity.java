package duoy.cn.fancydemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.OnClick;
import duoy.cn.fancydemo.R;
import duoy.cn.fancydemo.utils.IntentUtils;

public class BorrowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.borrow);
    }

    @OnClick(R.id.scan_button)
    public void onClick(View view){
       switch (view.getId()){
           case R.id.scan_button:
               startActivity(IntentUtils.generateIntent(this, ScannerActivity.class));
               finish();
       }
    }
}
