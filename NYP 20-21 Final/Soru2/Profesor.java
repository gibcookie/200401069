public class Profesor extends Docent {
	public int projeSayisi = 2;
	public int projeUcreti = 30;
	public int maas = 150;
	
	public Profesor(String ad, String soyad, Zaman dogumGunu, int TCNo) {super(ad, soyad, dogumGunu, TCNo);}
	
	public void Yazdir() {
		System.out.println(sinifAdi + " Maasi: " + (maas + ekDers * ekDersUcreti + projeSayisi * projeUcreti) + " " + 
		super.sinifAdi + " Maasi: " + (super.maas + super.ekDers * super.ekDersUcreti));
	}
}
