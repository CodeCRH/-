package GamePack;

import java.util.Scanner;

import EquipPack.EquipShop;
import NumenPack.NumenBoss;
import NumenPack.Player;

//������Ϸ
public class GameStart {

	public static void main(String[] args) 
	{
			System.out.println("��ӭ���������������������丯��֮��");
			System.out.println("���������еĲ�����ս���гɳ�����������������ʹ�����ĥ�б��ǿ�� ");
			System.out.println("�������������������������������");
			System.out.println("��ס������������֮��");
			System.out.println("������Ĵ������ǣ�������������ʤ����");
			
			Player p = new Player();
			
			Scanner input = new Scanner(System.in);
			try
			{
				while(true)
				{
					System.out.println("------------���˵�---------------");
					System.out.println("�������Ӧ�����ֽ��빦��");
					System.out.println("�������������.................��1��");
					System.out.println("�鿴�ҵĸ�����Ϣ................��2��");
					System.out.println("������������..................��3��");
					System.out.println("����վ......................��4��");
					System.out.println("������.......................��5��");
					System.out.println("BOSS��ս....................��6��");
					System.out.println("������Ϸ.....................��0��");
					System.out.println("------------------------------");
					System.out.println("");
					int in = input.nextInt();
					switch(in)
					{
						case 1: 
						    new Register(p);
							continue;
						case 2:
							p.Show();
							continue;
						case 3:
						     new SetPoint(p);
							continue;
						case 4:	
							new Cure(p);
							continue;
						case 5:
							new EquipShop(p);
							continue;
						case 6:
						//	NumenBoss boss=	new NumenBoss();
							new Register(p,new NumenBoss());
							continue;
						case 10086:
							p.setMoney(500);
							continue;
						case 0:  
							System.out.println("��Ҫ�뿪������ô���´��ٹ������������ɡ�");
							break;
						default :
							System.out.println("������������");
							continue;
					}
					break;
				}
			}
			catch(Exception ex)
			{
				System.out.println("��������������Ϸǿ���˳�!");
			}
	}

}
