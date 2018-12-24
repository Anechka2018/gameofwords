package com.example.a1;

import java.util.ArrayList;
import java.util.Iterator; 

public class a { 
    public int a;
    public boolean b = false;
	public String c = "";
	ArrayList<String> d = new ArrayList();
	ArrayList<String> e = new ArrayList();
	ArrayList<String> f = new ArrayList();

	private String g(String str) { 
	    int i;
		char[] toCharArray = this.c.toUpperCase().toCharArray();
		char[] toCharArray2 = str.toCharArray(); 
		int i2 = 0; 
		for (i = 0; i < toCharArray.length; i++) { 
		    if (toCharArray[i] == toCharArray2[i]) { 
			i2++;
			} else { 
			  toCharArray2[i - i2] = toCharArray2[i];
			  toCharArray[i - i2] = toCharArray[i]; 
			} 
		} 
		i = 0;
		for (int i3 = 0; i3 < toCharArray.length - i2; i3++) {
     		for (int i4 = 0; i4 < toCharArray2.length - i2; i4++) { 
			     if (toCharArray[i3] == toCharArray2[i4]) { 
				     i++;
					 toCharArray2[i4] = 'z';
					 break; 
				} 
			} 
		}
		if (i2 != this.a) { 
		    return ": the bulls - " + i2 + ", cows - " + i;
		}
		String str2 = ": the bulls - " + i2 + ", cows - " + i + "</p><p> And this is the correct answer!";
		a();
		return str2;
	} 
	public void a() { 
	       this.d.clear(); 
		   this.e.clear(); 
		   this.f.clear(); 
		   this.b = false; 
	} public void a(String str) { 
	      this.d.add(str); 
	} public String b() {
       	String str = "<p>Made a guess word of " + this.a + " letters</p>";
		Iterator it = this.d.iterator(); 
		String str2 = str; 
		int i = 1; 
		while (it.hasNext()) { 
		String str3 = (String) it.next(); 
		String concat = str2.concat("<p>" + i + ": "); 
		for (int i2 = 0; i2 < this.a; i2++) { 
		     concat = this.e.contains(str3.substring(i2, i2 + 1)) ? concat.concat("<span class=\"wrong\">" + str3.substring(i2, i2 + 1) + "</span>") : this.f.contains(str3.substring(i2, i2 + 1)) ? concat.concat("<span class=\"ok\">" + str3.substring(i2, i2 + 1) + "</span>") : concat.concat(str3.substring(i2, i2 + 1));
		}
		str2 = concat.concat(g(str3) + "</p>"); 
		i++;
		} 
		if (!this.b) { 
		return str2; 
		} 
		str2 = str2.concat("<p>You lost. And the word was made  <span class=\"ok\">" + this.c.toUpperCase() + "</span></p>");
		a();
		return str2; 
		}
		public void b(String str) { 
		    this.e.add(str);
		    if (this.f.contains(str)) {
		       e(str);
		    }
		} 
		public void c(String str) { 
		    this.f.add(str); 
			if (this.e.contains(str)) { 
			d(str); 
			} 
		} 
		public void d(String str) {
     		this.e.remove(str); 
		} 
		public void e(String str) { 
		    this.f.remove(str);
    	} 
		public void f(String str) {
		    int indexOf = str.indexOf(":", 0);
		    while (indexOf > -1) { 
		        this.d.add(str.substring(indexOf + 2, (indexOf + 2) + this.a)); 
				indexOf = str.indexOf(":", (indexOf + 3) + this.a); 
			} 
		}
}
