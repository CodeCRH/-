package EquipPack;


public  class EquipAbstract 
{
	private String equipname;
	private int effatk;//װ���Ĺ�����
	private int effdef;//װ���ķ�����
	private int effsep;//װ�����ٶ�
	private int money;//�ۼ�
	private String place;//������װ����λ
	
	
	
	
	public EquipAbstract() 
	{

	}


	public EquipAbstract(String equipname,int effatk,int effdef,int effsep,int money,String place) 
	{
		this.setEquipname(equipname);
		this.setEffatk(effatk);
		this.setEffdef(effdef);
		this.setEffsep(effsep);
		this.setMoney(money);
		this.setPlace(place);	
	}
	
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getEffatk() {
		return effatk;
	}
	public void setEffatk(int effatk) {
		this.effatk = effatk;
	}
	public int getEffdef() {
		return effdef;
	}
	public void setEffdef(int effdef) {
		this.effdef = effdef;
	}
	public int getEffsep() {
		return effsep;
	}
	public void setEffsep(int effsep) {
		this.effsep = effsep;
	}
	public String getEquipname() {
		return equipname;
	}
	public void setEquipname(String equipname) {
		this.equipname = equipname;
	}



	
}
