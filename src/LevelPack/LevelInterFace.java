package LevelPack;

import NumenPack.NumenAbstract;

//�ȼ�����ӿ�
public interface LevelInterFace 
{
	public int setGrowingSpeed(int level);//������������Ҫ�ľ���
	public int deadExp(int level);//��������ʱ��Ӧ�ȼ�����ľ���ֵ
	public boolean canLevelup(NumenAbstract n);//�жϵ�ǰ�����ܷ�����
	public int getLevelupPoint(int level);//��������ʱ��Ӧ�ȼ����صĵ���
}
