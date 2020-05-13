package com.correction.TD.ex6;

public class TestMain {

	public static void main(String[] args) {

		Service spro = new Pro();

		System.out.println(spro.getDesc() + " --> " + spro.getPrix() + " DH");

		Service sproMysql = new MysqlDecorateur(spro);
		System.out.println(sproMysql.getDesc() + " --> " + sproMysql.getPrix() + " DH");

	}

}
