package com.javatechie.GitDemo1;

public class App {
	public void addData(String data) {
		System.out.println(data + "= data");
		if (data.equals(Constant.DATA_TYPE)) {
			System.out.println("welcom");
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
