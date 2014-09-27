package Chapter2;

public interface SampleM_13 {

	//int f1;
	//初期化されていない

	final int f2 = 1;

	void m1();

	//final void m2();
	//インターフェース・メソッド不正な修飾子; public および abstract のみが許可されています


	abstract void m3();

	//static int m4();
	//インターフェース・メソッド不正な修飾子; public および abstract のみが許可されています

	//protected void m5();
	//インターフェース・メソッド不正な修飾子; public および abstract のみが許可されています

	String m6() throws Exception;

}
