package com.example.eventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class MyFrameLayout extends FrameLayout  
{  
    public MyFrameLayout(Context context, AttributeSet attrs){  
        super(context, attrs);  
    }  
      
    @Override  
    public boolean dispatchTouchEvent(MotionEvent ev) {  
        Log.d("d", "��ʡ��������<" + Util.actionToString(ev.getAction()) + "> : ��Ҫ����");  
        return super.dispatchTouchEvent(ev) ;
    }  
  
    @Override  
    public boolean onInterceptTouchEvent(MotionEvent ev) {  
        boolean bo = false;  
        Log.d("d", "��ʡ��������<" + Util.actionToString(ev.getAction()) + "> : ������" + bo);  
        return bo;  
    }  
  
    @Override  
    public boolean onTouchEvent(MotionEvent ev) {  
        boolean bo = false;  
        Log.d("d", "��ʡ��������<" + Util.actionToString(ev.getAction()) + "> : �г��Ǹ�����´���Ҳ�������ˣ����Լ�������һ�¡��ܽ����" + bo);  
        return bo;  
    }  
}
