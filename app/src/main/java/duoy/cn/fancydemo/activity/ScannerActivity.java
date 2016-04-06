package duoy.cn.fancydemo.activity;

import android.os.Bundle;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import cn.trinea.android.common.util.ToastUtils;
import duoy.cn.fancydemo.Constants;
import duoy.cn.fancydemo.R;
import duoy.cn.fancydemo.event.ScannerEvent;
import duoy.cn.fancydemo.fragments.SimpleScannerFragment;

/**
 * Created by Dream on 2016/3/7.
 */
public class ScannerActivity extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        replaceContainer(R.id.frame_layout, SimpleScannerFragment.newInstance());//替换fragment
    }

    @Subscribe(threadMode = ThreadMode.MAIN)//PubNub
    public void onScannerEvent(ScannerEvent event){
        if(!Constants.sRelease){//执行提示
            final String content = event.getContent();
            ToastUtils.show(this, content);
        }
        SimpleScannerFragment scannerFragment = (SimpleScannerFragment)findFragmentById(R.id.frame_layout);
        scannerFragment.resumeScanner();
    }
}
