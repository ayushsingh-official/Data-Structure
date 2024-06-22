package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Automobile {

	int id;
	int wheels;
	int capacity;

	public void vehicle(String type, int wheels) {

		System.out.println("this is a car");

	}

	public void vehicle(String type, int wheels, int capacity) {

		System.out.println("this is a car");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static void main(String[] args) {

		Automobile auto = new Automobile();

		Automobile auto2 = new Automobile();

		auto2 = auto;

		ArrayList<Automobile> list = new ArrayList<Automobile>();

		HashMap<Integer, Automobile> map = new HashMap<Integer, Automobile>();

		for (Automobile vehicle : list) {
			map.put(vehicle.getId(), vehicle);
		}

	}

}
