package com.empl.mgr.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.empl.mgr.model.TeAccount;
import com.empl.mgr.support.JSONReturn;

public abstract interface AccountService {

	/**
	 * @author 123
	 * @param name
	 * @param pass
	 * @param request
	 * @return
	 */
	public abstract JSONReturn login(String name, String pass, HttpServletRequest request);

	/**
	 * @author 123
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findAccountInfo(String acctName);

	/**
	 * @author 123
	 * @param httpSession
	 * @return
	 */
	public abstract JSONReturn exit(HttpSession httpSession);

	/**
	 * @author 123
	 * @param user
	 * @param nick
	 * @param pass
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn addAccount(String user, String nick, String pass, String acctName);

	/**
	 * @author 123
	 * @param page
	 * @param searchValue
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findAccountList(int page, String searchValue, String acctName);

	/**
	 * @author 123
	 * @param page
	 * @param searchValue
	 * @return
	 */
	public abstract JSONReturn findAccountPage(int page, String searchValue);

	/**
	 * @author 123
	 * @param id
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn delAccount(long id, String acctName);

	/**
	 * @author 123
	 * @param id
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn initPassword(long id, String acctName);

	/**
	 * @author 123
	 * @param id
	 * @param nickname
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn modifyNickname(long id, String nickname, String acctName);

	/**
	 * @author 123
	 * @param id
	 * @return
	 */
	public abstract JSONReturn findAccountById(long id);

	/**
	 * @author 123
	 * @param id
	 * @param account
	 * @param add
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn addAccountRole(long id, String account, boolean add, String acctName);

	/**
	 * @author 123
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findRole(String acctName);

	/**
	 * @author 123
	 * @param userName
	 * @return
	 */
	public abstract TeAccount findAccountByName(String userName);

	/**
	 * @author 123
	 * @param password
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn mdoifyPass(String password, String acctName);

}
