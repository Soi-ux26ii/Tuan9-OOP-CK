package baitap;
import java.time.LocalDate;
public class SinhVien {
	protected String maSV;
	protected String tenSV;
	protected LocalDate ngaySinh;
	protected String lop;
	protected int soTinChi;
	protected MonHoc monHoc;
	
	public SinhVien(String maSV, String tenSV, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc) {
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
		this.soTinChi = soTinChi;
		this.monHoc = monHoc;
	}
	
	public double ThanhTien () {
		return this.soTinChi * monHoc.getDonGia();
	}
	
	public String getLoai () {return "Sinh vien" ;}
	public String getThongTinRieng() { return "";}

	public String getMaSV() {return maSV;}
	public String getTenSV() {return tenSV;}
	public LocalDate getNgaySinh() {return ngaySinh;}
	public String getLop() {return lop;}
	public int getSoTinChi() {return soTinChi;}
	public MonHoc getMonHoc() {return monHoc;}
	public double getDonGia () {return monHoc.getDonGia();}
	public String getTenMonHoc () {return monHoc.getTenMon();}
	
	@Override
	public String toString () {
		return String.format("[%s] %s | Lop: %s | NS: %s | Mon: %s (%d tin chi x %,.0f) | TT: %,.0f VND",
								maSV, tenSV, lop, ngaySinh, getMonHoc(), soTinChi, getDonGia(), ThanhTien());
	}
}