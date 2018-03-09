package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������Ԫ��
 * 
 * �����ṩͳһ�ı���Ԫ�صķ�ʽ:������ģʽ
 * 
 * �����ṩ�����ڻ�ȡ������ǰ����Ԫ�صķ�����
 * Iteartor iterator()
 * 
 * java.util.Iterator
 * �������Ľӿڣ��涨�˱������ϵķ�������ѭ��ģʽ
 * Ϊ:�ʣ�ȡ��ɾ�Ĳ���
 * ����ɾ��Ԫ�ز��Ǳ��������
 * 
 * ��ͬ�ļ���ʵ���඼�ṩ��һ�����Ա�������ĵ�����
 * ʵ���ࡣ���������ס���ǵ����֣������ǵ�Iterator
 * �������ɡ�
 * 
 * @author adminitartor
 *
 */
public class Collection_iterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
		
		//��ȡ���ڱ����ü��ϵĵ�����
		Iterator it = c.iterator();
		/*
		 * boolean hasNext()
		 * �жϼ����Ƿ���Ԫ�ؿ��Ա���
		 */
		while(it.hasNext()){
			/*
			 * E next()
			 * ȡ��������һ�����Ա�����Ԫ��
			 */
			String str = (String)it.next();
			System.out.println(str);
			if("#".equals(str)){
				/*
				 * ��ʹ�õ�������������Ԫ�صĹ���
				 * �У�����ͨ�����ϵķ�����ɾԪ��
				 * ����������������������ϵ��쳣
				 */
//				c.remove(str);
				/*
				 * ��������remove��ɾ��ͨ��next
				 * ����ȡ����Ԫ��
				 */
				it.remove();
			}
		}
		
		System.out.println(c);
	}
}












