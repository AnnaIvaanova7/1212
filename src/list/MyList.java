package list;

public class MyList<T>
{
    private MyNode<T> head;
    private int size;

    public MyList(MyNode<T> head, int size)
    {
        this.head = head;
        this.size = size;
    }

    public MyNode<T> getHead()
    {
        return head;
    }

    public int getSize()
    {
        return size;
    }

    public void add(T element)
    {
        MyNode<T> node = new MyNode<T>(element);
        MyNode<T> iter = head;
        if (head == null)
        {
            head = node;
        }
        else
        {
            while (iter.getNext() != null)
            {
                iter = iter.getNext();
            }
            iter = node;
        }
        size++;
    }
    public void remove()
    {
        MyNode<T> node = head;
        head = head.getNext();
        node = null;
        size--;
    }

    public void addHead(T element)
    {
        MyNode<T> node = new MyNode<T>(element);
        if (head != null)
        {
            node.setNext(head);
        }
        head = node;
        size++;

    }



}
