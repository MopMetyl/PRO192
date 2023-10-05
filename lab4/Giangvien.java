package lab4;
import java.util.ArrayList;
import java.util.List;


public class Giangvien extends Person {
	private List<String> danhSach = new ArrayList<String>();

	public Giangvien(String email, String hovaTen, int NamSinh, String gioiTinh, String soDienThoai, String diaChi,
			List<String> danhSach) {
		super(email, hovaTen, NamSinh, gioiTinh, soDienThoai, diaChi);
		this.danhSach = danhSach;
	}

	public List<String> getDanhSach() {
		return danhSach;
	}

	public void setDanhSach(List<String> danhSach) {
		this.danhSach = danhSach;
	}

	public void themMonHocSeDay(String themMonHoc) {
		danhSach.add(themMonHoc);
	}

	public void hienThiMonHocSeDay() {
		System.out.println("Cac mon hoc se day:");
		for (String themMonHoc : danhSach) {
			System.out.println(themMonHoc);
		}
	}
}