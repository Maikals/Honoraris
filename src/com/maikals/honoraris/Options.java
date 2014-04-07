package com.maikals.honoraris;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class Options extends PreferenceActivity {
	private static String OPT_IVA = "IVA";
	private static String OPT_IVA_DEF = "21";
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.menu.opcions);
	}
	public static double getTemps(Context context) {
		String s = PreferenceManager.getDefaultSharedPreferences(context).getString(OPT_IVA, OPT_IVA_DEF);
		double n = Double.parseDouble(s);
		return n;
	}
}
