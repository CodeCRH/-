package NumenPack;

import EquipPack.EquipAbstract;


//����Ľӿ�
public interface NumenInterFace 
{
	public void ChangeEquipment(EquipAbstract e);//����װ��
	public void Levelup();//��������
	public void UsePoint(int i);//������������
	public void GetExpAndCanLevelup(NumenAbstract n);//�����þ�����ж�����

}
