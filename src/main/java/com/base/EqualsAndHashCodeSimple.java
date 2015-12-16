package com.base;

import java.util.HashMap;

public class EqualsAndHashCodeSimple {
	/**
	 * 测试类
	 */
	class People {
		private String name;
		private int age;

		public People() {
		}

		public People(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		/**
		 * 同一个类的hashCode吗相同 相等类的hashCode相等
		 */
		@Override
		public int hashCode() {
			return name.hashCode() * 37 + age;
		}

		/*
		 * 重写equals必须注意： 1、 自反性：对于任意的引用值x，x.equals(x)一定为true。<br/> 
		 * 2、对称性：对于任意的引用值x 和y，当x.equals(y)返回true，y.equals(x)也一定返回true。<br/>
		 * 3、传递性：对于任意的引用值x、y和ｚ，如果x.equals(y)返回true，并且y.equals(z)也返回true，那么x.equals(z)也一定返 回 true。<br/>
		 * 4、一致性：对于任意的引用值x 和 y，如果用于equals比较的对象信息没有被修改，多次调用x.equals(y)要么一致地返回true，要么一致地返回false。<br/> 
		 * 5、非空性：对于任意的非空引用值x，x.equals(null)一定返回false。<br/>
		 * 请注意：<br/>
		 * 重写equals方法后最好重写hashCode方法，否则两个等价对象可能得到不同的hashCode,这在集合框架中使用可能产生严重后果
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {// 自反
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (this.getClass() != obj.getClass()) {
				return false;
			}
			return this.name.equals(((People) obj).name)
					&& this.age == ((People) obj).age;
		}
	}

	public static void main(String[] args) {
		EqualsAndHashCodeSimple bean = new EqualsAndHashCodeSimple();
		EqualsAndHashCodeSimple.People p1 = bean.new People("Jack", 12);
		System.out.println(p1.hashCode());
		HashMap<People, Integer> hashMap = new HashMap<People, Integer>();
		hashMap.put(p1, 1);

		// 如果没有hashCode方法，这个返回为空，找不到。因为要根据hashCode确定key值
		System.out.println(hashMap.get(bean.new People("Jack", 12)));
	}
}
