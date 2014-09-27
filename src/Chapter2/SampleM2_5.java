package Chapter2;

class X{
	X(){
		System.out.println("A");
	}
	X(String srt){
		System.out.println("B");
	}
}

class Y extends X{
	Y(String str){
		//super();
		super(str);
		System.out.println("C");
	}
}

public class SampleM2_5 {

	public static void main(String[] args) {
		X obj = new Y("Hello");

	}

}
