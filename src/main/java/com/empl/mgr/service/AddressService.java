package com.empl.mgr.service;

import com.empl.mgr.support.JSONReturn;

public abstract interface AddressService {

	/**
	 * @author 123
	 * @return
	 */
	public abstract JSONReturn findProvinceAll();

	/**
	 * @author 123
	 * @param provinceId
	 * @return
	 */
	public abstract JSONReturn findCityByProvinceId(long provinceId);

	/**
	 * @author 123
	 * @param cityId
	 * @return
	 */
	public abstract JSONReturn findCountyByCityId(long cityId);

	/**
	 * @author 123
	 * @param countyId
	 * @return
	 */
	public abstract JSONReturn findTownshipByCountyId(long countyId);

	/**
	 * @author 123
	 * @param towhshipId
	 * @return
	 */
	public abstract JSONReturn findVillageByTownshipId(long towhshipId);

}
