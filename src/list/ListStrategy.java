package list;

public interface ListStrategy <T>
{
    MyNode<T> add(MyNode<T> head, MyNode<T> node);

    MyNode<T> remove(MyNode<T> head);

}
