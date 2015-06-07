package com.example.eventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class MyTextView extends TextView  
{  
    public MyTextView(Context context, AttributeSet attrs){  
        super(context, attrs);  
    }  
      
    @Override  
    public boolean dispatchTouchEvent(MotionEvent ev){  
        Log.d("d", "��ũ������<" + Util.actionToString(ev.getAction()) + "> : ��Ҫ���ɣ�������û���ˣ���ô�죿�Լ��ɰ�");  
        return super.dispatchTouchEvent(ev);  
    }  
      
    @Override  
    public boolean onTouchEvent(MotionEvent ev){  
        boolean bo = true;  
        Log.d("d", "��ũ������<" + Util.actionToString(ev.getAction()) + "> : �Լ����֣���ͷ��ɡ��ܽ����" + bo);  
        return bo;  
    }  
}
