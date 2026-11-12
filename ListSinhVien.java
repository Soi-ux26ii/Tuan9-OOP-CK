package baitap;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class ListSinhVien  implements IFSinhVien{
	private ArrayLits<SinhVien> danhSach;
	
	public ListSinhVien () {
		this.danhSach = new ArrayList<>();
	}
	
	public ListSinhVien (ArrayList<SinhVien> ds) {
		this.danhSach = ds;
	}
	
}
