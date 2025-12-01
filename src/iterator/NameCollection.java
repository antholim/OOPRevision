package iterator;

public class NameCollection implements Container {
    private String[] names = {"Anthony", "Noah", "Emma", "Liam"};

    @Override
    public Iterator createIterator() {
        return new NameIterator();
    }

    // Inner class that implements the iterator
    private class NameIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
