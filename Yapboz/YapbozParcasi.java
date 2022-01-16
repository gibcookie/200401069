import java.util.Random;
public class YapbozParcasi {
	Random random = new Random();
	int solKisim, sagKisim, ustKisim, altKisim;
	// Girinti ve cikintilarin seklini tutar.
	
	// Cikintilar = {1, 3, 5, 7}
	// Girintiler = {2, 4, 6, 8}
	//Denk gelen sutunlar, birbirine uyar.
	
	public YapbozParcasi(int ust, int alt, int sol, int sag) {
		solKisim = sol;
		sagKisim = sag;
		ustKisim = ust;
		altKisim = alt;
	}
	public YapbozParcasi() {}
	
	public void SetustKisim(int ust) {ustKisim = ust;}
	public void SetaltKisim(int alt) {altKisim = alt;}
	public void SetsolKisim(int sol) {solKisim = sol;}
	public void SetsagKisim(int sag) {sagKisim = sag;}
	
	public int GetustKisim() {return ustKisim;}
	public int GetaltKisim() {return altKisim;}
	public int GetsolKisim() {return solKisim;}
	public int GetsagKisim() {return sagKisim;}
	
	public YapbozParcasi SolUstKose() {
		YapbozParcasi solustkose = new YapbozParcasi();
		solustkose.SetsagKisim(random.nextInt(8) + 1);
		solustkose.SetaltKisim(random.nextInt(8) + 1);
		return solustkose;
	} // Baslatici vazifesi goren parca olusturulur.
	public YapbozParcasi UstKenar(YapbozParcasi soldaki) {
		YapbozParcasi ustkenar = new YapbozParcasi();
		if (soldaki.GetsagKisim() % 2 == 0) {ustkenar.SetsolKisim(soldaki.GetsagKisim() - 1);}
		else {ustkenar.SetsolKisim(soldaki.GetsagKisim() + 1);}
		ustkenar.SetsagKisim(random.nextInt(8) + 1);
		ustkenar.SetaltKisim(random.nextInt(8) + 1);
		return ustkenar;
	} // Tavan parcalari olusturulur.
	public YapbozParcasi SolKenar(YapbozParcasi ustteki) {
		YapbozParcasi solkenar = new YapbozParcasi();
		if (ustteki.GetaltKisim() % 2 == 0) {solkenar.SetustKisim(ustteki.GetaltKisim() - 1);}
		else {solkenar.SetustKisim(ustteki.GetaltKisim() + 1);}
		solkenar.SetsagKisim(random.nextInt(8) + 1);
		solkenar.SetaltKisim(random.nextInt(8) + 1);
		return solkenar;
	} // Kenar parcalari olusturulur.
	public YapbozParcasi Diger(YapbozParcasi soldaki, YapbozParcasi ustteki) {
		YapbozParcasi diger = new YapbozParcasi();
		if (soldaki.GetsagKisim() % 2 == 0) {diger.SetsolKisim(soldaki.GetsagKisim() - 1);}
		else {diger.SetsolKisim(soldaki.GetsagKisim() + 1);}
		if (ustteki.GetaltKisim() % 2 == 0) {diger.SetustKisim(ustteki.GetaltKisim() - 1);}
		else {diger.SetustKisim(ustteki.GetaltKisim() + 1);}
		diger.SetsagKisim(random.nextInt(8) + 1);
		diger.SetaltKisim(random.nextInt(8) + 1);
		return diger;
	} // Diger parcalari olusturur.
}