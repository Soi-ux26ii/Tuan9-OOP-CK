package baitap;

import java.util.List;

public interface IFSinhVien {
	boolean them(SinhVien sv);
	boolean sua (final String maSV, SinhVien sv);
	boolean xoa (final String maSV);
	boolean xoatatca ();
	
	List<SinhVien> Laytatca ();
	SinhVien timtheoMa (final String maSV);
	List<SinhVien> timtheoTen (final String tenSV);
	List<SinhVien> timthepLop (final String lop);
	List<SinhVien> timtheoLoai (final String Loai);
	List<SinhVien> timtheoMon (MonHoc monhoc);
	
	int TongSoLuong ();
	double tongThanhTien ();
	
	List <SinhVien> SapXepTheoTen();
	List<SinhVien> sapXepTheoThanhTienGiamDan();
}
