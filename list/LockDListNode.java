package list;

public class LockDListNode extends DListNode{
	
	protected boolean islocked;

	LockDListNode(Object i, DListNode p, DListNode n) {
		super(i, p, n);
		islocked = false;
		// TODO Auto-generated constructor stub
	}

}
