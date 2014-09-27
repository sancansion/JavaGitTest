package Chapter2;

class SuperClass{
	static String x = "Super X";
	//staticメンバ変数
	String y = "Super Y";
	//メンバ変数

	static void methodA(){
		System.out.println("Super methodA()");
	}
	//staticメソッドの宣言
	void methodB(){
		System.out.println("Super methodB()");
	}
	//通常のメソッドの宣言

}

class SubClass extends SuperClass{
	static String x = "Sub X";
	//static変数の宣言
	String y = "Sub Y";

	static void methodA(){
		System.out.println("Sub methodA");
	}
	//staticメソッドの宣言

	void methodB(){
		System.out.println("Sub methodB");
	}
	//通常のメソッドの宣言

	//★★static、非static変数もサブクラスで再定義可能
	//★★static、非static変数もサブクラスでオーバーライド可能
}

public class Sample2_12 {
	public static void main(String[] args){

		SuperClass obj = new SubClass();

		System.out.println(obj.x);
		//static変数はSuperクラスの変数が呼ばれる
		System.out.println(obj.y);
		//面罵変数はSuperクラスの変数が呼ばれる


		obj.methodA();
		//staticメソッドの場合はSuperクラスのメソッドが呼ばれる
		obj.methodB();
		//通常のメソッドの場合はSubクラスのメソッドが呼ばれる

	}
}
