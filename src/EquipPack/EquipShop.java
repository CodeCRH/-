package EquipPack;

import java.util.Scanner;

import NumenPack.NumenAbstract;
import NumenPack.Player;

public class EquipShop 
{
	public  EquipShop(Player n)
	{
		EquipAbstract ZSTK = new EquipAbstract("ս��ͷ��",0,6,-2,20,"head");
		EquipAbstract LHSZJ = new EquipAbstract("�������Ӽ�",0,15,-1,35,"body");
		EquipAbstract LMJZ = new EquipAbstract("��ħ��ָ",12,2,2,37,"hand");
		EquipAbstract QSSSC = new EquipAbstract("��˪߱���",21,5,0,50,"weapon");
		EquipAbstract BSZFX = new EquipAbstract("��˹׷��ѥ",2,3,8,27,"foot");
		while(true)
		{
		System.out.println("-------------װ����-------------");
		System.out.println("Ŷ���ⲻ��"+n.getName()+"��");
		System.out.println("��ӭ�������ҵ�װ���꣬�����Ҵ����װ��������ø���ǿ��");
		System.out.println("����һ���Ҹ棺����������������BOSS�ǣ�����Ҫ�ǳ�ǿ���װ����Ϊ���");
		System.out.println("��������������Щװ����");
		System.out.println("����:"+ZSTK.getEquipname()+"  װ��������:"+ZSTK.getEffatk()+"  װ��������:"+ZSTK.getEffdef()+"  װ���ٶ�:"+ZSTK.getEffsep()+"  �ۼ�:"+ZSTK.getMoney()+"  װ����λ:"+ZSTK.getPlace()+".................��1��");
		System.out.println("����:"+LHSZJ.getEquipname()+"  װ��������:"+LHSZJ.getEffatk()+"  װ��������:"+LHSZJ.getEffdef()+"  װ���ٶ�:"+LHSZJ.getEffsep()+"  �ۼ�:"+LHSZJ.getMoney()+"  װ����λ:"+LHSZJ.getPlace()+"..............��2��");
		System.out.println("����:"+LMJZ.getEquipname()+"  װ��������:"+LMJZ.getEffatk()+"  װ��������:"+LMJZ.getEffdef()+"  װ���ٶ�:"+LMJZ.getEffsep()+"  �ۼ�:"+LMJZ.getMoney()+"  װ����λ:"+LMJZ.getPlace()+"..................��3��");
		System.out.println("����:"+QSSSC.getEquipname()+"  װ��������:"+QSSSC.getEffatk()+"  װ��������:"+QSSSC.getEffdef()+"  װ���ٶ�:"+QSSSC.getEffsep()+"  �ۼ�:"+QSSSC.getMoney()+"  װ����λ:"+QSSSC.getPlace()+".............��4��");
		System.out.println("����:"+BSZFX.getEquipname()+"  װ��������:"+BSZFX.getEffatk()+"  װ��������:"+BSZFX.getEffdef()+"  װ���ٶ�:"+BSZFX.getEffsep()+"  �ۼ�:"+BSZFX.getMoney()+"  װ����λ:"+BSZFX.getPlace()+"...............��5��");
		System.out.println("�Ҳ�������...........................................................��0��");
			try
			{
			
			Scanner input = new Scanner(System.in);
			int in = input.nextInt();

				switch (in) 
				{
				case 1:
					if(muchmoney(n,ZSTK))
						n.ChangeEquipment(ZSTK);
					break;
				case 2:
					if(muchmoney(n,LHSZJ))
						n.ChangeEquipment(LHSZJ);
					
					break;
				case 3:
					if(muchmoney(n,LMJZ))
						n.ChangeEquipment(LMJZ);
					break;
				case 4:
					if(muchmoney(n,QSSSC))
						n.ChangeEquipment(QSSSC);
					break;
				case 5:
					if(muchmoney(n,BSZFX))
						n.ChangeEquipment(BSZFX);
					break;
				case 0:
					return;
				default:
					System.out.println("Ŷ��������˵�Сë���أ�");
					break;
				}
			}
		
		catch(Exception ex)
		{
			
			System.out.println("����������󣬷������˵�");
			return;
		}
		}
	}
		

	public boolean muchmoney(NumenAbstract n,EquipAbstract e)
	{
		if(n.getMoney()<e.getMoney())
		{
			System.out.println("Ŷ����Ľ�Һ���̫��������Ҫ�Ҹ������һ�ݹ�����?");
			return false;
		}
		else
		{
			return true;
		}
	}
}
