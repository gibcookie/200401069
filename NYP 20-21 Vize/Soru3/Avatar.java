import java.util.Random;
public class Avatar {
	Random sayi = new Random();
	private int guc,tur;
	
	public Avatar(int rguc, int rtur) {
		guc = rguc;
		tur = rtur;
	}
	public Avatar() {}
	
	public int GetGuc() {return guc;}
	public int GetTur() {return tur;}
	public void SetGuc(int deger1) {guc = deger1;}
	public void SetTur(int deger2) {tur = deger2;}
	
	public Avatar olusturucu() {
		return new Avatar(1 + sayi.nextInt(10), sayi.nextInt(2));
	}
}
