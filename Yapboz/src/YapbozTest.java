import java.util.Scanner;
public class YapbozTest {
	public static void main(String[] args) {
		Scanner boyutkap = new Scanner(System.in);
		System.out.print("mXn formatindaki yapboz icin m degerini giriniz: ");
		int m = boyutkap.nextInt();
		System.out.print(m + "Xn formatindaki yapboz icin n degerini giriniz: ");
		int n = boyutkap.nextInt();
		boyutkap.close();
		YapbozParcasi[][] yapbozum = YapbozOlusturucu(m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("0, " + yapbozum[i][j].GetustKisim() + ", 0   ");
			}
			System.out.println("");
			for (int j = 0; j < n; j++) {
				System.out.print(yapbozum[i][j].GetsolKisim() + ", 0, " + yapbozum[i][j].GetsagKisim() + "   ");
			}
			System.out.println("");
			for (int j = 0; j < n; j++) {
				System.out.print("0, " + yapbozum[i][j].GetaltKisim() + ", 0   ");
			}
			System.out.println("\n");
		}
		
	}
	
	public static YapbozParcasi[][] YapbozOlusturucu(int mm, int nn) {
		YapbozParcasi yaparbozar = new YapbozParcasi();
		YapbozParcasi[][] yapboz1 = new YapbozParcasi[mm][nn];
		yapboz1[0][0] = yaparbozar.SolUstKose();
		// Iki boyutlu yapboz tanimlandi ve sol ust kosesi olusturuldu.
		
		for (int j = 1; j < nn; j++) {
			yapboz1[0][j] = yaparbozar.UstKenar(yapboz1[0][j-1]);
		} // Ust kenar olusturuldu.
		for (int i = 1; i < mm; i++) {
			yapboz1[i][0] = yaparbozar.SolKenar(yapboz1[i-1][0]);
		} // Sol kenar olusturuldu.
		for (int i = 1; i < mm; i++) {
			for (int j = 1; j < nn; j++) {
				yapboz1[i][j] = yaparbozar.Diger(yapboz1[i][j-1], yapboz1[i-1][j]);
			}
		} // Sag ve alt kenarlari puruzlu yapboz olusturuldu.
		for (int i = 0; i < mm; i++) {yapboz1[i][nn-1].SetsagKisim(0);}
		for (int j = 0; j < nn; j++) {yapboz1[mm-1][j].SetaltKisim(0);}
		//Sag ve alt kenar puruzleri temizlendi.
		
		return yapboz1;
	}
}