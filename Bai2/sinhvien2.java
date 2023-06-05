package Bai2;

import java.util.Scanner;

public class sinhvien2 {
   public int masv ;
   public String name;
   public double diemLt;
   public double diemTh;
public sinhvien2() {
	
}
public sinhvien2(int masv, String name, double diemLt, double diemTh) {
	super();
	this.masv = masv;
	this.name = name;
	this.diemLt = diemLt;
	this.diemTh = diemTh;
}
public  double diemTb() {
	double diemTb;
	return diemTb = (diemLt+diemTh)/2;
}
public void nhapSv() {
	System.out.println("Nhap Id");
	Scanner input = new Scanner(System.in);
	masv = input.nextInt();
	System.out.println("Nhap name");
	name = input.nextLine();
	System.out.println("Nhap diem Lt");
	diemLt = input.nextDouble();
	System.out.println("Nhap diem Th");
	diemTh = input.nextDouble();
}
public int getMasv() {
	return masv;
}
public void setMasv(int masv) {
	this.masv = masv;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getDiemLt() {
	return diemLt;
}
public void setDiemLt(double diemLt) {
	this.diemLt = diemLt;
}
public double getDiemTh() {
	return diemTh;
}
public void setDiemTh(double diemTh) {
	this.diemTh = diemTh;
}

}
