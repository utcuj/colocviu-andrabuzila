
public class Developer extends Angajat{
	private int salariu;
	private int nivel1 = 100;
	private int nivel2 = 200;

	private String task;
	
	public Developer(String nume, int varsta, int nrAniExperienta, int tarif, String task) {
		super(nume, varsta, nrAniExperienta, tarif);
		this.task = task;
		// TODO Auto-generated constructor stub
	}

	

	public String getTask() {
		return task;
	}


	public void setTask(String task) {
		this.task = task;
	}
	
	public String afisareTask()
	{
		return nume+" rezolva "+ task;
	}


	public void salariu(int nrOreLucrate, int nivel) {
		if(nivel == 1)
			salariu = tarif*nrOreLucrate+nivel1;
		if(nivel == 2)
			salariu = tarif*nrOreLucrate+nivel2;
		System.out.println(salariu);
		
	}

}
