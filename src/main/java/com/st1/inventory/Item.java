package com.st1.inventory;

import com.st1.core.Context;

public interface Item {

    void pickup(Context context);

    void pickup(Context context, boolean silent);


    void destroy();

    void setQuantity(Integer newQuantity);

    String getName();

    String getId();

    String getDescription ();

    String getPickupMessage ();

    Integer getQuantity();

    String getImagePath();

}
