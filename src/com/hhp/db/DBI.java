package com.hhp.db;

public interface DBI {
	String db_name = "qsxyy.db";//���ݿ���
	String table_use = "t_user";//�û���
	String table_word = "t_word";//���ʱ�
	public boolean getUserInfo();//��ȡ�û���Ϣ   true:�޸ĳɹ�  false:�޸�ʧ��
	public boolean saveUserInfo();//�����û���Ϣ
	public boolean changeUserInfo();//�޸��û���Ϣ
	public String getWord();
}
