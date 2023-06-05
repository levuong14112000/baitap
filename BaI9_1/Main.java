package BaI9_1;

public class Main {
 public static void main(String[] args) {
	  CNlist danhSach = new CNlist();
      // Thêm các công nhân vào danh sách
      danhSach.themCongNhan(new CN(001, "Nguyen", "Van A", 150));
      danhSach.themCongNhan(new CN(002, "Tran", "Thi B", 250));
      danhSach.themCongNhan(new CN(003, "Le", "Van C", 180));
      danhSach.themCongNhan(new CN(004, "Pham", "Thi D", 220));
      // Xuất toàn bộ thông tin Công nhân
      danhSach.xuatThongTinCongNhan();
      // Tính số lượng công nhân làm trên 200 sản phẩm
      danhSach.xuatThongTinCongNhan200();
}
}
