package lab4;



public class Person {
	private String Email;
	private String hovaTen;
	private int namSinh;
	private String gioiTinh;
	private String soDienThoai;
	private String diaChi;

	public Person(String email, String hovaTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi) {
		this.Email = email;
		this.hovaTen = hovaTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = Email;
	}

	public String getHoTen() {
		return hovaTen;
	}

	public void setHoTen(String hoTen) {
		this.hovaTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void hienThiThongTin() {
		System.out.println("Email: " + this.Email);
		System.out.println("Ho va ten: " + this.hovaTen);
		System.out.println("Nam sinh: " + this.namSinh);
		System.out.println("Gioi tinh: " + this.gioiTinh);
		System.out.println("So dien thoai: " + this.soDienThoai);
		System.out.println("Dia chi: " + this.diaChi);
	}

	public void thayDoiSoDienThoai(String soDienThoaiMoi) {
		this.soDienThoai = soDienThoaiMoi;
	}
	
	public void thayDoiDiaChi(String diaChiMoi) {
        this.diaChi = diaChiMoi;
    }

}