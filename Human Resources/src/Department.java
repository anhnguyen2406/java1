
public class Department {
	private int maBoPhan;
	private String tenBoPhan;

	private int soLuongNV;
	public Department(String tenBoPhan,int maBoPhan,  int soLuongNV) {
		super();
		this.maBoPhan = maBoPhan;
		this.tenBoPhan = tenBoPhan;
		this.soLuongNV = soLuongNV;
	}
	public void setMaBoPhan(int maBoPhan) {
		this.maBoPhan = maBoPhan;
	}
	public String getTenBoPhan() {
		return tenBoPhan;
	}

	public void setTenBoPhan(String tenBoPhan) {
		this.tenBoPhan = tenBoPhan;
	}

	public int getSoLuongNV() {
		return soLuongNV;
	}

	public void setSoLuongNV(int soLuongNV) {
		this.soLuongNV = soLuongNV;
	}
	public int getMaBoPhan() {
		return maBoPhan;
	}
	public void tangNV() {
		soLuongNV=soLuongNV+1;
	}
	@Override
	public String toString() {
		return "Department [maBoPhan=" + maBoPhan + ", tenBoPhan=" + tenBoPhan + ", soLuongNV=" + soLuongNV + "]";
	}

}
