package list;

public class StackStrategy<T> implements ListStrategy<T>
{
    @Override    public MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode)
    {
        newMyNode.setNext(head);
        return newMyNode;
    }

    @Override
    public MyNode<T> remove(MyNode<T> head) {
        MyNode<T> NewNode = head;
        while (NewNode.getNext() != null)
        {
            NewNode = NewNode.getNext();
        }
        NewNode.setValue(null);
        return head;
    }


}
