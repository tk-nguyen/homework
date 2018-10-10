package lab05.ex1;

public class CamSanh extends QuaCam
{
	public CamSanh()
	{
		super("Cam Sanh", "600g", "30000/kg", "Việt Nam");
	}

	@Override
	public String toString()
	{
		return "Tên: " + this.getTen() + "\n" + "Cân nặng: " + this.getCanNang() + "\n" + "Giá bán: " + this.getGiaBan() + "\n" + "Xuất xứ: " + this.getXuatXu() + "\n";
 	}
}
