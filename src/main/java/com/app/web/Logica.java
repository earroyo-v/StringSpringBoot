package com.app.web;

public class Logica {
	public String Ejercicio1(String val) {
		int x = val.length();		
		return val + " tiene " + String.valueOf(x) + " caracteres";
	}
	public String Ejercicio2(String val) {
		return val.toUpperCase();
	}
	public String Ejercicio3(String val) {
		return val.toLowerCase();
	}
}
