package lab05.ex1;

public class QuaCam extends HoaQua
{
	public QuaCam() {}
	public QuaCam(String ten, String canNang, String giaBan, String xuatXu)
	{
		super(ten, canNang, giaBan, xuatXu);
	}
	
	@Override
	public String toString()
	{
		return "Tên: " + this.getTen() + "\n" + "Cân nặng: " + this.getCanNang() + "\n" + "Giá bán: " + this.getGiaBan() + "\n" + "Xuất xứ: " + this.getXuatXu() + "\n";
 	}
}
