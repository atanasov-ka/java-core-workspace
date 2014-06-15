package com.hackbulgaria.aatanasov.problems3;

import org.junit.runners.ParentRunner;

public class StackImp implements com.hackbulgaria.aatanasov.problems3.Stack {
	protected Object[] mArray;
	protected int mLength;
	protected int mBoundary;

	public StackImp() {
		mLength = 0;
		mBoundary = 2;
		mArray = new Object[mBoundary];
	}

	public final StackImp push(Object aItem) {
		resize();
		mArray[mLength] = aItem;

		++mLength;
		return this;
	}

	public StackImp pop() {
		if (mLength > 0) {
			mArray[mLength - 1] = null;
			--mLength;
		}

		return this;
	}

	final public int length() {
		return mLength;
	}

	final public Object peek() {
		return mLength > 0 ? mArray[mLength - 1] : null;
	}

	private void resize() {
		if (mBoundary > mLength) {
			return;
		}

		Object temp[] = mArray;
		mBoundary *= 2;
		mArray = new Object[mBoundary];

		for (int i = 0; i < mLength; i++) {
			mArray[i] = temp[i];
		}
	}
	
	private class StackImplUnique extends StackImp implements StackUnique {

		
		public boolean push(Object aItem) {
			if (contains(aItem))
				return false;
			StackImp.this.push(aItem);
			return true;
		}
		
		private boolean contains(Object aItem) {
			for (int i = 0; i < mLength; i++) {
				if (mArray[i].equals(aItem))
					return true;
			}
			return false;
		}			
	}

	
}
