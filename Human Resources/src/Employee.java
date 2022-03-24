
public class Employee extends Staff implements ICalculator {
private int soGioLamThem;
	public int getSoGioLamThem() {
	return soGioLamThem;
}

public void setSoGioLamThem(int soGioLamThem) {
	this.soGioLamThem = soGioLamThem;
}

	public Employee(int maSoNV, String ten, int tuoi, int heSoLuong, int ngayVaoLam, String boPhanLamViec,
			int soNgayNghi, int luongNV, int soGioLamThem) {
		super(maSoNV, ten, tuoi, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghi, luongNV);
		this.soGioLamThem=soGioLamThem;
	}



	@Override
	public void displayInformation() {
		 System.out.println(" ma so NV "+ maSoNV+"; ten "+ten+"; tuoi "+ tuoi+"; he so luong "+ heSoLuong+"; ngay vao lam "+ ngayVaoLam+"; bo phan lam viec "+ boPhanLamViec+"; so gio lam them "+ soGioLamThem +"; luong nhan vien "+ luongNV +"; so ngay nghi "+ soNgayNghi);
	}

	@Override
	public int calculateSalary() {
		luongNV= heSoLuong*3000000+ soGioLamThem*200000;
		return luongNV;
	}

}
