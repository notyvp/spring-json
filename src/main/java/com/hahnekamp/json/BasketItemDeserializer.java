package com.hahnekamp.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.hahnekamp.BasketItem;

import java.io.IOException;

/**
 * Created by rainerh on 19.11.16.
 */
public class BasketItemDeserializer extends JsonDeserializer<BasketItem> {
  @Override
  public BasketItem deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
    throws IOException, JsonProcessingException {
    ObjectCodec objectCodec = jsonParser.getCodec();
    JsonNode jsonNode = objectCodec.readTree(jsonParser);

    BasketItem basketItem = new BasketItem();
    basketItem.setProduct(jsonNode.get("detail").get("product").asText());
    basketItem.setCode(jsonNode.get("detail").get("code").asText());
    basketItem.setAmount(jsonNode.get("amount").asInt());

    return basketItem;
  }
}
