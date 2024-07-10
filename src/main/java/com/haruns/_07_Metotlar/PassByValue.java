package com.haruns._07_Metotlar;
// Java'da metodlar Pass-By-Value seklinde calisir.
// Primitive data type'lar parametre olarak kullanilirsa beklenildigi gibi gonderilen degiskenin degeri metod icindeki degisimden etkilenmez
// Complex(Reference) data type'lar parametre olarak kullanilirsa gonderilen nesnenin adresi metoda aktarilir. O yuzden metod icinde yapilan degisim direkt olarak o nesne uzerinde de gerceklestirilir.
public class PassByValue {
	public static void main(String[] args) {
	int sayi=10;
	artir(sayi);
		System.out.println("sayi : "+sayi);
		Adet adetRef=new Adet();
		artirAdet(adetRef);
		System.out.println("adetRef i : "+adetRef.i);
	}
	public static void artir (int i){
		i++;
		System.out.println("i = "+i);
	}
	public static void artirAdet(Adet adet){
		adet.i++;
		System.out.println("adetin icindeki i : "+adet.i);
	}
}
class Adet{
	int i=5;
}