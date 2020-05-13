package com.correction.TD.ex6;

public class MysqlDecorateur extends ServiceDecorateur {

	public MysqlDecorateur(Service s) {
		this.service = s;
		this.setDesc(this.service.getDesc() + " Mysql ");
		this.setPrix(this.service.getPrix() + 1500);
	}

}
