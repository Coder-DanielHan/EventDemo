package com.example.eventdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class FrameActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_top_bottom);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("d", "【总统】任务<" + Util.actionToString(ev.getAction()) + "> : 需要分派");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        boolean bo = false;
        Log.d("d", "【总统】任务<" + Util.actionToString(ev.getAction()) + "> : 下面都解决不了，下次再也不能靠你们了，哼…只能自己尝试一下啦。能解决？" + bo);
        return bo;
    }


}
