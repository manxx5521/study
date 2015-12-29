package com.xiaoshabao.workflow.jdbc;

import com.xiaoshabao.workflow.value.DaoType;

/**
 * 工作流的数据连接层的工厂类<br>
 * 根据参数的不同产生不同dao层实现
 */
public class FlowDaoManager {

	/**
	 * 数据连接工厂获取方法<br>
	 * 方法会根据传入参数不同实例化不同的具体实现dao。
	 * @param type 这是一个枚举类型变量DaoType。
	 * @return FlowDao 返回工作流的通用dao的接口类。
	 * @see FlowDao
	 */
	public static FlowDao getfactory(DaoType type) {
		FlowDao flowdao = null;
		try {
			switch (type) {
			case JDBC:
				flowdao = new JDBCDao();
				break;
			case HIBERNATE:
				flowdao = new HibernateDao();
				break;
			default:

				break;
			}

			return flowdao;
		} catch (Exception e) {
			return null;
		}
	}

}
