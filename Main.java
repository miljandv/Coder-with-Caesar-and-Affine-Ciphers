package algorithm;
public class Main {
	public static void main(String args[]) throws GRange, GChar, CloneNotSupportedException {try {
		Affine a1=new Affine(3,7);
		Caesar a2=new Caesar(6);
		Cylinder c1=new Cylinder(a1);
	 	Cylinder c2=new Cylinder(a2);
	 	Rotor r=new Rotor(c1).dodaj(c2).dodaj(c1.clone());
	 	System.out.println(r);
	 	char[] c=new char[4];c[0]='a';c[1]='b';c[2]='c';c[3]='d';
	 	char[] cc=new char[4];
	 	cc=r.sif(c);System.out.print(c);System.out.print(" - ");System.out.print(cc);
	}
	catch (GRange e) {System.err.println(e);}
	catch (GChar e) {System.err.println(e);}
	}
}
