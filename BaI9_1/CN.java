package BaI9_1;

public class CN {
	private int maCN ;
	private String ho;
	private String ten;
	private int soSp;
	public CN(int maCN, String ho, String ten, int soSp) {
		super();
		this.maCN = maCN;
		this.ho = ho;
		this.ten = ten;
		this.soSp = soSp;
	}
	public double tinhLuong() {
		double price;
		if (soSp > 0) {
			if (soSp > 600) {
				price = 0.65;
				return soSp * price;
			}
			if (soSp > 400 && soSp < 599) {
				price = 0.6;
				return soSp * price;
			}
			if (soSp > 200 && soSp < 399) {
				price = 0.55;
				return soSp * price;
			}
			if (soSp > 1 && soSp < 199) {
				price = 0.5;
				return soSp * price;
			}
			else {
				return 0;
			}
		}
		else {
			System.err.println("Nhập sai số sản phẩm");
			return 0;
		}
		
	}
	@Override
	public String toString() {
		return "CN [maCN=" + maCN + ", ho=" + ho + ", ten=" + ten + ", soSp=" + soSp + ", tinhLuong()=" + tinhLuong()
				+ "]";
	}
	public int getMaCN() {
		return maCN;
	}
	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getMaSoSp() {
		return soSp;
	}
	public void setMaSoSp(int maSoSp) {
		this.soSp = maSoSp;
	}
	public CN() {
		super();
	}
	public String toString1() {
		// TODO Auto-generated method stub
		return null;
	}


}
