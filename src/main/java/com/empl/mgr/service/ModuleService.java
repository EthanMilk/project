package com.empl.mgr.service;

import com.empl.mgr.constant.MethodType;
import com.empl.mgr.support.JSONReturn;

public abstract interface ModuleService {

	/**
	 * @author 123
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findMenu(String acctName);

	/**
	 * @author 123
	 * @param moduleCode
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findModuleParameter(String moduleCode, String acctName);

	/**
	 * @author 123
	 * @param moduleCode
	 * @return
	 */
	public abstract JSONReturn findBreadcrumb(String moduleCode);

	/**
	 * @author 123
	 * @param roleId
	 * @return
	 */
	public abstract JSONReturn findAllModule(long roleId);

	/**
	 * @author 123
	 * @param rold
	 * @param code
	 * @param type
	 * @param add
	 * @return
	 */
	public abstract JSONReturn setRoleSecureValid(long rold, String code, int type, boolean add);

	/**
	 * @author 123
	 * @param userName
	 * @param code
	 * @param type
	 * @return
	 */
	public abstract boolean secureValid(String userName, String[] code, MethodType type);

}
