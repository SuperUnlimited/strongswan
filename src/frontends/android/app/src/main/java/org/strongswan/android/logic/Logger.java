package org.strongswan.android.logic;


import android.util.Log;

public class Logger {

	public static void log(int priority, String tag, String message) {
		Log.println(priority, tag, message);
	}
}
