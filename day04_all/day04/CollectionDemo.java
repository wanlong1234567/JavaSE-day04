package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * ����ֻ����������͵�Ԫ��
 * ���Ҽ��ϴ�ŵ���Ԫ�ص�����(��ַ)
 * @author adminitartor
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Point p = new Point(1,2);
		c.add(p);
		System.out.println("p:"+p);//p:(1,2)
		System.out.println("c:"+c);//c:[(1,2)]
		
		p.setX(2);
		System.out.println("p:"+p);//p:(2,2)
		System.out.println("c:"+c);//c:[(2,2)]
	}
}








