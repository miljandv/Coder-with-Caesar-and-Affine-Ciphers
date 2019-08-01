package algorithm;

public class Caesar extends Algorithm{
	private int p;
	public Caesar(int pp) throws GRange {if(pp<1 || pp>26)throw new GRange();p=pp;}
	public char sifruj(char c) throws GChar {super.sifruj(c);
	return (char) ((char)('a'+(c+p-'a')%26));
	}
	public String toString() {return "Cezar: "+p;}
}
