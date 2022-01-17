public class Zaman {
	private int gun; // 1 - 30
	private int ay; // 1 - 12
	private int yil; // 1000 - 9999
	
	public Zaman(int gun, int ay, int yil) {
		if (gun > 0 && gun < 30 && ay > 1 && ay < 12 && yil > 999 && yil < 10000) {
			this.gun = gun;
			this.ay = ay;
			this.yil = yil;
		}
		else {throw new IllegalArgumentException("Tarih hatali.");}
	}
	
	public int GetGun() {return gun;}
	public int GetAy()  {return ay;}
	public int GetYil() {return yil;}
}
