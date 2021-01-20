package com.example;

public class ItemBagIterator implements SampleIterator {
    private ItemBag itemBag;

    private int index;

    public ItemBagIterator(ItemBag itemBag) {
        super();
        this.itemBag = itemBag;
        this.index = 0;
    }

    @Override
    public Object next(){
        Item item = itemBag.getItem(this.index);
        this.index++;

        return item;
    }

    @Override
    public boolean hasNext() {
        if (index < itemBag.getLast()) {
            return true;
        } else {
            return false;
        }
    }
}
