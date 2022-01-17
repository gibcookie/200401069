public class AkademikPersonel {
	public String ad;
	public String soyad;
	public Zaman dogumGunu;
	public int TCNo; // TCNo > max int
	public int maas = 100;
	public String sinifAdi = "Akademik Personel";
	
	public AkademikPersonel(String ad, String soyad, Zaman dogumGunu, int TCNo) {
		this.ad = ad;
		this.soyad = soyad;
		this.TCNo = TCNo;
		
		try {this.dogumGunu = dogumGunu;}
		catch (IllegalArgumentException zamanHatasi) {System.out.printf(zamanHatasi.getMessage());}
	}
	
	public int Kazanc() {return maas;}
	public void Yazdir() {System.out.println(sinifAdi + " Maasi: " + maas);}
}