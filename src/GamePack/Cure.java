package GamePack;

import java.util.Scanner;

import NumenPack.NumenAbstract;

//����վ��
public  class Cure 
{

	public Cure(NumenAbstract player) 
	{
		System.out.println("��ӭ��������վ��������������������˿�");
		System.out.println("�۸��� 5���/��");
		System.out.println("����Ҫ������");
		System.out.println("�����˿�..................��1��");
		System.out.println("����.....................��2��");
	
		try
		{
			Scanner input = new Scanner(System.in);
			int set= input.nextInt();
			switch (set) 
			{
				case 1:
					if(player.getMoney()<5)
						System.out.println("�Բ������Ľ�Ҳ���֧�����Ʒ���");
					else
					{
						player.setMoney(player.getMoney()-5);
						player.setHp(100);
						System.out.println("���Ѿ��ָ���������С�ı���");
					}
					break;
				case 2:
					return;
				default:
					System.out.println("�����������󡣷������˵�");
					return;
			}
		}
		catch(Exception ex)
		{
			System.out.println("�����������󡣷������˵�");
			return;
		}
	}

}
