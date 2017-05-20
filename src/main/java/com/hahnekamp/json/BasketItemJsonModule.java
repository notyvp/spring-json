package com.hahnekamp.json;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.hahnekamp.BasketItem;
import org.springframework.stereotype.Service;

/**
 * Created by rainerh on 20.11.16.
 */
@Service
public class BasketItemJsonModule extends SimpleModule {
  public BasketItemJsonModule() {
    this.addDeserializer(BasketItem.class, new BasketItemDeserializer());
    this.addSerializer(BasketItem.class, new BasketItemSerializer());
  }
}
