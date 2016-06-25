package list;

public class LockDList extends DList {
	
	@Override
	  protected LockDListNode newNode(Object item, DListNode prev, DListNode next) {
		    return new LockDListNode(item, prev, next);
	  }
	
	public void lockNode(DListNode node){
		//Notice the brackets
		((LockDListNode)node).islocked = true;
	}
	
	public void remove(DListNode node){
		if(((LockDListNode)node).islocked == false){
			super.remove(node);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       LockDList l = new LockDList();
       System.out.println("The list is empty:" + l.isEmpty());
       Object o = "1";
       l.insertFront(o);
       o = "2";
       l.insertFront(o);
       o = "3";
       l.insertBack(o);
       o = "4";
       l.insertBefore(o, head.prev);
       o = "5";
       l.insertAfter(o, head.next.next);
       System.out.println(l.toString());
       
       System.out.println("5 is locked:" + ((LockDListNode)head.next.next.next).islocked);
       l.remove(head.next.next.next);
       System.out.println("After removing 5:" + l.toString());
       
       System.out.println("1 is locked:" + ((LockDListNode)head.next.next).islocked);
       l.lockNode(head.next.next);
       System.out.println("1 is locked:" + ((LockDListNode)head.next.next).islocked);
       l.remove(head.next.next);
       System.out.println("After removing 1:" + l.toString());
	}

}
