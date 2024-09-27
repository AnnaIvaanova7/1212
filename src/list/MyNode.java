package list;

public class MyNode<T>
{
    private T value;
    private MyNode<T> next;

    public MyNode(T value)
    {
        this.value = value;
        this.next = null;
    }

    public T getValue()
    {
        return value;
    }

    public MyNode<T> getNext()
    {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}
