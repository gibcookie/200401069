public class AkademikPersonel {
	public String ad;
	public String soyad;
	public Zaman dogumGunu;
	public int TCNo;
	public int maas;
	public String sinifAdi = "Akademik Personel";
	
	
	public int Kazanc() {return maas;}
	public void Yazdir() {
		System.out.println(sinifAdi + "Maasi: " + maas);
	}
}
