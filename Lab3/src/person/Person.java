public class Person {
    private String email;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String soDienThoai;
    private String diaChi;
    public Person(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi) {
        this.email = email;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }
    public void hienThiThongTin() {
        System.out.println("Thong tin ca nhan:");
        System.out.println("Email: " + email);
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("Dia chi: " + diaChi);
    }

   
    public void thayDoiSoDienThoai(String soDienThoaiMoi) {
        this.soDienThoai = soDienThoaiMoi;
    }

   
    public void thayDoiDiaChi(String diaChiMoi) {
        this.diaChi = diaChiMoi;
    }
    public static void main(String[] args) {
        
        Person sinhVien = new Person("mopmetyl@gmail.com", "Nguyen Van Nam", 2000, "Nam", "0336642035", "01 Dong Da, Thanh phố Quy Nhon");

     
        sinhVien.hienThiThongTin();
        sinhVien.thayDoiSoDienThoai("0389116428");
        sinhVien.thayDoiDiaChi("151 Le Loi, Thanh pho Quy Nhon");
        sinhVien.hienThiThongTin();
    }
}