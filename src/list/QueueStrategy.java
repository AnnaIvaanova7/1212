package list;

public class QueueStrategy<T> implements ListStrategy<T>{
    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode)
    {
        MyNode<T> iter = head;
        if (head == null)
        {
            head = newMyNode;
        }
        else
        {
            while(iter.getNext() != null)
            {
                iter = iter.getNext();
            }
            iter.setNext(head);
        }
        return head;
    }

    @Override
    public MyNode<T> remove(MyNode<T> head)
    {
        MyNode<T> NewNode = head;
        head = NewNode.getNext();
        NewNode.setValue(null);
        NewNode.setNext(null);
        return head;
    }


}
