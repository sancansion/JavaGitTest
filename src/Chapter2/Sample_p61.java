package Chapter2;

public class Sample_p61 {
	public static void main(String[] args) {

		Super obj1 = new Sub();
		Sub sub1 = (Sub) obj1;

		Foo obj2 = new Foo();
		// Sub sub2 = (Sub)obj2;
		//↑継承・実装関係がないためコンパイルエラー

		Super obj3 = new Super();
		Sub sub3 = (Sub) obj3;
		//↑実行時エラー
		//Test

		int a = 0;
	}

}

class Super {
}

class Sub extends Super {
}

class Foo {
}
