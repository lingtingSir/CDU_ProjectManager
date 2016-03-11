package org.dao;

import org.vo.*;
public interface ClientDao {
	public boolean Add(Client en);
	public boolean Validate_Login(Client en);
	public boolean Update_Pwd(Client en);
	public boolean SelectClient(Client en);
}
