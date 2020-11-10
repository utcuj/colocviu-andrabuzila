import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nrAngajati = in.nextInt();
		System.out.println(nrAngajati);
		Companie companie = new Companie(nrAngajati);
		TeamLeader tLeader1 = new TeamLeader("Ionel", 27, 3, 200);
		TeamLeader tLeader2 = new TeamLeader("Marcela", 30, 8, 400);
		Manager manager = new Manager("Andrei", 40, 18, 1000);
		Developer dev1 = new Developer("Dan", 30, 9, 500, "problema 1");
		Developer dev2 = new Developer("Alina", 32, 9, 500, "problema 2");
		Developer dev3 = new Developer("Ioana", 27, 6, 400, "problema 1");
		Developer dev4 = new Developer("Cristi", 25, 3, 200, "problema 3");
		System.out.println(dev1.afisareTask());
		System.out.println(dev2.afisareTask());
		Angajat[] angajatii = new Angajat[nrAngajati];
		angajatii[0] = tLeader1;
		angajatii[1] = tLeader2;
		angajatii[2] = manager;
		angajatii[3] = dev1;
		angajatii[4] = dev2;
		angajatii[5] = dev3;
		angajatii[6] = dev4;
		manager.addAngajat(angajatii, companie);
		System.out.println("\n");
		companie.Afisare();
		String nume1 = "Rescue";
		String nume2 = "Eco Team";
		Angajat[] echipa1 = new Angajat[3];
		Angajat[] echipa2 = new Angajat[4];
		echipa1[0] = dev1;
		echipa1[1] = dev2;
		echipa2[0] = dev3;
		echipa2[1] = dev4;
		echipa1[2] = tLeader1;
		echipa2[2] = tLeader2;
		echipa2[3] = dev1;
		
		
		Echipa echipaRescue = new Echipa();
		Echipa echipaEco = new Echipa();
		echipaRescue =manager.creeazaEchipa(nume2, echipa2);
		echipaEco = manager.creeazaEchipa(nume1, echipa1);
		
		dev1.salariu(40, 1);
		manager.salariu(70, 2);
		tLeader1.salariu(50, 1);
		
		
		
	}

}
