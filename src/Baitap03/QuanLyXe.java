package Baitap03;

import baitap03.XeBus;
import baitap03.XeOto;

public class QuanLyXe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 XeOto car = new XeOto("vinfast", 2024, 600);
	        XeBus bus = new XeBus("transerco", 2024, 500, 30);

	        System.out.println(car);
	        System.out.println(bus);
	}

}