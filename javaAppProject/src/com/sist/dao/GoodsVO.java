package com.sist.dao;

import lombok.Data;

/*
 *   NO                                                 NUMBER(38)
 GOODS_NAME                                         VARCHAR2(4000)
 GOODS_SUB                                          VARCHAR2(4000)
 GOODS_PRICE                                        VARCHAR2(26)
 GOODS_DISCOUNT                                     NUMBER(38)
 GOODS_FIRST_PRICE                                  VARCHAR2(26)
 GOODS_DELIVERY                                     VARCHAR2(26)
 GOODS_POSTER                                       VARCHAR2(4000)
 HIT                                                NUMBER(38)
 */
@Data
public class GoodsVO {
   private int no,goods_discount,hit;
   private String goods_sub,goods_name,goods_price,goods_first_price,goods_poster, goods_delivery;
}
