package com.hhj.standarddemo.model;

/**
 * @author huanghaojie
 * @date 2020/3/5.
 */
public class ItemModel {
    private String name;
    private ItemType itemType;


    public ItemModel(String name, ItemType itemType) {
        this.name = name;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }


    public void test() {
        if (itemType.getName().equals(ItemType.FRAME.getName())) ;
    }

}
