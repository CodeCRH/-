package LevelPack;

import NumenPack.NumenAbstract;

//�ȼ����������
public abstract class LevelAbsteract implements LevelInterFace
{
	public abstract int setGrowingSpeed(int level);//������������Ҫ�ľ���
	public abstract int deadExp(int level);//��������ʱ��Ӧ�ȼ�����ľ���ֵ
	public abstract boolean canLevelup(NumenAbstract n);//�жϵ�ǰ�����ܷ�����
	public abstract int getLevelupPoint(int level);//��������ʱ��Ӧ�ȼ����صĵ���
}
