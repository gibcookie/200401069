public class AvatarTest {
	public static void main(String[] args) {
		Avatar avatarmatik = new Avatar();
		Avatar[] oyuncu1 = new Avatar[5];
		Avatar[] oyuncu2 = new Avatar[5];
		int oyuncu1p = 0, oyuncu2p = 0;
		
		for(int i = 0;i<5;i++) {
			oyuncu1[i] = avatarmatik.olusturucu();
			oyuncu2[i] = avatarmatik.olusturucu();
			System.out.println("Birinci oyuncunun Gucu: " + oyuncu1[i].GetGuc() + " Turu: " + oyuncu1[i].GetTur());
			System.out.println("Ikinci oyuncunun Gucu: " + oyuncu2[i].GetGuc() + " Turu: " + oyuncu2[i].GetTur());
			if (oyuncu1[i].GetTur() > oyuncu2[i].GetTur()) {
				System.out.println("Birinci oyuncunun savascisi eli kazandi ve 10 puani kapti!");
				oyuncu1p += 10;
				continue;
			}
			else if (oyuncu2[i].GetTur() > oyuncu1[i].GetTur()) {
				System.out.println("Ikinci oyuncunun savascisi eli kazandi ve 10 puani kapti!");
				oyuncu2p += 10;
				continue;
			}
			else {
				if (oyuncu1[i].GetGuc() > oyuncu2[i].GetGuc()) {
					System.out.println("Birinci oyuncunun avatari daha gucluydu ve " + (oyuncu1[i].GetGuc() - oyuncu2[i].GetGuc()) + " puani kapti!");
					oyuncu1p += oyuncu1[i].GetGuc() - oyuncu2[i].GetGuc();
					continue;
				}
				else if (oyuncu2[i].GetGuc() > oyuncu1[i].GetGuc()) {
					System.out.println("Ikinci oyuncunun avatari daha gucluydu ve " + (oyuncu2[i].GetGuc() - oyuncu1[i].GetGuc()) + " puani kapti!");
					oyuncu2p += oyuncu2[i].GetGuc() - oyuncu1[i].GetGuc();
					continue;
				}
				else {
					System.out.println("Avatarlar birbirini yenemedi.");
				}
				
			}
		}
		System.out.println("Birinci oyuncunun puani: " + oyuncu1p);
		System.out.println("Ikinci oyuncunun puani: " + oyuncu2p);
		if (oyuncu1p > oyuncu2p) {
			System.out.println("Birinci oyuncu kazandi.");
		}
		else if (oyuncu2p > oyuncu1p) {
			System.out.println("Ikinci oyuncu kazandi.");
		}
		else {
			System.out.println("Oyun berabere bitti.");
		}
	}
}