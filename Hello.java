class Hello
{
    public static void main(String[] args)
    {
        try
        {
            singleLinkedList lst = new singleLinkedList();
            lst.insertFront(5);
            lst.insertFront(3);
            lst.insertFront(7);
            lst.insertFront(89);
            lst.insertFront(100);
            lst.insertFront(30);
            lst.insertEnd(200);
            lst.insertEnd(10);
            lst.insertInto(-10, 3);
            lst.insertInto(-20, 4);
            lst.insertInto(-100, 1);
            lst.insertInto(-300, 10);
           /*
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteFirst();
            lst.DeleteLast();
            lst.DeleteLast();
            */
            //lst.DeleteAt(3);
            //System.out.println("Head: "+lst.head());
            
            //lst.DeleteAt(5);
            System.out.print("Values: ");
            lst.Display();
            System.out.println("Head: "+lst.head());
            System.out.println("Tail: "+lst.tail());
            System.out.println("Size: "+lst.len());
            lst.DeleteAt(1);
            lst.Display();
        }
        catch(NullPointerException e)
        {
            System.out.println("-----> either the LIST is EMPTY or the referencing object is NULL <------ "+e);
        }
    }    

}