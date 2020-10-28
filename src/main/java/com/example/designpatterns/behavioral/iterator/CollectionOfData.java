package com.example.designpatterns.behavioral.iterator;

public class CollectionOfData implements Container {
    String[] objects = {"alfa", "beta", "gamma", "delta", "echo"};
    @Override
    public Iterator getIterator() {
        return new CollectionIterator();
    }

    private class CollectionIterator implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            return i < objects.length;
        }

        @Override
        public Object get() {
            return (hasNext()) ? objects[i] : null;
        }

        @Override
        public void next() {
            i++;
        }
    }
}
