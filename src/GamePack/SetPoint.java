package GamePack;

import java.util.Scanner;

import NumenPack.NumenAbstract;
import NumenPack.Player;

//�����������
public class SetPoint 
{

	public SetPoint(Player player)
	{
		while(true)
		{
			int point = player.getPoint();
			System.out.println("------------������������---------------");
			System.out.println("����ǰӵ��"+point+"������������");
			System.out.println("����1�㹥����.................... ..��1��");
			System.out.println("����1�������.................... ..��2��");
			System.out.println("����1���ٶ�...................... ..��3��");
			System.out.println("����........................... ..��0��");
			try
			{
				if(point>0)
				{
					Scanner input = new Scanner(System.in);
					int set= input.nextInt();
					switch (set)
					{
						case 1:
							player.UsePoint(set);
							continue;
						case 2:
							player.UsePoint(set);
							continue;
						case 3:
							player.UsePoint(set);
							continue;
						case 0:
							return;
					}
				}
				else
				{
					System.out.println("����ʱû�пɹ������ĵ���");
					break;
				}
			}
			catch(Exception ex)
			{
				System.out.println("�����������󡣷������˵�");
				return;
			}
		}
	}

}
