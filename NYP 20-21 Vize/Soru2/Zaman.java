import java.util.Scanner;
public class Zaman {
	public static void main(String[] args) {
		Scanner emici = new Scanner(System.in);
		System.out.print("Saniye cinsinden sure giriniz: ");
		int[] zaman = ZamanCevirici(emici.nextInt());
		emici.close();
		System.out.println("Saat: " + zaman[0] + "Dakika: " + zaman[1] + "Saniye: " + zaman[2]);
	}
	
	public static int[] ZamanCevirici(int girdi) {
		int[] zaman = new int[3];
		zaman[0] = girdi/3600;
		zaman[1] = girdi/60 - zaman[0]*60;
		zaman[2] = girdi - zaman[0]*3600 - zaman[1]*60;
		return zaman;
	}
}