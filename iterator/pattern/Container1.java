public class Container1 implements Container {

    //collection of some type in some structure
    private List<E> collection;
    private int position = 0;

    public Container1(List<E> collection) {
        this.collection = collection;
    }

    //some specific operations for Container like add, remove, get etc.

    @Override
    public Iterator getIterator() {
        return new Iterator1();
    }

    private class Iterator1 implements Iterator1 {

        @Override
        public boolean hasNext() {
            if(position >= collection.size() || collection.get(position) == null)
                return false;
            else
                return true;
        }

        @Override
        public boolean hasPrevious() {
            if(position < 0 || collection.get(position) == null)
                return false;
            else
                return true;
        }

        @Override
        public E next() {
            E item = collection.get(position);
            position++;
            return item;
        }

        @Override
        public E previous() {
            E item = collection.get(position);
            position--;
            return item;
        }

        @Override
        public void remove() {
            if(position >= 0 && collection.get(position) != null)
                collection.remove(position);
        }
    }
}