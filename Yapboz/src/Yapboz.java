import java.util.Scanner;

public class Yapboz {
	YapbozParcasi[][] Yapboz; //Yapboz bir dizi ya da diziler dizisidir.
	
	public Yapboz() {
		YapbozParcasi yaparbozar = new YapbozParcasi();
		Scanner boyutkap = new Scanner(System.in);
		System.out.print("mXn formatindaki yapboz icin m degerini giriniz: ");
		int m = boyutkap.nextInt();
		System.out.print(m + "Xn formatindaki yapboz icin n degerini giriniz: ");
		int n = boyutkap.nextInt();
		boyutkap.close();
		
		Yapboz[0][0] = yaparbozar.SolUstKose();  // Iki boyutlu yapboz tanimlandi ve sol ust kosesi olusturuldu.
		for (int j = 1; j < n; j++) {Yapboz[0][j] = yaparbozar.UstKenar(Yapboz[0][j-1]);}  // Ust kenar olusturuldu.
		for (int i = 1; i < m; i++) {Yapboz[i][0] = yaparbozar.SolKenar(Yapboz[i-1][0]);}  // Sol kenar olusturuldu.
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {Yapboz[i][j] = yaparbozar.Diger(Yapboz[i][j-1], Yapboz[i-1][j]);}
		} // Sag ve alt kenarlari puruzlu yapboz olusturuldu.
		for (int i = 0; i < m; i++) {Yapboz[i][n-1].SetsagKisim(0);}
		for (int j = 0; j < n; j++) {Yapboz[m-1][j].SetaltKisim(0);}
		//Sag ve alt kenar puruzleri temizlendi.
	}
}
