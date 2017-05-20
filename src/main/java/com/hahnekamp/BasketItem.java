package com.hahnekamp;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hahnekamp.json.BasketItemDeserializer;
import com.hahnekamp.json.BasketItemSerializer;

/**
 * Created by rainerh on 07.11.16.
 *
 * If you want to use serialization by annotation you have to uncomment the two annotations
 * below and comment the @Service in BasketItemJsonModule.
 */
@JsonDeserialize(using = BasketItemDeserializer.class)
@JsonSerialize(using = BasketItemSerializer.class)
public class BasketItem {
  private String product;
  private String code;
  private int amount;

  public BasketItem() {
  }

  public String getProduct() { return product; }

  public void setProduct(String product) {
    this.product = product;
  }

  public String getCode() { return code; }

  public void setCode(String code) {
    this.code = code;
  }

  public int getAmount() { return amount; }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
