
public class Calisan {
	private String Ad;
	private String Soyad;
	private static int sayi = 0;
	
	public Calisan(String Ad, String Soyad) {
		this.Ad = Ad;
		this.Soyad = Soyad;
		++sayi;
		System.out.printf("\"%s %s\" calisani ile toplamda %d calisan olusturuldu.\n", Ad, Soyad, sayi);
	}
	
	public String GetAd() {return Ad;}
	public String GetSoyad() {return Soyad;}
	public static int GetSayi() {return sayi;}
}
