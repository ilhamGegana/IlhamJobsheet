import java.util.Scanner;
public class PraktikumPerulangan{
	public static void main(String[] args) {
		int m;
		String p;
		String []hari = {"senin","selasa","rabu","kamis","jum'at","sabtu","minggu"};
		int[] nim = {2,2,3,1,7,5,0,0,01};
		Scanner sc = new Scanner (System.in);

		System.out.print("Masukkan NIM : ");
		p = sc.next();
		System.out.println("=================");
		m=nim[8]+10;
		System.out.println("n : "+m);

		int n = 0;
        for (int i = 0; i < m; i++) {
            if (i%hari.length == 0) {
                n = 0;
            }
            System.out.print(hari[n]);
            System.out.print(" ");
            n++;
		}
	}
}