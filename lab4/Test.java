package lab4;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> themMonHoc = new ArrayList<String>();
		themMonHoc.add("Toan");
		themMonHoc.add("Ly");
		themMonHoc.add("Sinh");

		
		Giangvien gVien = new Giangvien(
				"tranquocdung@gmail.com", "Tran Quoc Dung", 1995, "Nam", "0389387215", "Quy Nhon",
				themMonHoc);
		gVien.hienThiThongTin();
		gVien.hienThiMonHocSeDay();
		
		Sinhvien sVien = new Sinhvien("tienntqe180034@fpt.edu.vn", "Nguyen Tan Tien", 2004, "Nam", "0968480416", "01 Dong Da", "Toan cao cap, Java, OS, Vovinam");
		sVien.hienThiThongTin();
		sVien.hienThiMonHocChuyenNganh();
	}
}