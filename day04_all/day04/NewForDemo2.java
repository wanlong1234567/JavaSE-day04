package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ʹ����ѭ����������
 * @author adminitartor
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		/*
		 * ��ѭ�������µ��﷨��JVM�����Ͽ���ѭ����
		 * ��ѭ���Ǳ������Ͽɵģ���������������
		 * ʹ����ѭ����������ʱ���Ὣ����ı�Ϊʹ
		 * �õ�����������
		 * ����ʹ����ѭ���������ϵĹ������ǲ���ͨ
		 * �����ϵķ�����ɾԪ�صġ�
		 */
		for(Object o : c){
//		Iterator it = c.iterator();
//		while(it.hasNext()){
//			Object o = it.next();
			String str = (String)o;
			System.out.println(str);
			if("#".equals(str)){
				c.remove(str);//ɾ�����´α��������쳣
			}
		}
	}
}





