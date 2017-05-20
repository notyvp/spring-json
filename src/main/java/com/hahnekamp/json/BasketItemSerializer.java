package com.hahnekamp.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.hahnekamp.BasketItem;

import java.io.IOException;

/**
 * Created by rainerh on 18.05.17.
 */
public class BasketItemSerializer extends JsonSerializer<BasketItem> {
  @Override
  public void serialize(
    BasketItem basketItem, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
    throws IOException, JsonProcessingException {
    jsonGenerator.writeStartObject();
    jsonGenerator.writeObjectFieldStart("detail");
    jsonGenerator.writeStringField("product", basketItem.getProduct());
    jsonGenerator.writeStringField("code", basketItem.getCode());
    jsonGenerator.writeEndObject();
    jsonGenerator.writeNumberField("amount", basketItem.getAmount());
    jsonGenerator.writeEndObject();
  }
}
