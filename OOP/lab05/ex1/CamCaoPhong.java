package lab05.ex1;

public class CamCaoPhong extends QuaCam
{
	public CamCaoPhong()
	{
		super("Cam Cao Phong", "700g", "35000/kg", "Việt Nam");
	}
	
	@Override
	public String toString()
	{
		return "Tên: " + this.getTen() + "\n" + "Cân nặng: " + this.getCanNang() + "\n" + "Giá bán: " + this.getGiaBan() + "\n" + "Xuất xứ: " + this.getXuatXu() + "\n";
 	}
}
