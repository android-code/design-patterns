public class Caretaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index)
    }

    public int getSize() {
        return mementos.size();
    }
}