package algorithm;

public class Cylinder implements Cloneable{
	private Algorithm a;
	private int c[];
	public Cylinder(Algorithm aa) throws GChar {a=aa;c=new int[26];
	for(int i=0;i<26;i++) {c[i]=(int)(a.sifruj((char)('a'+i))-'a');}}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\n"+a+"\n");
		for(int i=0;i<26;i++) {sb.append("("+(char)('a'+i)+","+c[i]+") ");}
		return sb.toString();
	}
	public char sifrovanje(char cc) {
		return (char)('a'+c[cc-'a']);
	}
	public Cylinder clone() throws CloneNotSupportedException {try {
		Cylinder copy=(Cylinder) super.clone();
		copy.a=a;copy.c=c.clone();
		return copy;
	}catch (CloneNotSupportedException e) {}
	return null;
 	}
}
