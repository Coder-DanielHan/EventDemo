package com.example.eventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLinearLayout extends LinearLayout{  
    
    public MyLinearLayout(Context context, AttributeSet attrs) {  
        super(context, attrs);  
    }  
      
    @Override  
    public boolean dispatchTouchEvent(MotionEvent ev) {  
        Log.d("d", "���г�������<" + Util.actionToString(ev.getAction()) + "> : ��Ҫ����");  
        return super.dispatchTouchEvent(ev);  
    }  
  
    @Override  
    public boolean onInterceptTouchEvent(MotionEvent ev) {  
        boolean bo = false;  
        Log.d("d", "���г�������<" + Util.actionToString(ev.getAction()) + "> : ������" + bo);  
        return bo;  
    }  
  
    @Override  
    public boolean onTouchEvent(MotionEvent ev) {  
        boolean bo = false;  
        Log.d("d", "���г�������<" + Util.actionToString(ev.getAction()) + "> : ũ����û�ã��´���Ҳ�������ˣ����Լ�������һ�¡��ܽ����" + bo);  
        return bo;  
    }  
}
