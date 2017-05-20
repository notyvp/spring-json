package com.hahnekamp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rainerh on 07.11.16.
 */
@RestController
public class BasketController {
  @RequestMapping(path = "/addToBasket")
  public List<BasketItem> addToBasket(@RequestBody BasketItem basketItem) {
    return Arrays.asList(basketItem);
  }
}

