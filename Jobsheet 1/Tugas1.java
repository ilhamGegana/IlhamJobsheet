import java.util.Scanner;
public class Tugas1{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String []costumer = {"Ani","Budi","Bina","Cita"};
		int []beratLaundry = {4,15,6,11};
		double []tarifAr = new double [beratLaundry.length];
		double pendapatan=0, tarif, tarifDiskon;
		int n;

		for (n=0;n<beratLaundry.length;n++){
			if (beratLaundry[n]>10){
				tarifAr[n] = beratLaundry[n]*4500;
				tarifDiskon = tarifAr[n] * 0.05;
				tarifAr[n] -= tarifDiskon;
			} else {
				tarifAr[n] = beratLaundry[n]*4500;
			}
			System.out.println("Tarif costumer "+costumer[n]+" adalah Rp "+tarifAr[n]);
			pendapatan += tarifAr[n];
			continue;
		}
		System.out.println("========================================");
		System.out.println("Pendapatan hari ini adalah = Rp"+pendapatan);
	}
}