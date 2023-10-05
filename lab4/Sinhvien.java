package lab4;


public class Sinhvien extends Person{
	private String chuyenNganh;

	public Sinhvien(String email, String hovaTen, int NamSinh, String gioiTinh, String soDienThoai, String diaChi,
			String chuyenNganh) {
		super(email, hovaTen, NamSinh, gioiTinh, soDienThoai, diaChi);
		this.chuyenNganh = chuyenNganh;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	
	public void hienThiMonHocChuyenNganh() {
		System.out.println("Danh sach mon hoc theo chuyen nganh:" + this.chuyenNganh);
	}
}