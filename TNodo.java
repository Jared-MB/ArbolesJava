class TNodo {
	private int info;
	private TNodo left;
	private TNodo right;
	TNodo(){
		info = Integer.MIN_VALUE;
		left = null;
		right = null;
	}
	TNodo(int info) {
		this.info = info;
		this.left = null;
		this.right = null;
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public TNodo getLeft() {
		return left;
	}
	public void setLeft(TNodo left) {
		this.left = left;
	}
	public TNodo getRight() {
		return right;
	}
	public void setRight(TNodo right) {
		this.right = right;
	}
}