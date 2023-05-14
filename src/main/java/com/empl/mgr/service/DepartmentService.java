package com.empl.mgr.service;

import com.empl.mgr.support.JSONReturn;

public abstract interface DepartmentService {

	/**
	 * @author 123
	 * @param page
	 * @param searchValue
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findDepartmentList(int page, String searchValue, String acctName);

	/**
	 * @author 123
	 * @param page
	 * @param searchValue
	 * @return
	 */
	public abstract JSONReturn findDepartmentCount(int page, String searchValue);

	/**
	 * @author 123
	 * @param deptId
	 * @return
	 */
	public abstract JSONReturn findDepartmentById(long deptId);

	/**
	 * @author 123
	 * @param deptId
	 * @param name
	 * @param desc
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn modifyDepartment(long deptId, String name, String desc, String acctName);

	/**
	 * @author 123
	 * @param name
	 * @param desc
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn addDepartment(String name, String desc, String acctName);

	/**
	 * @author 123
	 * @param deptId
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn deleteDepartment(long deptId, String acctName);

	/**
	 * @author 123
	 * @return
	 */
	public abstract JSONReturn findAllDepartment();

	/**
	 * @author 123
	 * @param deptId
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findDeptEmplList(long deptId, String acctName);

	/**
	 * @author 123
	 * @param deptId
	 * @param emplId
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn setPrincipal(long deptId, long emplId, String acctName);

}
