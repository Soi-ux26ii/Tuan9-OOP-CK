package baitap;
import java.time.LocalDate;
public class SinhVienChinhQuy extends SinhVien {
	private String hocTrucTiep;
	
	SinhVienChinhQuy (String maSV, String tenSV, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc, String hcoTrucTiep){
		super (maSV, tenSV, ngaySinh, lop, soTinChi, monHoc);
		this.hocTrucTiep = hocTrucTiep;
	}

	public String getHocTrucTiep() {return hocTrucTiep;}
	public void setHocTrucTiep(String hocTrucTiep) {
		this.hocTrucTiep = hocTrucTiep;
	}
	
	@Override
	public String getLoai() {
		return "Chinh Quy";
	}
	
	@Override
	public String getThongTinRieng () {
		return "Hoc truc tiep tai: " + hocTrucTiep;
	}
	
	@Override
	public String toString () {
		return super.toString() + " | " + getThongTinRieng();
	}
}
