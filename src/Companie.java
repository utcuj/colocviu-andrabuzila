
public class Companie {
	private int nrAngajati;
	private Angajat[] angajat = new Angajat[nrAngajati];
	public Companie(int nrAngajati)
	{
		this.nrAngajati = nrAngajati;
	}
	
	
	public Angajat[] getAngajat() {
		return angajat;
	}


	public void setAngajat(Angajat[] angajat) {
		this.angajat = angajat;
	}

	public void Afisare() {
		for(Angajat a: angajat)
		{
			if(a!=null) {
				if(a instanceof Manager)
					System.out.println(a.getNume()+" , manager");
				if(a instanceof Developer)
					System.out.println(a.getNume()+" , developer");
				if(a instanceof TeamLeader)
					System.out.println(a.getNume()+" , team Leader");
			}
		}
	}

}
