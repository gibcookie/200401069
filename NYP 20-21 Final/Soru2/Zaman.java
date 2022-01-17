import java.util.*;
public class Zaman {
	private int gun; // 1 - 31
	private int ay; // 1 - 12
	private int yil; // 1000 - 9999
	
	public Zaman() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Gun degeri giriniz: ");
		int gun = inp.nextInt();
		System.out.println("Ay degeri giriniz: ");
		int ay = inp.nextInt();
		System.out.println("Yil degeri giriniz: ");
		int yil = inp.nextInt();
		if (gun > 0 && gun < 32 && ay > 0 && ay < 13 && yil > 999 && yil < 10000) {
			this.gun = gun;
			this.ay = ay;
			this.yil = yil;
		}
		else {throw new IllegalArgumentException("Tarih hatali.");}
	}
	
	public int GetGun() {return gun;}
	public int GetAy()  {return ay;}
	public int GetYil() {return yil;}
	
	public void SetGun(int gun) {this.gun = gun;}
	public void SetAy(int ay)   {this.ay = ay;}
	public void SetYil(int yil) {this.yil = yil;}
}
