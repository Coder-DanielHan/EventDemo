package com.example.eventdemo;

import android.view.MotionEvent;

public class Util {

	public static String actionToString(int event){
		String result = null;
		switch (event){
		case MotionEvent.ACTION_DOWN:
			result = "ACTION_DOWN";
			break;
		case MotionEvent.ACTION_MOVE:
			result = "ACTION_MOVE";
			break;
		case MotionEvent.ACTION_UP:
			result = "ACTION_UP";
			break;
		}
		return result;
	}
}
