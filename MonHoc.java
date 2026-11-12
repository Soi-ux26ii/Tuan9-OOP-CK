package baitap;

public enum MonHoc {
	LAP_TRINH_JAVA ("Lap trinh Java", 450000),
	CO_SO_DU_LIEU ("Co so du lieu", 450000),
	TOAN_ROI_RAC ("Toan roi rac", 400000),
	MANG_MAY_TINH ("mang may tinh", 400000),
	TRI_TUE_NHAN_TAO ("Tri tua nhan tao,", 600000),
	KY_THUAT_PHAN_MEM ("Ky thuat phan mem", 480000),
	LAP_TRINH_WEB ("Lap trih web", 500000),
	HE_DIEU_HANH ("HE dieu hanh", 420000);
	
	private String tenMon;
	private double donGia;
	
	MonHoc (String tenMon, double dongia){
		this.tenMon = tenMon;
		this.donGia = dongia;
	}

	public String getTenMon() {return tenMon;}

	public double getDonGia() {return donGia;}

	public static MonHoc fromTenMon (String tenMon) {
		for (MonHoc mh : values()){
			if (mh.tenMon.equalsIgnoreCase(tenMon))
				return mh;
		}
		return null;
	}
	
	@Override
	public String toString () {
		return String.format("%s (%,.0f VND/Tin chi)", tenMon, donGia);
	}
	
}
