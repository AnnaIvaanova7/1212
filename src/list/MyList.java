package list;

public class MyList<T>
{
    private MyNode<T> head;
    private int size;

    private ListStrategy<T> listStrategy;

    public ListStrategy<T> getListStrategy() {
        return listStrategy;
    }

    public void setListStrategy(ListStrategy<T> listStrategy) {
        this.listStrategy = listStrategy;
    }

    public MyList(MyNode<T> head, int size)
    {
        this.head = head;
        this.size = size;
    }

    public MyList()
    {
        head = null;
        size=0;
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
