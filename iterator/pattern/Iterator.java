public interface Iterator<E> {

    boolean hasNext();
    boolean hasPrevious();
    E next();
    E previous();
    void remove();
    //could be also some action methods
}