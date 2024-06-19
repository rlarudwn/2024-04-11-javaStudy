package com.sist.dao;

import java.util.Date;

import lombok.Data;

@Data

public class ordersVO {
	private int ordid, custid, goods_id;
	private Date regdate;
}
