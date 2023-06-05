package Bai2;

import java.util.ArrayList;

import Bai2.SinhVien;

public class Main {
	 public static void main(String[] args) {
		int maid = 0;
		String nameString = "";
		double diemlt = 0;
		double diemth = 0;
	    SinhVien sv1 = new SinhVien(1, "Thi", 3.5, 5.3);
	    SinhVien sv2 = new SinhVien(2,"Vương",5.8,7.5);
	    Bai2.SinhVien.nhapSv(maid, nameString, diemlt, diemth);
	    SinhVien sv3 = new SinhVien(maid, nameString, diemlt, diemth);
	    Bai2.SinhVien.diemTb();
	    sv3.toString();
	    }


}
