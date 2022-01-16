
public class CalisanTest {
	public static void main(String[] args) {
		System.out.printf("Orneklendirme oncesi calisan sayisi: %d\n", Calisan.GetSayi());
		Calisan c1 = new Calisan("Sukru Ali", "Ogel");
		Calisan c2 = new Calisan("Mehmet Naci", "Perkel");
		
		System.out.printf("Sinif uzerinden elde edilen calisan sayisi: %d \n", Calisan.GetSayi());
		System.out.printf("c1 ile elde edilen calisan sayisi: %d \n", c1.GetSayi());
		System.out.printf("c2 ile elde edilen calisan sayisi: %d \n", c2.GetSayi());
		
		System.out.printf("Simdi 1. Calisan \"%s %s\" ve 2. Calisan \"%s %s\"i silelim\n", c1.GetAd(), c1.GetSoyad(), c2.GetAd(), c2.GetSoyad());
		c1 = null;
		c2 = null;
		
		// System.out.printf("1. Calisan \"%s %s\"\n2. Calisan \"%s %s\"\n", c1.GetAd(), c1.GetSoyad(), c2.GetAd(), c2.GetSoyad()); 
		// Bu degiskenler artik olmayan bir nesneye isaret ediyor. Ulasilmaya calisildiginda hata verir. (Null pointer access)
		
		// Calisan c1 = new Calisan("Behcet", "Turkmen");
		// Calisan c2 = new Calisan("Emin", "Cobanoglu");
		// "c1" ve "c2" pointerlari "Calisan" sinifi icin olusturuldugundan dolayi Garbage Collector tarafindan serbest birakilmadikca baska tur veri icin kullanilamazlar.
		
		c1 = new Calisan("Behcet", "Turkmen");
		c2 = new Calisan("Emin", "Cobanoglu");
		// Ancak ayni tur veri olusturmada kullanilabilirler.
		System.out.printf("Statik deger degistirilmedigi icin hatali olan mevcut calisan sayisi: %d\n", Calisan.GetSayi());
		
	}
}
