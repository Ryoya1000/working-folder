package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private int count;
	private String pay;


	public String execute(){
		String result = SUCCESS;


		 //countキーで個数情報(jspから値を取得)を格納
		session.put("count", count);

		//sessionから個数情報を取得
		int intCount = Integer.parseInt(session.get("count").toString());

		//sessionから商品価格情報を取得
		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());

		//total_priceキーで合計価格を格納
		session.put("total_price", intCount * intPrice);

		String payment;

		//現金払いの場合、"現金払い"をpaymentへ代入し、payキーで格納。
		if(pay.equals("1")) {
			payment = "現金払い";
			session.put("pay",payment);

		//クレジットの場合、"クレジットカード"をpaymentへ代入し、payキーで格納。
		}else {
			payment ="クレジットカード";
			session.put("pay",payment);
		}
		return result;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
