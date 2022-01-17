public class Ortalama {
	public static void main(String[] args) {
		int satir = 0;   // Degisken
		int sutun = 0;   // Degisken
		int[][] A = new int[satir][sutun];
		int[] B = new int[satir];
	}
	
	
	public static int[] ortala(int[][] matris, int[] liste) {
		int top = 0, eleman = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				top += matris[i][j];
				eleman++;
			}
			liste[i] = top/eleman;
		}
	return liste;
	}
}