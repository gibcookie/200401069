public class AkademiTest {
	public static void main(String[] args) {
			AkademikPersonel personel1 = new AkademikPersonel("a", "x", new Zaman(), 1234);
			Docent docent1 = new Docent("b", "y", new Zaman(), 1235);
			Profesor profesor1 = new Profesor("c", "z", new Zaman(), 1236);
			personel1.Yazdir();
			personel1.Kazanc();
			docent1.Yazdir();
			docent1.Kazanc();
			profesor1.Yazdir();
			profesor1.Kazanc();
	}
}
