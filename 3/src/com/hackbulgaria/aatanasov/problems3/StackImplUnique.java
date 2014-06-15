package com.hackbulgaria.aatanasov.problems3;

public class StackImplUnique extends StackImp {

	public boolean pushUnique(Object aItem) {
		if (contains(aItem))
			return false;
		super.push(aItem);
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
