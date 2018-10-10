package lab05.ex1;

public class QuaTao extends HoaQua
{
	public QuaTao()
	{
		super("Qua tao", "650g", "40000/kg", "Việt Nam");
	}
	
	@Override
	public String toString()
	{
		return "Tên: " + this.getTen() + "\n" + "Cân nặng: " + this.getCanNang() + "\n" + "Giá bán: " + this.getGiaBan() + "\n" + "Xuất xứ: " + this.getXuatXu() + "\n";
 	}
}


