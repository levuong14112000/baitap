package bai3; 
public class bai3 {
	private double ma;
	private double mb;
	private double mc;
	private double cv;
	private double dt;
	public bai3() {
	}
	public bai3(double ma , double mb , double mc) {
		if (ma <0 || mb < 0 || mc < 0 ) {
		   this.ma = 0;
		   this.mb = 0;
		   this.mc = 0;
		}
		else {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
	}
	public double ChuVi() {
		cv = ma + mb + mc;
		return ma;
	}
	public void kiemTra() {
		if( ma<mb+mc && mb<ma+mc && mc<ma+mb ){
			 if( ma*ma==mb*mb+mc*mc || mb*mb==ma*ma+mc*mc || mc*mc== ma*ma+mb*mb)
			 System.out.println("Day la tam giac vuong");
			 else if(ma==mb && mb==mc)
			 System.out.println("Day la tam giac deu");
			 else if(ma==mb || ma==mc || mb==mc)
			 System.out.println("Day la tam giac can");
			 else {
				System.out.println("Khong phai la tam giac");
			}
		}
	}
	public String toString() {
		return "bai3 [ma=" + ma + ", mb=" + mb + ", mc=" + mc + ", cv=" + cv + ", dt=" + dt + ", chuvi()=" + ChuVi()
				+ ", dienTich()=" + DienTich() + "]";
	}
	public double DienTich() {
	 return  (ma + mb + mc) / 2;
	
	}
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		this.ma = ma;
	}
	public double getMb() {
		return mb;
	}
	public void setMb(double mb) {
		this.mb = mb;
	}
	public double getMc() {
		return mc;
	}
	public void setMc(double mc) {
		this.mc = mc;
	}
	
	
}
