package duoy.cn.fancydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import duoy.cn.fancydemo.activity.BorrowActivity;
import duoy.cn.fancydemo.activity.LendActivity;
import duoy.cn.fancydemo.activity.QueryActivity;

public class MainActivity extends AppCompatActivity{

    private Button borrow;
    private Button lend;
    private Button query;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        borrow = (Button) findViewById(R.id.borrow);
        lend = (Button) findViewById(R.id.lend);
        query = (Button) findViewById(R.id.query);

    }

    public void borrow(View view){
        Intent intent = new Intent(this,BorrowActivity.class);
        startActivity(intent);
    }

    public void lend(View view){
        Intent intent = new Intent(this,LendActivity.class);
        startActivity(intent);
    }

    public void query(View view){
        Intent intent = new Intent(this,QueryActivity.class);
        startActivity(intent);
    }
}
