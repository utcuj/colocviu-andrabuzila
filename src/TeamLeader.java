
public class TeamLeader extends Angajat{
	private int salariu;
	private int nivel1 = 200;
	private int nivel2 = 300;

	public TeamLeader(String nume, int varsta, int nrAniExperienta, int tarif) {
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

}
