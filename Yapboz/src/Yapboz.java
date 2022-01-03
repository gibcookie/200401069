import java.util.Random;
import java.util.Scanner;

public class Yapboz {
	YapbozParcasi[][] Yapboz;  //Yapboz bir dizi ya da diziler dizisidir.
	int satir;  //m
	int sutun;  //n
	
	public Yapboz() {
		YapbozParcasi yaparbozar = new YapbozParcasi();
		Scanner boyutkap = new Scanner(System.in);
		System.out.print("mXn formatindaki yapboz icin m degerini giriniz: ");
		satir = boyutkap.nextInt();
		System.out.print(satir + "Xn formatindaki yapboz icin n degerini giriniz: ");
		sutun = boyutkap.nextInt();
		boyutkap.close();
		Yapboz = new YapbozParcasi[satir][sutun];  // (Simdilik) Iki boyutlu yapboz tanimlandi.
		
		Yapboz[0][0] = yaparbozar.SolUstKose();  // Yapbozun baslatici kosesi olusturuldu.
		for (int j = 1; j < sutun; j++) {Yapboz[0][j] = yaparbozar.UstKenar(Yapboz[0][j-1]);}
		for (int i = 1; i < satir; i++) {Yapboz[i][0] = yaparbozar.SolKenar(Yapboz[i-1][0]);}
		for (int i = 1; i < satir; i++) {
			for (int j = 1; j < sutun; j++) {Yapboz[i][j] = yaparbozar.Diger(Yapboz[i][j-1], Yapboz[i-1][j]);}
		} // Sag ve alt kenarlari puruzlu.
		for (int i = 0; i < satir; i++) {Yapboz[i][sutun-1].SetsagKisim(0);}
		for (int j = 0; j < sutun; j++) {Yapboz[satir-1][j].SetaltKisim(0);}
		// Puruzler temizlendi.
	}
	
	public void YapbozBozucu() {
		Random random = new Random();
		System.out.println("Yapboz karistirildi.");
		
		for (int sayac = 0; sayac < satir * sutun; sayac++) {
			int sira1 = random.nextInt(satir), sira2 = random.nextInt(satir);
			int sutun1 = random.nextInt(sutun), sutun2 = random.nextInt(sutun);
			YapbozParcasi gecici = Yapboz[sira1][sutun1];
			Yapboz[sira1][sutun1] = Yapboz[sira2][sutun2];
			Yapboz[sira2][sutun2] = gecici;
		}
	}
	public void YapbozYazdirici() {
		System.out.println(satir + "X" + sutun + " formatindaki yapboz:");
		
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {System.out.print("0, " + Yapboz[i][j].GetustKisim() + ", 0   ");}
			System.out.println("");
			for (int j = 0; j < sutun; j++) {System.out.print(Yapboz[i][j].GetsolKisim() + ", 0, " + Yapboz[i][j].GetsagKisim() + "   ");}
			System.out.println("");
			for (int j = 0; j < sutun; j++) {System.out.print("0, " + Yapboz[i][j].GetaltKisim() + ", 0   ");}
			System.out.println("\n");
		}
	}
}


