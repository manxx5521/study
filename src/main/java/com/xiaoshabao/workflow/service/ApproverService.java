package com.xiaoshabao.workflow.service;

import java.util.List;

import com.xiaoshabao.workflow.exception.FlowException;
import com.xiaoshabao.workflow.jdbc.FlowDao;
import com.xiaoshabao.workflow.jdbc.FlowDaoManager;
import com.xiaoshabao.workflow.value.ParamValue;

/**
 * 审核人员操作
 */
public class ApproverService {
	
	private FlowDao flowDao=FlowDaoManager.getfactory(ParamValue.getDaoTye());
	
	/**
	 * 添加审核人员
	 * <p>可以在现有人员表中查处数据，放到审核表中。<br/>
	 * 如果已经存在抛出异常
	 * </p>
	 * @param staffId
	 * @param type
	 * @param departId
	 * @throws Exception 
	 */
	public void addApprover(String staffId,String type,String departId) throws Exception,FlowException{
		if(staffId.isEmpty()||type.isEmpty()||departId.isEmpty()){
			throw new FlowException("添加审批人时，输入的信息不能为空");
		}
		String sql="select 1 from wf_m_approver a where a.approver_id=?";
		String[] params={staffId};
		List<Object[]> list=flowDao.executeQuery(sql,params);
		if(!list.isEmpty()){
			throw new FlowException("审批人已经存在");
		}
		sql="insert into wf_m_approver (approver_id,type,depart_id) values(?,?,?)";
		String[] insertParams={staffId,type,departId};
		flowDao.executeUpdate(sql, insertParams);
	}

}
