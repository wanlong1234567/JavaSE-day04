package day04;

import day02.Point;

public class Demo {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		System.out.println("p:"+p);//(1,2)
		/*
		 * java�����������ݷ�ʽֻ��һ��:ֵ����
		 * ����ֻ�ǽ�p�����ֵ(��ַ)�����˷���
		 * �еĲ���p1
		 */
		test(p);
		System.out.println("p:"+p);//(?,?)
	}
	
	public static void test(Point p1){
		/*
		 * p1������pָ��ͬһ���������Խ���x
		 * ֵ���Ըı�Ϊ2,main�����е�p������
		 * Ҳ�Ǹĺ��Ч��
		 */
		p1.setX(2);
		/*
		 * p1����ָ��һ���´����Ķ��󣬵��ǲ���
		 * Ӱ��main�����е�p��ԭ����������á�
		 */
		p1 = new Point(3,4);
	}
	
}




