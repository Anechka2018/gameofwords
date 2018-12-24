package com.example.a1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.Locale;

public class mainscreen extends Activity {
	SharedPreferences a;
	boolean b;
	boolean c;
	int d=0;
	int e;
	int f;
	int g;
	int h;
	float i;
	TextView j;
	TextView k;
	TextView l;
	TextView m;
	TextView n;
	TextView o;
	TextView p;
	TextView q;
	final String r="mGameState";
	final String s="firstgame";
	final String t="gamecount";
	final String u="wincount";
	final String v="loosecount";
	final String w="attemtsall";
	final String x="settings";
	final String y="letters";
	OnClickListener z= new OnClickListener(this) {
		final /* synthetic */ mainscreen a;
		
		{
			this.a= r1;
		}
		
		public void onClick(View view) {
			this.a.a=this.a.getSharedPreferences("settings", 0);
			SharedPreferences.Editor edit = this.a.a.edit();
			this.a.h=this.a.a.getInt("letters", 0);
			TextView textView = (TextView) this.a.findViewById(view.getId());
			TextView textView2 = (TextView) this.a.findViewById(2131427469);
			switch (this.a.h) {
				case 4:
				  textView2 = (TextView) this.a.findViewById(2131427464);
				break;
				case 5:
				  textView2 = (TextView) this.a.findViewById(2131427465);
				break;
				case 6:
				  textView2 = (TextView) this.a.findViewById(2131427466);
				break;
				case 7:
				  textView2 = (TextView) this.a.findViewById(2131427467);
				break;
				case 8:
				  textView2 = (TextView) this.a.findViewById(2131427468);
				break;
			}
			textView2.setTextSize(14.0f);
			switch (view.getId()) {
				case 2131427464:
				  textView.setTextSize(24.0f);
				  edit.putInt("letters", 4);
				break;
				case 2131427465:
				  textView.setTextSize(24.0f);
				edit.putInt("letters", 5);
				break;
				case 2131427466:
				  textView.setTextSize(24.0f);
				  edit.putInt("letters", 6);
				break;
				case 2131427467:
				  textView.setTextSize(24.0f);
				  edit.putInt("letters", 7);
				break;
				case 2131427468:
				  textView.setTextSize(24.0f);
				  edit.putInt("letters", 8);
				break;
				case 2131427469:
				  textView.setTextSize(24.0f);
				  edit.putInt("letters", 0);
				break;
			}
			((SharedPreferences.Editor) edit).apply();
		}
	};
	
	void a() {
		this.a=getSharedPreferences("settings", 0);
		this.b=this.a.getBoolean("mGameState", false);
		this.c=this.a.getBoolean("firstgame", true);
		this.d=this.a.getInt("gamecount", 0);
		this.e=this.a.getInt("wincount", 0);
		this.f=this.a.getInt("loosecount", 0);
		this.g=this.a.getInt("attemtsall", 0);
		this.h=this.a.getInt("letters", 0);
	}
	
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(2130968605);
		this.j = (TextView) findViewById(2131427460);
		this.k = (TextView) findViewById(2131427463);
		this.l = (TextView) findViewById(2131427464);
		this.l.setOnClickListener(this.z);
		this.m = (TextView) findViewById(2131427465);
		this.m.setOnClickListener(this.z);
		this.n = (TextView) findViewById(2131427466);
		this.n.setOnClickListener(this.z);
		this.o = (TextView) findViewById(2131427467);
		this.o.setOnClickListener(this.z);
		this.p = (TextView) findViewById(2131427468);
		this.p.setOnClickListener(this.z);
		this.q = (TextView) findViewById(2131427469);
		this.q.setOnClickListener(this.z);
		a();
		switch (this.h) {
			case 0:
			this.q.getTextSize (24.0f);
			break;
			case 4:
			this.l.getTextSize (24.0f);
			break;
			case 5:
			this.m.getTextSize (24.0f);
			break;
			case 6:
			this.n.getTextSize (24.0f);
			break;
			case 7:
			this.o.getTextSize (24.0f);
			break;
			case 8:
			this.p.getTextSize (24.0f);
			break;
		}
		if (this.e>0){
			this.i=((float) this.g)/((float) this.e);
		}
		if (!this.c && this.e > 0) { 
		      this.k.setText("Victories: " + this.e + ", lesions: " + this.f + ", average guess with " + String.format(Locale.ENGLISH, "%(.2f", new Object[]{Float.valueOf(this.i)}) + " attempts");
			  } 
			  this.j.setOnClickListener(new OnClickListener(this) {
				  final /* synthetic */ mainscreen a;
				  {
					  this.a = r1;
					  } 
					  public void onClick(View view) {
						  this.a.startActivity(new Intent(this.a, game.class));
						  } 
						  });
						  } 
						  protected void onPostCreate(Bundle bundle) { 
						  super.onPostCreate(bundle); 
						  }
						  protected void onRestart() { 
						  super.onRestart(); 
						  a();
						  if (this.e > 0) {
							  this.i = ((float) this.g) / ((float) this.e); 
							  } 
			  if (!this.c && this.e > 0) { 
			  this.k.setText("Victories: " + this.e + ", lesions: " + this.f + ", average guess with " + String.format(Locale.ENGLISH, "%(.2f", new Object[]{Float.valueOf(this.i)}) + " attempts");
		 } 
	}
}	
	