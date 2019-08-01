package algorithm;

public class Affine extends Algorithm{
	private int a,b;
	public Affine(int aa,int bb) throws GRange {if(aa<0 || bb<0)throw new GRange();a=aa;b=bb;}
	public char sifruj(char c) throws GChar {
		super.sifruj(c);
	return (char) ('a'+(a*c+b)%26);
	}
	public String toString() {return "Affine: "+a+","+b;}
	
}
