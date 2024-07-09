package com.haruns._06_Diziler;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArraysSinifi {
	public static void main(String[] args) {
		int[]sayilar={6,8,5,3,66};
		String[]isimler={"Harun","Ali","Ela","Ata","Ece"};
		// 1.Arrays.toString --> Dizideki elemanlari [] arasinda, aralarina ',' ekleyerek yazdirir.
		System.out.println("Orijinal dizi : "+ Arrays.toString(sayilar));
		System.out.println("Orijinal dizi : "+ Arrays.toString(isimler));
		// 2.Arrays.sort --> Diziye dogal siralama uygular.
		Arrays.sort(sayilar);
		Arrays.sort(isimler);
		System.out.println("Arrays.Sort isleminden sonra : "+ Arrays.toString(sayilar));
		System.out.println("Arrays.Sort isleminden sonra : "+ Arrays.toString(isimler));
		// 3.Arrays.binarySearch --> Aranan eleman listede varsa index numarasini, yoksa negatif bir deger doner.
		int index=Arrays.binarySearch(sayilar,5);
		System.out.println(index>0?index+". indexte BULUNDU":"BULUNAMADI");
		// 4.Arrays.equals --> Karsilastirilan diziler icindeki elemanlar ve siralari ayni ise true doner, degilse false doner.
		int[]dizi={0,1,2};
		int[]dizi2={0,1,2};
		boolean equals = Arrays.equals(dizi, dizi2);
		System.out.println(equals);
		// 5.Arrays.fill --> Dizi'nin icerisini verilen deger ile doldurur.
		int[]dizi3=new int[10];
		System.out.println("Dizi 3 ilk hali : "+Arrays.toString(dizi3));
		Arrays.fill(dizi3,1);
		System.out.println("Dizi 3 fill isleminden sonraki hali : "+Arrays.toString(dizi3));
		Arrays.fill(dizi3,4,7,3);
		System.out.println("Dizi 3 fill isleminden sonraki hali : "+Arrays.toString(dizi3));
		// 6.Arrays.copyOf --> Yeni bir diziye var olan bir dizinin kopyasini aktarmak icin kullanilir.
		int[]dizi4={5,10,15,20,25};
		int[]dizi5=Arrays.copyOf(dizi4,10);
		System.out.println(Arrays.toString(dizi5));
		// 7.Arrays.copyOfRange --> Bir diziden belirli bir araligin kopyasini almak icin kullanilabilir.
		int []dizi6=Arrays.copyOfRange(dizi4,0,3);
		System.out.println(Arrays.toString(dizi6));
		// 8.Arrays.stream
		//sum: Toplama
		int sum = Arrays.stream(dizi4).sum();
		System.out.println("Toplam : "+sum);
		//average: Ortalama
		OptionalDouble average = Arrays.stream(dizi4).average();
		System.out.println("Ortalama : "+average.getAsDouble());
		//count: Eleman sayisi
		long count = Arrays.stream(dizi4).count();
		System.out.println("Eleman sayisi : "+count);
		//MAX-MIN
		OptionalInt max = Arrays.stream(dizi4).max();
		System.out.println("En buyuk : "+max.getAsInt());
		OptionalInt min = Arrays.stream(dizi4).min();
		System.out.println("En kucuk : "+min.getAsInt());
		// 9 : Arrays.asList --> Bir diziyi list'e cevirme.
		int[]dizi7={5,15,5326,345};
		List<int[]> list = Arrays.asList(dizi7);
		System.out.println(list);
		
		Integer[] dizi8={5,15,5326,345};
		List<Integer> list1 = Arrays.asList(dizi8);
		System.out.println(list1);
		
		// 10 :
		int[][]ikiBoyutluDizi={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		System.out.println(Arrays.toString(ikiBoyutluDizi));
		System.out.println("--------------------------------");
		System.out.println(Arrays.deepToString(ikiBoyutluDizi));
		
	}
}