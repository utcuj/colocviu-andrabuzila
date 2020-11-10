
public class Manager extends Angajat{
	int nivel1 = 300;
	int nivel2 = 400;
	private int salariu;

	public Manager(String nume, int varsta, int nrAniExperienta, int tarif) {
		super(nume, varsta, nrAniExperienta, tarif);
		// TODO Auto-generated constructor stub
	}
	public void salariu(int nrOreLucrate, int nivel) {
		if(nivel == 1)
			salariu = tarif*nrOreLucrate+nivel1;
		if(nivel == 2)
			salariu = tarif*nrOreLucrate+nivel2;
		System.out.println(salariu);
		
	}
	public void addAngajat(Angajat[] a, Companie c) {
		c.setAngajat(a);
	}
	
	public Echipa creeazaEchipa(String nume, Angajat[] angajati) {
		Echipa echipa1 = new Echipa(nume,angajati);
		echipa1.afisareEchipa();
		System.out.println("\n");
		return echipa1;
	}
	
	public void stergeEchipa(String nume) {
		System.out.println("Echipa "+nume+" a fost stearsa.");
	}

}
