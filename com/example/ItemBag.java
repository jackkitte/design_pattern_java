package com.example;

public class ItemBag implements Aggregate {
    private Item[] itemArray;

    private int last = 0;

    public ItemBag(int maxSize) {
        super();
        this.itemArray = new Item[maxSize];
    }

    public void add(Item item) {
        itemArray[last] = item;
        last++;
    }

    public Item getItem(int index) {
        return itemArray[index];
    }

    public int getLast() {
        return last;
    }

    @Override
    public SampleIterator iterator() {
        return new ItemBagIterator(this);
    }
}
