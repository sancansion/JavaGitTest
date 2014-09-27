package other;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		Car car1 = new Truck();
		Car car2 = new Taxi();

		List<Car> carList = new ArrayList<Car>();
		carList.add(car1);
		carList.add(car2);

		for (Car car : carList) {
			car.echo();
		}

	}

}

class Car {
	void echo() {
	}
}

class Truck extends Car {
	void echo() {
		System.out.println("これはトラックです");
	}
}

class Taxi extends Car {
	void echo() {
		System.out.println("これはタクシーです");

	}
}
