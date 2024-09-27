package list;

public class Main
{
    public static void main(String[] args)
    {

        QueueStrategy<Integer> queueStrategy = new QueueStrategy<>();
        StackStrategy<Integer> stackStrategy = new StackStrategy<>();
        MyList<Integer> listic = new MyList<Integer>();
        listic.setListStrategy(queueStrategy);
        listic.add(1);
        listic.add(2);
        listic.setListStrategy(stackStrategy);
        listic.add(4);
        listic.add(8);
        System.out.println("List before:");
        MyNode<Integer> lumine1 = listic.getHead();
        while(lumine1 != null)
        {
            System.out.println(lumine1.getValue());
            lumine1 = lumine1.getNext();
        }
        int size1 = listic.getSize();
        System.out.println("size:");
        System.out.println(   size1);
    }
}
