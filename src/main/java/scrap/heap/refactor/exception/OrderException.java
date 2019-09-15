package scrap.heap.refactor.exception;

public class OrderException extends Exception {

	private static final long serialVersionUID = 1L;

	String errMsg;
	String errReason;

	public OrderException(String errMsg, String errReason) {
		this.errMsg = errMsg;
		this.errReason = errReason;
	}

	@Override
	public String toString() {

		return errMsg + ": " + errReason;
	}

}
