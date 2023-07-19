package entities;

import java.util.Date;

public class Manager {
	private int id;
	private int masv;
	private int makh;
	private String phonghoc;
	private Date ngaydangky;
	public Manager(int id, int masv, int makh, String phonghoc, Date ngaydangky) {
		super();
		this.id = id;
		this.masv = masv;
		this.makh = makh;
		this.phonghoc = phonghoc;
		this.ngaydangky = ngaydangky;
	}
	public Manager() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public int getMakh() {
		return makh;
	}
	public void setMakh(int makh) {
		this.makh = makh;
	}
	public String getPhonghoc() {
		return phonghoc;
	}
	public void setPhonghoc(String phonghoc) {
		this.phonghoc = phonghoc;
	}
	public Date getNgaydangky() {
		return ngaydangky;
	}
	public void setNgaydangky(Date ngaydangky) {
		this.ngaydangky = ngaydangky;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", masv=" + masv + ", makh=" + makh + ", phonghoc=" + phonghoc + ", ngaydangky="
				+ ngaydangky + "]";
	}

	
}
