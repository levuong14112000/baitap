package bai3;

import java.util.Scanner;

public class main {

   public static void main(String[] args) {
	bai3 bai2 = new bai3();
	bai3 bai3 = new bai3(3.5,5.3,6.4);
	System.out.println("chuvi la : "+bai3.ChuVi());
	System.out.println("dien tich la" + bai3.DienTich());
	bai3.kiemTra();
	System.out.println(bai3);
	// tam giac thuong
    bai3 Img1 = new bai3(3,3,5);
    // tam giac deu
    bai3 Img2 = new bai3(3,3,3);
    // tam giac can
    bai3 Img3 = new bai3(4,4,4);
    bai3 Img4 = new bai3();
    bai3 Img = new bai3();
//    System.out.println("Day la tam giac vuong");
//	 else if(ma==mb && mb==mc)
//	 System.out.println("Day la tam giac deu");
//	 else if(ma==mb || ma==mc || mb==mc)
//	 System.out.println("Day la tam giac can");
}
}
