package igra.ivanova;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class game extends Activity {
    final String A = "attempt";
	final String B = "gamelog";
	final String C = "mGameState";
	final String D = "firstgame";
	final String E = "gamecount";
	final String F = "wincount";
	final String G = "loosecount";
	final String H = "attemptsall";
	final String I = "settings";
	final String J = "letters";
	public ToggleButton a;
	public ToggleButton b;
	public ToggleButton c;
	public Button d;
	public Button e;
	public TextView f;
	public TextView g;
	public int h = 0;
	public int i;
	public int j;
	public int k;
	public int l;
	public int m;
	public int n;
	public boolean o = true;
	public boolean p = false;
	public boolean q;
	String r;
	String s;
	String t;
	String u;
	SharedPreferences v;
	Editor w;
	WebView x;
	a y = new a();
	final String z = "word";
	public java.lang.String a(int r9) {
		throw new UnsupportedOperationException("Method not decompiled: igra.ivanova.game.a(int):java.lang.String");
    }
	void a() {
	    this.w.putString("word", this.r);
		this.w.putInt("attempt", this.h);
		this.w.putString("gamelog", this.s);
		this.w.putInt("gamecount", this.i);
		this.w.putInt("wincount", this.j);
		this.w.putInt("loosecount", this.k);
		this.w.putInt("attemptsall", this.l);
		this.w.putBoolean("mGameState", this.p);
		this.w.apply();
	}

	void a(Button button) {
	     button.setWidth(this.m);
		 button.setHeight(this.n);
	}

	void a(Button button, String str) {
    	this.v = getSharedPreferences("settings", 0);
		Editor edit = this.v.edit();
		edit.putString(getResources().getResourceName(button.getId()).substring(29), str);
		edit.apply();
	}
	void b() {
	    this.p = this.v.getBoolean("mGameState", false);
		this.r = this.v.getString("word", "");
		this.y.c = this.r; this.y.a = this.r.length();
		this.h = this.v.getInt("attempt", 0);
		this.s = this.v.getString("gamelog", "");
		this.q = this.v.getBoolean("firstgame", true);
		this.i = this.v.getInt("gamecount", 0);
		this.j = this.v.getInt("wincount", 0);
		this.k = this.v.getInt("loosecount", 0);
		this.l = this.v.getInt("attemptsall", 0);
	}

	public void backspace(View view) {
	    if (this.f.getText().toString().length() != 0) {
    		CharSequence stringBuffer = new StringBuffer(this.f.getText().toString());
			stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
			this.f.setText(stringBuffer);
		}
	}

	public void buttonClick(View view) {
	    Button button = (Button) findViewById(view.getId());
		this.v = getSharedPreferences("settings", 0);
		if (this.p) {
		    if (this.o) {
			    this.f.setText("");
			    this.o = false;
			}
			String string = this.v.getString(getResources().getResourceName(view.getId()).substring(29), "normal");
   			if (this.a.isChecked() && !string.equals("yellow")) {
        		button.setBackgroundResource(2130837604);
				a(button, "yellow");
				this.y.d(button.getText().toString());
				this.y.e(button.getText().toString());
				e();
				return;
			} else if (this.a.isChecked() && string.equals("yellow")) {
			    button.setBackgroundResource(2130837600);
			    a(button, "normal");
			    return;
			} else if (this.c.isChecked() && !string.equals("red")) {
			    button.setBackgroundResource(2130837603);
				a(button, "red");
				this.y.b(button.getText().toString());
				e();
				return;
			} else if (this.c.isChecked() && string.equals("red")) {
    			button.setBackgroundResource(2130837600);
				a(button, "normal");
				this.y.d(button.getText().toString());
				e();
				return;
			} else if (this.b.isChecked() && !string.equals("green")) {
    			button.setBackgroundResource(2130837602);
				a(button, "green");
				this.y.c(button.getText().toString());
				e();
				return;
			} else if (this.b.isChecked() && string.equals("green")) {
			    button.setBackgroundResource(2130837600);
				a(button, "normal");
				this.y.e(button.getText().toString());
				e();
				return;
			} else {
			   a(button);
			   this.f.append(button.getText().toString());
			   return;
			   }
			}
			Toast.makeText(this, "\u0418\u0433\u0440\u0430 \u043e\u043a\u043e\u043d\u0447\u0435\u043d\u0430, \u043d\u0435\u0447\u0435\u0433\u043e \u043f\u043e \u043a\u043d\u043e\u043f\u043a\u0430\u043c \u0442\u044b\u043a\u0430\u0442\u044c", 1).show();
		}

		void c() {
		    for (int i = 1; i <= 32; i++) {
			     this.w.putString("button" + i, "normal");
			}
			this.w.apply();
		}

		public void checkAnswer(View view) {
    		if (this.f.length() != this.y.a) {
			Toast.makeText(this, "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0441\u043b\u043e\u0432\u043e \u0438\u0437 " + this.y.a + " \u0431\u0443\u043a\u0432, \u0430 \u043d\u0435 \u0438\u0437 " + this.f.length(), 1).show();
			return;
		}
		this.y.a(this.f.getText().toString().toUpperCase());
		this.h++;
		this.s = this.s.concat("\n" + this.h + ": " + this.f.getText().toString() + ": ");
		if (this.f.getText().toString().equals(this.y.c.toUpperCase())) {
		    this.p = false;
			this.j++;
			this.i++;
			this.l += this.h;
			a();
			this.e.setVisibility(0);
			c();
		}
		e();
		this.f.setText("");
	}

	public void checkBtns(View view) {
	    if (this.p) {
		    if (this.o) {
			    this.o = false;
				this.f.setText("");
			}
			if (view.getId() == 2131427456) {
			    this.c.setChecked(false);
				this.c.setBackgroundResource(2130837600);
				this.b.setChecked(false);
				this.b.setBackgroundResource(2130837600);
				if (this.a.isChecked()) {
				    this.a.setBackgroundResource(2130837604);
					this.a.setTextSize(12.0f);
					return;
				}
				this.a.setBackgroundResource(2130837600);
				this.a.setTextSize(14.0f);
				return;
			} else if (view.getId() == 2131427457) {
			    this.c.setChecked(false);
				this.c.setBackgroundResource(2130837600);
				this.a.setChecked(false);
				this.a.setBackgroundResource(2130837600);
				if (this.b.isChecked()) {
				    this.b.setBackgroundResource(2130837602);
					this.b.setTextSize(12.0f);
					return;
				}
				this.b.setBackgroundResource(2130837600);
				this.b.setTextSize(14.0f);
				return;
			} else if (view.getId() == 2131427458) {
			    this.a.setChecked(false);
				this.a.setBackgroundResource(2130837600);
				this.b.setChecked(false);
				this.b.setBackgroundResource(2130837600);
				if (this.c.isChecked()) {
				    this.c.setBackgroundResource(2130837603);
					this.c.setTextSize(12.0f);
					return;
				}
				this.c.setBackgroundResource(2130837600);
				this.c.setTextSize(14.0f);
				return;
			} else {
			    return;
			}
		}
		Toast.makeText(this, "\u0418\u0433\u0440\u0430 \u043e\u043a\u043e\u043d\u0447\u0435\u043d\u0430, \u043d\u0435\u0447\u0435\u0433\u043e \u043f\u043e \u043a\u043d\u043e\u043f\u043a\u0430\u043c \u0442\u044b\u043a\u0430\u0442\u044c", 1).show();
	}
	void d() {
	    Button[] buttonArr = new Button[33];
		for (int i = 1; i <= 33; i++) {
		     String str = "button" + i;
			 buttonArr[i - 1] = (Button) findViewById(getResources().getIdentifier(str, "id", getPackageName()));
			 str = this.v.getString(str, "normal");
			 Object obj = -1;
			 switch (str.hashCode()) {
			     case -1039745817:
				     if (str.equals("normal")) {
					     obj = null;
						 break;
					}
					break;
				case -734239628:
    				if (str.equals("yellow")) {
    		 		  	obj = 2;
						break;
					}
					break;
				case 112785:
    				if (str.equals("red")) {
					    int i2 = 1;
					    break;
				    }
				    break;
			    case 98619139:
    			    if (str.equals("green")) {
                        obj = 3;
						break;
					}
					break;
			}
			switch (obj) {
			    case null:
    				buttonArr[i - 1].setBackgroundResource(2130837600);
					break;
				case 1:
	    			buttonArr[i - 1].setBackgroundResource(2130837603);
					this.y.b(buttonArr[i - 1].getText().toString());
					break;
				case 2:
    				buttonArr[i - 1].setBackgroundResource(2130837604);
					break;
				case 3:
				    buttonArr[i - 1].setBackgroundResource(2130837602);
					this.y.c(buttonArr[i - 1].getText().toString());
					break;
				default:
				    break;
			}
			a(buttonArr[i - 1]);
		}
	}

	void e() {
	    this.x = (WebView) findViewById(2131427414);
		this.x.setBackgroundColor(getResources().getColor(2131361821));
		this.x.loadDataWithBaseURL(null, this.t + this.y.b() + this.u, "text/html; charset=utf-8", "utf-8", null);
		this.x.postDelayed(new Runnable(this) {
		    final /* synthetic */ game a;

			{
     			 this.a = r1;
			}

			public void run() {
			    this.a.x.setScrollY(this.a.x.getBottom());
			}
		}, 200);
	}

	public void loose(View view) {
    	if (this.p) {
    		this.y.b = true;
			e();
			this.s = this.s.concat("\n\u0412\u044b \u043f\u0440\u043e\u0438\u0433\u0440\u0430\u043b\u0438, \u0430 \u0437\u0430\u0433\u0430\u0434\u0430\u043d\u043e \u0431\u044b\u043b\u043e \u0441\u043b\u043e\u0432\u043e \"" + this.r + "\"");
			this.p = false;
			this.i++;
			this.l += this.h;
			this.k++;
			a();
			this.e.setVisibility(0);
			c();
		}
	}

	public void onCreate(Bundle bundle) {
    	setContentView(2130968603);
		super.onCreate(bundle);
		this.a = (ToggleButton) findViewById(2131427456);
		this.b = (ToggleButton) findViewById(2131427457);
		this.c = (ToggleButton) findViewById(2131427458);
		this.e = (Button) findViewById(2131427422);
		this.f = (TextView) findViewById(2131427419);
		this.t = getString(2131099683);
		this.u = getString(2131099685);
		this.v = getSharedPreferences("settings", 0);
		this.w = this.v.edit();
		getWindow().addFlags(128);
		this.e.setOnClickListener(new OnClickListener(this) {
    		final /* synthetic */ game a;

			{
	    		this.a = r1;
			}

			public void onClick(View view) {
	    		this.a.d();
				this.a.e.setVisibility(4);
				this.a.r = this.a.a(this.a.v.getInt("letters", 0));
				this.a.h = 0;
				this.a.p = true;
				this.a.s = "\u0417\u0430\u0433\u0430\u0434\u0430\u043d\u043e \u0441\u043b\u043e\u0432\u043e \u0438\u0437 " + this.a.r.length() + " \u0431\u0443\u043a\u0432";
				this.a.y.a = this.a.r.length();
				this.a.y.c = this.a.r;
				this.a.a();
				this.a.e();
			}
		});
		this.f.setOnClickListener(new OnClickListener(this) {
			final /* synthetic */ game a;

			{
	            this.a = r1;
			}

			public void onClick(View view) {
			    this.a.f.setText("");
			}
		});
		this.g = (TextView) findViewById(2131427416);
		this.g.setOnClickListener(new OnClickListener(this) {
			final /* synthetic */ game a;

			{
			    this.a = r1;
			}

			public void onClick(View view) {
				this.a.startActivity(new Intent(this.a, help.class));
				}
			});
			this.d = (Button) findViewById(2131427427);
			this.m = this.d.getWidth();
			this.n = this.d.getHeight();
			b();
			d();
			if (this.q) {
				this.q = false;
				this.w.putBoolean("firstgame", this.q);
				this.w.apply();
			}
			if (this.p) {
			    this.y.f(this.s);
				this.h = this.y.d.size();
				if (this.h == 0 && this.v.getInt("letters", 0) != this.r.length()) {
					this.r = a(this.v.getInt("letters", 0));
					this.s = "\u0417\u0430\u0433\u0430\u0434\u0430\u043d\u043e \u0441\u043b\u043e\u0432\u043e \u0438\u0437 " + this.r.length() + " \u0431\u0443\u043a\u0432";
					this.y.a = this.r.length();
					this.y.c = this.r;
				}
			} else {
        		this.r = a(this.v.getInt("letters", 0));
				this.h = 0;
				this.p = true;
				this.s = "\u0417\u0430\u0433\u0430\u0434\u0430\u043d\u043e \u0441\u043b\u043e\u0432\u043e \u0438\u0437 " + this.r.length() + " \u0431\u0443\u043a\u0432";
				this.y.a = this.r.length();
				this.y.c = this.r;
			}
			e();
		}

		protected void onDestroy() {
    		a();
			super.onDestroy();
		}

		protected void onPause() {
			a();
			super.onPause();
		}

		protected void onRestart() {
		    super.onRestart();
		}

		protected void onResume() {
		    super.onResume();
		}

		protected void onStart() {
		    super.onStart();
		}

		protected void onStop() {
			super.onStop();
		}
}
