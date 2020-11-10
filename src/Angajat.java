
public abstract class Angajat {
	String nume;
	int varsta;
	int nrAniExperienta;
	int tarif;
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getNrAniExperienta() {
		return nrAniExperienta;
	}

	public void setNrAniExperienta(int nrAniExperienta) {
		this.nrAniExperienta = nrAniExperienta;
	}

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	
	public Angajat(String nume, int varsta, int nrAniExperienta, int tarif) {
		this.nrAniExperienta = nrAniExperienta;
		this.nume = nume;
		this.tarif = tarif;
		this.varsta = varsta;
	}
	
	public abstract void salariu(int nrOreLucrate, int nivel);

}
