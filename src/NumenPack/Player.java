package NumenPack;

import java.util.Scanner;

import EquipPack.EquipAbstract;
import LevelPack.LevelConfig;

public class Player extends NumenAbstract implements NumenInterFace
{

	public Player() 
	{
		System.out.println("�����������������");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		super.setName(name);
		System.out.println("��ѡ���������������");
		System.out.println("1.Fire    2.Water   ");
		int race = input.nextInt();
		if(race==1)
			super.setRace("fire");
		else if(race==2)
			super.setRace("water");
		else
			super.setRace("null");
		
		super.setAtk(2);
		super.setDef(2);
		super.setSep(2);
		super.setHp(100);
		super.setLevel(1);
		super.setExp(0);
		super.setPoint(3);
		super.setMoney(0);
		
		super.setHeadequip(new EquipAbstract());
		super.setBodyequip(new EquipAbstract());
		super.setHandequip(new EquipAbstract());
		super.setWeaponequip(new EquipAbstract());
		super.setFootequip(new EquipAbstract());
	}
	
	public void Show()
	{
		 String name = super.getName();
		 String race=super.getRace();
		 int level=super.getLevel();
		 int exp=super.getExp();
		 int atk=super.getAtk();
		 int def=super.getDef();
		 int sep=super.getSep();
		 int hp=super.getHp();
		 int point = super.getPoint();
		 int money = super.getMoney();
		 System.out.print("���ƣ�"+name+"\t");
		 System.out.println("���壺"+race);
		 System.out.print("�ȼ���"+level+"\t");
		 System.out.println("���飺"+exp);
		 System.out.print("��������"+atk+"\t");
		 System.out.println("��������"+def);
		 System.out.print("�ٶȣ�"+sep+"\t");
		 System.out.println("Ѫ����"+hp);
		 System.out.println("����������"+point+"\t");
		 System.out.println("��ң�"+money);
		 System.out.println("---------װ��----------");
		 System.out.println("ͷ����"+super.getHeadequip());
		 System.out.println("���壺"+super.getBodyequip());
		 System.out.println("�ֲ���"+super.getHandequip());
		 System.out.println("������"+super.getWeaponequip());
		 System.out.println("�Ų���"+super.getFootequip());
	}
	@Override
	public void speak()//�շ��������ǲ���Ҫ
	{
		
	}
	
	@Override
	public void ChangeEquipment(EquipAbstract e) //����װ��
	{
		this.setMoney(this.getMoney()-e.getMoney());
		if(e.getPlace().equals("head"))
			this.setHeadequip(e);
		else if(e.getPlace().equals("body"))
			this.setBodyequip(e);
		else if(e.getPlace().equals("hand"))
			this.setHandequip(e);
		else if(e.getPlace().equals("weapon"))
			this.setWeaponequip(e);
		else if(e.getPlace().equals("foot"))
			this.setFootequip(e);
		else
			;
		System.out.println("�⿴�����ǳ��ʺ��㣡");
	}
	
	@Override
	public void Levelup() //��������
	{
		LevelConfig lc = new LevelConfig();
		this.setExp(0);
		this.setLevel(this.getLevel()+1);
		this.setPoint(lc.getLevelupPoint(this.getLevel()));
		System.out.println("��ϲ����������"+this.getLevel()+"��");
		System.out.println("��ϲ���������"+this.getPoint()+"����������");
	}
	@Override
	public void UsePoint(int i) //������������
	{
		int point = this.getPoint();
		switch (i) 
		{
			case 1:
				point=point-1;
				this.setPoint(point);
				this.setAtk(this.getAtk()+1);
				break;
			case 2:
				point=point-1;
				this.setPoint(point);
				this.setDef(this.getDef()+1);
				break;
			case 3:
				point=point-1;
				this.setPoint(point);
				this.setSep(this.getSep()+1);
				break;
			default:
				break;
		}
	}
	@Override
	public  void GetExpAndCanLevelup(NumenAbstract di)//�����þ�����ж�����
	{
		System.out.println("��ϲ���ⳡս������ʤ�ˣ������ⳡս���л����"+di.getExp()+"�㾭���Լ�"+di.getMoney()+"���");
		int winexp =di.getExp()+this.getExp();
		int winmon=this.getMoney()+di.getMoney();
		this.setExp(winexp);
		this.setMoney(winmon);
		LevelConfig lc = new LevelConfig();
		if(lc.canLevelup(this)== true)
		{
			this.Levelup();
		}
	}
}


