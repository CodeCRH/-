package GamePack;

import LevelPack.LevelConfig;
import NumenPack.NumenAbstract;
import NumenPack.Player;

//ս������
public class War
{

	public War(Player player,NumenAbstract di) 
	{
		System.out.println("���Ķ�����Ϣ");
		di.Show();
		di.speak();
		
		while((player.getHp()!=0 && di.getHp()!=0) && ( player.getAtk()>di.getDef() )  )//�ж�ս������
		{
			if(player.getSep()>=di.getSep())
			{
				player.Attack(di);
				if(di.getHp()>0)
					di.Attack(player);
			}
			else
			{
				di.Attack(player);
				if(player.getHp()>0)
				player.Attack(di);
			}
		}
		
		int level = player.getLevel();
		int exp = player.getExp();
		LevelConfig lc = new LevelConfig();

		
		if(player.getAtk()<=di.getDef()&&di.getAtk()<=player.getDef())
		{
			System.out.println("ƽ�֣�������Ҫ����ĥ�²��ܴ�ܶ���");
		}
		else if(player.getAtk()<=di.getDef()&&di.getAtk()>player.getDef())
		{
			int deadexp = lc.deadExp(level);
			player.setExp(exp-deadexp);//����������侭��
			System.out.println("�Բ����ⳡս����ʧ���ˣ������ⳡս������ʧ��"+deadexp+"�㾭��");
		}
		else if(player.getHp()<=0)
		{
			int deadexp = lc.deadExp(level);
			player.setExp(exp-deadexp);//����������侭��
			System.out.println("�Բ����ⳡս����ʧ���ˣ������ⳡս������ʧ��"+deadexp+"�㾭��");
			
		}
		else
		{
			player.GetExpAndCanLevelup(di);
		}
	}

	
}
