public class Docent extends AkademikPersonel {
	public String sinifAdi = "Docent";
	public int ekDers = 3;
	public int ekDersUcreti = 10;
	public int maas = 125;
	
	public Docent(String ad, String soyad, Zaman dogumGunu, int TCNo) {super(ad, soyad, dogumGunu, TCNo);}
	
	public void Yazdir() {
		System.out.println(sinifAdi + " Maasi: " + (maas + ekDers * ekDersUcreti) + " " + 
		super.sinifAdi + " Maasi: " + super.maas);
	}
}