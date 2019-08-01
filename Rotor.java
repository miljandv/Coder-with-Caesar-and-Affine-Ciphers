package algorithm;

import javax.net.ssl.SNIHostName;

public class Rotor {
	private class elem{
		Cylinder c;
		elem next;
		elem(Cylinder cc){
			c=cc;
			if(prvi==null)prvi=this;
			else posl.next=this;posl=this;
		}
	}
	public char[] sif(char cc[]) {
		char[] c=new char[cc.length];
		for(int i=0;i<cc.length;i++) {
			c[i]=cc[i];
			for(elem tek=prvi;tek!=null;tek=tek.next) {
				c[i]=tek.c.sifrovanje(c[i]);
			}}
		return c;
	}
	elem prvi,posl;
	public Rotor(Cylinder c){this.new elem(c);}
	public Rotor dodaj(Cylinder c) {this.new elem(c);return this;}
	public String toString() {
		StringBuffer sb=new StringBuffer();
		for(elem tek=prvi;tek!=null;tek=tek.next) {
			sb.append(tek.c);
		}
		return sb.toString();
	}
}
