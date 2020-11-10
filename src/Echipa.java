
public class Echipa {
	private String nume;
	private Angajat[] angajat = new Angajat[10];
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public Angajat[] getAngajat() {
		return angajat;
	}
	public void setAngajat(Angajat[] angajat) {
		this.angajat = angajat;
	}
	
	public Echipa(String nume, Angajat[] angajat) {
		this.angajat = angajat;
		this.nume = nume;
	}
	
	public void afisareEchipa() {
		System.out.println(nume+":");
		for(Angajat a:angajat) {
			if(a!=null)
			{
				if(a instanceof TeamLeader)
				{
					System.out.println("Teamleaderul este: "+ a.getNume()+ " , ");
				}
				else
					System.out.println(a.getNume()+ " , ");
			}
		}
		
	}
	public Echipa() {
		this(null,null);
	}

}
