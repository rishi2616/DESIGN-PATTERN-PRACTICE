package com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.shoppinglistexampleold;

import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.HomeDecorShoppingItem;
import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

/**
 * Created by kingshuk on 11/7/17.
 */
public class HomeDecorShoppingListBuilder implements ShoppingListBuilder {

    private ShoppingListItem listItem=new HomeDecorShoppingItem();

    @Override
    public void addShoppingItem(String itemName, Double itemPrice) {
        listItem.setItemPrice(itemPrice);
        listItem.setItemName(itemName);
    }

    @Override
    public ShoppingListItem getListItem() {
        return listItem;
    }
}
