package fragment.bwie.com.myweek;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //属性定义
    private ImageButton mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //视图属性初始化
        mButton = (ImageButton) findViewById(R.id.image_button);
        //视图添加点击事件
        mButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                       //点击事件
                        mButton.setBackgroundResource(R.mipmap.man);
                        mButton.setColorFilter(Color.RED);

                        break;
                    case MotionEvent.ACTION_UP:
                        //松开事件
                        mButton.setBackgroundResource(R.mipmap.woman);
                        break;
                }
                return true;
            }
        });
    }
}
