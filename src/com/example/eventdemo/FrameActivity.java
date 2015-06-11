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
        Log.d("d", "����ͳ������<" + Util.actionToString(ev.getAction()) + "> : ��Ҫ����");  
        return super.dispatchTouchEvent(ev);  
    }  
      
    @Override  
    public boolean onTouchEvent(MotionEvent ev) {  
        boolean bo = false;  
        Log.d("d", "����ͳ������<" + Util.actionToString(ev.getAction()) + "> : ���涼������ˣ��´���Ҳ���ܿ������ˣ��ߡ�ֻ���Լ�����һ�������ܽ����" + bo);  
        return bo;  
    }  


}
