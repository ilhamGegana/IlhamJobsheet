import java.util.Scanner;
public class Tugas2{

	static int s, v, t;

	static int kecepatan(){
		return v = s/t;
	}
	static int jarak(){
		return s = v*t;
	}
	static int waktu(){
		return t = s/v;
	}
		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int pilih;
		String pilih2;

		do{
			System.out.println("Menu Hitung : ");
			System.out.println("1. Kecepatan");
			System.out.println("2. Jarak");
			System.out.println("3. Waktu");
			pilih = sc.nextInt();

			if (pilih == 1){
				System.out.println("Menghitung kecepatan");
				System.out.println("=======================================");
				System.out.print("Masukkan jarak : ");
				s = sc.nextInt();
				System.out.print("Masukkan waktu : ");
				t = sc.nextInt();
				kecepatan();
				System.out.println("Kecepatan adalah " +v);
			} else if (pilih == 2) {
				System.out.println("Menghitung jarak");
				System.out.println("=======================================");
				System.out.print("Masukkan kecepatan : ");
				v = sc.nextInt();
				System.out.print("Masukkan waktu : ");
				t = sc.nextInt();
				jarak();
				System.out.println("Jarak adalah " +s);
			}else if (pilih == 3){
				System.out.println("Menghitung waktu");
				System.out.println("=======================================");
				System.out.print("Masukkan jarak : ");
				s = sc.nextInt();
				System.out.print("Masukkan kecepatan : ");
				v = sc.nextInt();
				waktu();
				System.out.println("Waktu adalah " +t);
			} else {
				System.out.println("Nomor yang anda masukkan salah!!");
			}
			System.out.println("=======================================");
			System.out.print("Apakah ingin menghitung lagi? (y/t) : ");
			pilih2 = sc.next();
		} while (pilih2.equalsIgnoreCase("y"));
	}
}
