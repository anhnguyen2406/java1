
public class Manager extends Staff implements ICalculator {
private String chucDanh;

	public Manager(int maSoNV, String ten, int tuoi, int heSoLuong, int ngayVaoLam, String boPhanLamViec,
			int soNgayNghi,int luongNV, String chucDanh) {
		super(maSoNV, ten, tuoi, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghi, luongNV);
	this.chucDanh=chucDanh;

	}

	public String getChucDanh() {
		return chucDanh;
	}

	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}

	@Override
	public void displayInformation() {
		 System.out.println(" ma so NV "+ maSoNV+"; ten "+ten+"; tuoi "+ tuoi+"; he so luong "+ heSoLuong +"; ngay vao lam "+ ngayVaoLam+"; bo phan lam viec "+ boPhanLamViec+"; chuc danh "+ chucDanh +"; luong nhan vien "+ luongNV +"; so ngay nghi "+ soNgayNghi);
		
	}

	@Override
	public int calculateSalary() {
		if (chucDanh.equals("Business Leader")) {
			 luongNV =3000000*heSoLuong+8000000;
		}else if (chucDanh.equals("Project Leader")) {
			 luongNV=3000000*heSoLuong+5000000;
		}else if (chucDanh.equals("Technical Leader")) {
			 luongNV=3000000*heSoLuong+6000000;
		}else {
			System.out.println("Nhap sai chuc danh");
		}

	return  luongNV;
	}
}
