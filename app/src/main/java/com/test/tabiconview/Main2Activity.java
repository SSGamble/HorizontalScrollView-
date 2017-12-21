package com.test.tabiconview;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class Main2Activity extends Activity
{
    private MyHorizontalScrollView mHorizontalScrollView;
    private HorizontalScrollViewAdapter mAdapter;
    private List<Integer> mDatas = new ArrayList<Integer>(Arrays.asList(
            R.drawable.ic_shortcut_format_header_1, R.drawable.ic_shortcut_format_header_2, R.drawable.ic_shortcut_format_header_3,
            R.drawable.ic_shortcut_format_header_4, R.drawable.ic_shortcut_format_header_5, R.drawable.ic_shortcut_format_header_6,
            R.drawable.ic_shortcut_format_header_1, R.drawable.ic_shortcut_format_header_2));

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);

        mHorizontalScrollView = (MyHorizontalScrollView) findViewById(R.id.id_horizontalScrollView);
        mAdapter = new HorizontalScrollViewAdapter(this, mDatas);
        //添加点击回调
        mHorizontalScrollView.setOnItemClickListener(new MyHorizontalScrollView.OnItemClickListener()
        {
            @Override
            public void onClick(View view, int position)
            {
                view.setBackgroundColor(Color.BLUE);
                //处理相应的点击事件
                Log.e("onClick", position+"");
            }
        });
        //设置适配器
        mHorizontalScrollView.initDatas(mAdapter);
    }

}
