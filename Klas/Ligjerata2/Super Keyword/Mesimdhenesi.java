public class Mesimdhenesi extends Fakulteti{
	private String emri;
	
	
	// Mesimdhenesi m = new Mesimdhenesi("Filan Fisteku", "SHKI");
	public Mesimdhenesi(String eMesimdhenesit, String eFakulteti){
		super(eFakulteti);
		
		emri = eMesimdhenesit;
	}
	
	
	// Mesimdhenesi me emrin : Filan Fisteku
	// punon ne fakultetin : SHKI
	//toString()
	
	public String toString(){
		return "Mesimdhenesi me emrin : " + emri
		+ " punon ne fakultetin : " + super.toStringFakulteti();	
	}
	
	
	public static void main(String[]args){
		Mesimdhenesi m = new Mesimdhenesi("Filan Fisteku", "SHKI");
		System.out.println(m.toString());
		
		
	}

	
	
	
}