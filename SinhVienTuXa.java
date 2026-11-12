package baitap;
import java.time.LocalDate;
public class SinhVienTuXa extends SinhVien {
	private String nentang;
	
	SinhVienTuXa (String maSV, String tenSV, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc, String nentang){
		super (maSV, tenSV, ngaySinh, lop, soTinChi, monHoc);
		this.nentang = nentang;
	}

	public String getNenTang() {return nentang;}
	public void setNenTang(String nentang) {
		this.nentang = nentang;
	}
	
	@Override
	public String getLoai() {
		return "Tu Xa";
	}
	
	@Override
	public String getThongTinRieng () {
		return "Nen tang: " + this.nentang;
 	}
	
	@Override
	public String toString () {
		return super.toString() + " | " + getThongTinRieng();
	}
}
