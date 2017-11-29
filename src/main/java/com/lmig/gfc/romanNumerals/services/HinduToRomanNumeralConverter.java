package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int num) {
		String romanNumeral = "";
		
		while (num >= 1000) {
			romanNumeral += "M";
			num = num - 1000;
		}
		
		if (num >= 900) {
			romanNumeral += "CM";
			num = num - 900;
		}
		
		if (num >= 500) {
			romanNumeral += "D";
			num = num - 500;
		}
		
		if (num >= 400) {
			romanNumeral += "CD";
			num = num - 400;
		}
		
		while (num >= 100) {
			romanNumeral += "C";
			num = num - 100;
		}
		
		if (num >= 90) {
			romanNumeral += "XC";
			num -= 90;
		}
		
		if (num >= 50) {
			romanNumeral += "L";
			num -= 50;
		}
		
		if (num >= 40) {
			romanNumeral += "XL";
			num = num - 40;
		}
		
		while (num >= 10) {
			romanNumeral += "X";
			num = num - 10;
		}

		if (num == 9) {
			romanNumeral += "IX";
			num = 0;
		}

		if (num >= 5) {
			romanNumeral += "V";
			num = num - 5;
			// num -= 5;
		}

		if (num == 4) {
			romanNumeral += "IV";
			num = 0;
		}

		for (int i = 0; i < num; i += 1) {
			romanNumeral = romanNumeral.concat("I");
			// romanNumeral = romanNumeral + "I";
		}

		return romanNumeral;
	}

}
