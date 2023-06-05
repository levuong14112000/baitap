package BaI9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CNlist {
	private ArrayList<CN> danhSachCongNhan;
	// Constructor
	public CNlist() {
		danhSachCongNhan = new ArrayList<>();
	}
	// Phương thức thêm một công nhân vào danh sách
	public void themCongNhan(CN congNhan) {
		danhSachCongNhan.add(congNhan);
	}
	// Phương thức xuất toàn bộ thông tin Công nhân
	public void xuatThongTinCongNhan() {
		System.out.println("Danh sách công nhân:");
		for (CN congNhan : danhSachCongNhan) {
			System.out.println("Mã CN: " + congNhan.getMaCN() + ", Họ tên: " + congNhan.getHo() + " " + congNhan.getTen() +
					", Số sản phẩm: " + congNhan.getMaSoSp());
		}
	}
	// Phương thức XUẤT công nhân làm trên 200 mSoSP
	public void xuatThongTinCongNhan200() {
		System.out.println("Danh sách công nhân > 200 SP");
			for (CN congNhan : danhSachCongNhan) {
				if (congNhan.getMaSoSp() > 200) {
					System.out.println("Mã CN: " + congNhan.getMaCN() + ", Họ tên: " + congNhan.getHo() + " " + congNhan.getTen() +
							", Số sản phẩm: " + congNhan.getMaSoSp());
				}	
		}
	}
	// Phương thức sắp xếp công nhân theo số sản phẩm giảm dần
	public void sapXepCongNhanGiamDanTheoSP() {
		Collections.sort(danhSachCongNhan, new Comparator<CN>() {
			public int compare(CN cn1, CN cn2) {
				return Integer.compare(cn2.getMaSoSp(), cn1.getMaSoSp());
			}
		});
	}
}
