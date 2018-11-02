package NumenPack;

import java.util.Scanner;

import EquipPack.EquipAbstract;



//����ĳ�����
public abstract class NumenAbstract 
{
	private String name;//����
	private String race;//����
	private int level;//�ȼ�
	private int exp;//����
	private int atk;//������
	private int def;//������
	private int sep;//�ٶ�
	private int hp;//����ֵ
	private int point;//��������
	private int money;//���
	private EquipAbstract headequip;//����ͷ��װ��
	private EquipAbstract bodyequip;//��������װ��
	private EquipAbstract handequip;//�����ֲ�װ��
	private EquipAbstract weaponequip;//��������װ��
	private EquipAbstract footequip;//����Ų�װ��
	
	

	public String getHeadequip() {
		return headequip.getEquipname();
	}
	public void setHeadequip(EquipAbstract headequip) 
	{
			this.headequip = headequip;
			this.setAtk(this.getAtk()+headequip.getEffatk());
			this.setDef(this.getDef()+headequip.getEffdef());
			this.setSep(this.getSep()+headequip.getEffsep());
	}
	public String getBodyequip() {
		return bodyequip.getEquipname();
	}
	public void setBodyequip(EquipAbstract bodyequip) {

			this.bodyequip = bodyequip;
			this.setAtk(this.getAtk()+bodyequip.getEffatk());
			this.setDef(this.getDef()+bodyequip.getEffdef());
			this.setSep(this.getSep()+bodyequip.getEffsep());
	}
	public String getHandequip() {
		return handequip.getEquipname();
	}
	public void setHandequip(EquipAbstract handequip) {
			this.handequip = handequip;
			this.setAtk(this.getAtk()+handequip.getEffatk());
			this.setDef(this.getDef()+handequip.getEffdef());
			this.setSep(this.getSep()+handequip.getEffsep());
	}
	public String getWeaponequip() {
		return weaponequip.getEquipname();
	}
	public void setWeaponequip(EquipAbstract weaponequip) {
			this.weaponequip = weaponequip;
			this.setAtk(this.getAtk()+weaponequip.getEffatk());
			this.setDef(this.getDef()+weaponequip.getEffdef());
			this.setSep(this.getSep()+weaponequip.getEffsep());
	}
	public String getFootequip() {
		return footequip.getEquipname();
		
	}
	public void setFootequip(EquipAbstract footequip) {
			this.footequip = footequip;
			this.setAtk(this.getAtk()+footequip.getEffatk());
			this.setDef(this.getDef()+footequip.getEffdef());
			this.setSep(this.getSep()+footequip.getEffsep());
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) 
	{
		this.exp = exp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
 	public int getSep() {
		return sep;
	}
	public void setSep(int sep) {
		this.sep = sep;
	}
	
	
	

	public  void Attack(NumenAbstract n) //����һ������ķ���
	{
				int hurt=(this.getAtk() - n.getDef());
				if(hurt>0)
				{
					n.setHp(n.getHp()-hurt);
				}
				else
					;
	}

	public void Show()
	{
		 String name = this.getName();
		 String race=this.getRace();
		 int level=this.getLevel();
		 int exp=this.getExp();
		 int atk=this.getAtk();
		 int def=this.getDef();
		 int sep=this.getSep();
		 int hp=this.getHp();
		 System.out.print("���ƣ�"+name+"\t");
		 System.out.println("���壺"+race);
		 System.out.print("�ȼ���"+level+"\t");
		 System.out.println("���飺"+exp);
		 System.out.print("��������"+atk+"\t");
		 System.out.println("��������"+def);
		 System.out.print("�ٶȣ�"+sep+"\t");
		 System.out.println("Ѫ����"+hp);
	}

	public abstract void speak(); 
}
