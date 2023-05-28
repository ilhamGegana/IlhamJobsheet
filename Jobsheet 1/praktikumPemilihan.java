import java.util.Scanner;
public class praktikumPemilihan{
	public static void main(String[] args) {
		double nilaiTugas, nilaiUTS, nilaiUAS,nilaiAkhir;
		String []huruf = {"A","B+","B","C+","C","D","E"};

		Scanner sc = new Scanner(System.in);

		System.out.println("Program Menghitung Nilai Akhir");
		System.out.println("=======================");
		System.out.print("Masukkan Nilai Tugas = ");
		nilaiTugas = sc.nextDouble();
		nilaiTugas = nilaiTugas * (0.2);
		System.out.print("Masukkan Nilai UTS = ");
		nilaiUTS = sc.nextDouble();
		nilaiUTS = nilaiUTS * (0.35);
		System.out.print("Masukkan Nilai UAS = ");
		nilaiUAS = sc.nextDouble();
		nilaiUAS = nilaiUAS * (0.45);
		System.out.println("=======================");
		System.out.println("=======================");

		nilaiAkhir = nilaiTugas+ nilaiUTS+ nilaiUAS;

		if(nilaiAkhir > 80 && nilaiAkhir <=100){
			System.out.println("nilai akhir : " + nilaiAkhir);
			System.out.println("nilai Huruf : " + huruf[0]);
			System.out.println("=======================");
			System.out.println("SELAMAT LULUS");

		} else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
			System.out.println("nilai akhir : " + nilaiAkhir);
			System.out.println("nilai Huruf : " + huruf[1]);
			System.out.println("=======================");
			System.out.println("SELAMAT LULUS");

		} else if (nilaiAkhir > 73 && nilaiAkhir <= 73){
			System.out.println("nilai akhir : " + nilaiAkhir);
			System.out.println("nilai Huruf : " + huruf[2]);
			System.out.println("=======================");
			System.out.println("SELAMAT LULUS");

		} else if (nilaiAkhir > 65 && nilaiAkhir <= 65){
			System.out.println("nilai akhir : " + nilaiAkhir);
			System.out.println("nilai Huruf : " + huruf[3]);
			System.out.println("=======================");
			System.out.println("SELAMAT LULUS");

		} else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
			System.out.println("nilai akhir : " + nilaiAkhir);
			System.out.println("nilai Huruf : " + huruf[4]);
			System.out.println("=======================");
			System.out.println("SELAMAT LULUS");

		} else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
			System.out.println("nilai akhir : " + nilaiAkhir);
			System.out.println("nilai Huruf : " + huruf[5]);
			System.out.println("=======================");
			System.out.println("TIDAK LULUS");
		}else {
			System.out.println("nilai akhir : " + nilaiAkhir);
			System.out.println("nilai Huruf : " + huruf[6]);
			System.out.println("=======================");
			System.out.println("TIDAK LULUS");

		}
	}
}