package pojo;
//表示中介
public class Proxy implements Rent{
	
	private Host host = new Host();
	
	@Override
	public void rent() {
		System.out.println("带客户去看房");  //额外的操作
		host.rent();  //本职的工作
		System.out.println("收取中介费"); //额外的操作  2000*4=8000   2个月满 交6000  6000
	}

}
