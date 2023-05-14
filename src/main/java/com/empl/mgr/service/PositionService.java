package com.empl.mgr.service;

import com.empl.mgr.support.JSONReturn;

public abstract interface PositionService {

	/**
	 * @author 123
	 * @param page
	 * @param deptId
	 * @param searchValue
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findPositionListInfo(int page, long deptId, String searchValue, String acctName);

	/**
	 * @author 123
	 * @param deptId
	 * @param name
	 * @param desc
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn addPosition(long deptId, String name, String desc, String acctName);

	/**
	 * @author 123
	 * @param page
	 * @param deptId
	 * @param searchValue
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findPositionPage(int page, long deptId, String searchValue, String acctName);

	/**
	 * @author 123
	 * @param id
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn deletePosition(long id, String acctName);

	/**
	 * @author 123
	 * @param id
	 * @return
	 */
	public abstract JSONReturn findPositionById(long id);

	/**
	 * @author 123
	 * @param id
	 * @param deptId
	 * @param name
	 * @param desc
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn modifyPosition(long id, long deptId, String name, String desc, String acctName);

	/**
	 * @author 123
	 * @param deptId
	 * @return
	 */
	public abstract JSONReturn findPositionByDeptId(long deptId);

}
