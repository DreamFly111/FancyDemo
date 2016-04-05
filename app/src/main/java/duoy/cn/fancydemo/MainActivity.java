package duoy.cn.fancydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import duoy.cn.fancydemo.activity.BorrowActivity;
import duoy.cn.fancydemo.activity.LendActivity;
import duoy.cn.fancydemo.activity.QueryActivity;
import duoy.cn.fancydemo.utils.IntentUtils;

public class MainActivity extends AppCompatActivity{

    private static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.borrow)
    TextView borrow;
    @Bind(R.id.lend)
    TextView lend;
    @Bind(R.id.query)
    TextView query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick({R.id.borrow,R.id.lend,R.id.query})
    public void onClicd(View view){
        switch (view.getId()){
            case R.id.borrow:
                startActivity(IntentUtils.generateIntent(this, BorrowActivity.class));
                break;
            case R.id.lend:
                startActivity(IntentUtils.generateIntent(this,LendActivity.class));
                break;
            case R.id.query:
                startActivity(IntentUtils.generateIntent(this,QueryActivity.class));
                break;
            default:
                break;
        }
    }
}
