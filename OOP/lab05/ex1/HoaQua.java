package lab05.ex1;

public class HoaQua
{
	private String ten;
	private String giaBan;
	private String canNang;
	private String xuatXu;
	
	public HoaQua() {}
	public HoaQua(String ten, String canNang, String giaBan, String xuatXu)
	{
		this.ten = ten;
		this.giaBan = giaBan;
		this.canNang = canNang;
		this.xuatXu = xuatXu;
	}

	public String getTen()
	{
		return ten;
	}
	
	public String getGiaBan()
	{
		return giaBan;
	}
	
	public String getCanNang()
	{
		return canNang;
	}
	
	public String getXuatXu()
	{
		return xuatXu;
	}
	
	public void setTen(String ten)
	{
		this.ten = ten;
	}
	
	public void setGiaBan(String giaBan)
	{
		this.giaBan = giaBan;
	}
	
	public void setCanNang(String canNang)
	{
		this.canNang = canNang;
	}
	
	public void setXuatXu(String xuatXu)
	{
		this.xuatXu = xuatXu;
	}
	
}
