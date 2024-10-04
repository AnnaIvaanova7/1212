package list;

public class Main
{
    public static void main(String[] args)
    {

        QueueStrategy<Integer> queueStrategy = new QueueStrategy<>();
        StackStrategy<Integer> stackStrategy = new StackStrategy<>();
        MyList<Integer> list = new MyList<Integer>();
        list.setListStrategy(queueStrategy);
        list.add(1);
        list.add(2);
        list.setListStrategy(stackStrategy);
        list.add(4);
        list.add(8);
        System.out.println("List before:");
        MyNode<Integer> lumin1 = list.getHead();
        while(lumin1 != null)
        {
            System.out.println(lumin1.getValue());
            lumin1 = lumin1.getNext();
        }
        int size1 = list.getSize();
        System.out.println("size:");
        System.out.println(   size1);
    }
}
