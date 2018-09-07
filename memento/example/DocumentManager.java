public class DocumentManager {

    private List<Memento> mementos = new ArrayList<>();
    private int current = 0;

    public void add(Memento memento) {
        mementos.add(memento);
        current++;
    }

    public Memento redo() {
        if(current < mementos.size() - 1)
            current += 1;
        return mementos.get(current);
    }

    public Memento undo() {
        if(current > 0)
            current -= 1;
        return mementos.get(current);
    }

    public Memento get(int number) {
        if(number >= 0 && number < mementos.size())
          return mementos.get(number);
        else
          return mementos.get(current);
    }

    public int historySize() {
        return mementos.size();
    }
}