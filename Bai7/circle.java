package Bai7;

public class circle extends bai7 {
	private double banKinh;
	private static double PI = 3.14;
	public circle(String name, double d, double e, double banKinh) {
		this.banKinh = banKinh;
	}
	public circle() {
	}
	public double dienTich() {
		return  PI * banKinh * banKinh ;
	}
	public double chuVi() {
		return  2 * PI * banKinh;
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	@Override
	public String toString() {
		return "circle [banKinh=" + banKinh + ", dienTich()=" + dienTich() + ", chuVi()=" + chuVi() + ", getY()="
				+ getY() + ", getX()=" + getX() + "]";
	}
	
}
