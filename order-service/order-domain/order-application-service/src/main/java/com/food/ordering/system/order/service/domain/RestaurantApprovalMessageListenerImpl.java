package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;
import com.food.ordering.system.order.service.domain.ports.input.message.listener.restaurantapproval.RestaurantApprovalResponseMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
public class RestaurantApprovalMessageListenerImpl implements RestaurantApprovalResponseMessageListener {

   @Override
   public void oderApproved(RestaurantApprovalResponse restaurantApprovalResponse) {

   }

   @Override
   public void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse) {

   }
}
