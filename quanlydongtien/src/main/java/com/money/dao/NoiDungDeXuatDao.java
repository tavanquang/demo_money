package com.money.dao;

import java.util.List;

import com.money.entity.NoiDungDeXuat;
import com.money.entity.PhieuDeXuat;

public interface NoiDungDeXuatDao {

	public List<NoiDungDeXuat> getAll();

	public List<NoiDungDeXuat> getAllByIdPhieu(PhieuDeXuat phieuDeXuat);
	
	public void AddNoiDungDeXuat(NoiDungDeXuat noiDungDeXuat);

	public void EditNoiDungDeXuat(NoiDungDeXuat noiDungDeXuat);

	public void RemoveNoiDungDeXuat(NoiDungDeXuat noiDungDeXuat);

	public NoiDungDeXuat getNoiDungDeXuat(int id);

}
