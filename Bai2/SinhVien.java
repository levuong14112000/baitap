package Bai2;

import java.util.Scanner;

public class SinhVien {
  public static int masv;
  public static String nameString;
  public static double diemlt; 
  public static double diemth;
  public SinhVien() {
		this.masv = 0;
		this.nameString = "Vương";
		this.diemlt = 7.8;
		this.diemth = 8.6;
  }
  public SinhVien(int masv , String nameString ,
		  double diemlt , double diemth) {
	  this.masv = masv;
	  this.nameString=nameString;
	  this.diemlt=diemlt;
	  this.diemth=diemth;
  }
  public static void diemTb() {
	  double diemTb = (diemlt + diemth) /2;
	  System.out.println("Diem TB :" + diemTb);
  }
  public static void nhapSv(int masv , String nameString ,
		  double diemlt , double diemth) {
	  Scanner inputScanner = new Scanner(System.in);
	  System.out.println("Ma Id :");
	  masv = inputScanner.nextInt();
	  nameString = inputScanner.nextLine();
	  System.out.println("Ten :" );
	  nameString = inputScanner.nextLine();
	  System.out.println("diemLt :");
	  diemlt = inputScanner.nextDouble();
	  System.out.println("diemTh :");
	  diemth = inputScanner.nextDouble();
  }
  public String toString() {
      return "Mã SV: " + masv + ", Tên SV: " + nameString + ", Điểm LT: " + diemlt + ", Điểm TH: " + diemth;
  }
public int getMasv() {
	return masv;
}
public void setMasv(int masv) {
	this.masv = masv;
}
public String getNameString() {
	return nameString;
}
public void setNameString(String nameString) {
	this.nameString = nameString;
}
public double getDiemlt() {
	return diemlt;
}
public void setDiemlt(double diemlt) {
	this.diemlt = diemlt;
}
public double getDiemth() {
	return diemth;
}
public void setDiemth(double diemth) {
	this.diemth = diemth;
}
}
