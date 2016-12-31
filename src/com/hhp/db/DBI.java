package com.hhp.db;

public interface DBI {
	String db_name = "qsxyy.db";//数据库名
	String table_use = "t_user";//用户表
	String table_word = "t_word";//单词表
	public boolean getUserInfo();//读取用户信息   true:修改成功  false:修改失败
	public boolean saveUserInfo();//保存用户信息
	public boolean changeUserInfo();//修改用户信息
	public String getWord();
}
