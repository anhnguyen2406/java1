
public abstract class Staff {
protected int maSoNV;
protected String ten;
protected int tuoi;
protected int heSoLuong;
protected int ngayVaoLam;
protected String boPhanLamViec;
protected int soNgayNghi;
protected int luongNV;
public int getLuongNV() {
	return luongNV;
}
public void setLuongNV(int luongNV) {
	this.luongNV = luongNV;
}
public int getMaSoNV() {
	return maSoNV;
}
public void setMaSoNV(int maSoNV) {
	this.maSoNV = maSoNV;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public int getHeSoLuong() {
	return heSoLuong;
}
public void setHeSoLuong(int heSoLuong) {
	this.heSoLuong = heSoLuong;
}
public int getNgayVaoLam() {
	return ngayVaoLam;
}
public void setNgayVaoLam(int ngayVaoLam) {
	this.ngayVaoLam = ngayVaoLam;
}
public String getBoPhanLamViec() {
	return boPhanLamViec;
}
public void setBoPhanLamViec(String boPhanLamViec) {
	this.boPhanLamViec = boPhanLamViec;
}
public int getSoNgayNghi() {
	return soNgayNghi;
}
public void setSoNgayNghi(int soNgayNghi) {
	this.soNgayNghi = soNgayNghi;
}
public Staff(int maSoNV, String ten, int tuoi, int heSoLuong, int ngayVaoLam, String boPhanLamViec, int soNgayNghi, int luongNV) {
	super();
	this.maSoNV = maSoNV;
	this.ten = ten;
	this.tuoi = tuoi;
	this.heSoLuong = heSoLuong;
	this.ngayVaoLam = ngayVaoLam;
	this.boPhanLamViec = boPhanLamViec;
	this.soNgayNghi = soNgayNghi;
	this.luongNV= luongNV ;
}
public abstract void displayInformation();

}
