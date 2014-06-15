package com.swipesort.swipesorter;

public class SwipeSorter {
	private static class SwipeNode {
		private int mItem;
		private SwipeNode mLeft;
		private SwipeNode mRight;
		
		public SwipeNode(int aItem, SwipeNode aLeft, SwipeNode aRight) {
			mLeft = aLeft;
			setRight(aRight);
			mItem = aItem;
		}
		
		public SwipeNode(int aItem) {
			this(aItem, null, null);
		}
		
		public SwipeNode getLeft() {
			return mLeft;
		}
		
		public void setLeft(SwipeNode mLeft) {
			this.mLeft = mLeft;
		}
		
		public int getItem() {
			return mItem;
		}

		public SwipeNode getRight() {
			return mRight;
		}

		public void setRight(SwipeNode mRight) {
			this.mRight = mRight;
		}
	}
	
	private static class SwipeChain {
		private SwipeNode smaller;
		private SwipeNode bigger;
		private SwipeNode current;
		private int size;
		
		public void insert(SwipeNode aItem) {
			if (current == null)
			{
				current = aItem;
				bigger = aItem;
				smaller = aItem;
			}
			else
			{
				if (aItem.getItem() < current.getItem())
				{
					findLeftPosiotion(aItem);
				}
				else
				{
					findRightPosition(aItem);
				}
			}
			size++;
			print(mChain.getResult());
		}
		
		private void print(int[] result) {
			System.out.println();
			for (int i : result) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

		private void findRightPosition(SwipeNode aItem) {
			boolean isInserted = false;
			while (current.getRight() != null) 
			{
				if (current.getRight().equals(current.getLeft()))
				{
					System.err.println("Zaciklqne v findRight");
					break;
				}
				
				current = current.getRight();
				if (current.getItem() >= aItem.getItem())
				{
					SwipeNode theRight = current.getRight();
					SwipeNode theLeft = current;
					current = aItem;
					current.setLeft(theLeft);
					current.setRight(theRight);
					if (theRight != null)
						theRight.setLeft(current);
					
					theLeft.setRight(current);
					isInserted = true;
					
					break;
				}
			}
			if (!isInserted)
			{
				SwipeNode theLeft = current;
				current.setRight(aItem);
				current = aItem;
				current.setLeft(theLeft);
				bigger = current;
			}
		}

		private void findLeftPosiotion(SwipeNode aItem) {
			boolean isInserted = false;
			
			while (current.getLeft() != null)
			{
				if (current.getLeft().equals(current.getRight()))
				{
					System.err.println("Zaciklqne v findLeft");
					break;
				}
				
				current = current.getLeft();
				if (current.getItem() <= aItem.getItem())
				{
					SwipeNode theLeft = current;
					SwipeNode theRight = current.getRight();
					current = aItem;
					current.setLeft(theLeft);
					current.setRight(theRight);
					theRight.setLeft(current);
					if (theLeft != null)
						theLeft.setRight(current);
					
					isInserted = true;
					break;
				}
			}
			if (!isInserted)
			{
				SwipeNode theRight = current;
				current.setLeft(aItem);
				current = aItem;
				current.setRight(theRight);
				smaller = current;
			}
		}

		public SwipeChain () {
			smaller = null;
			bigger = null;
			current = null;
			size = 0;
		}
		
		public int[] getResult() {
			SwipeNode it = smaller;
			int[] result = new int[this.size];
			int i = 0;
			do {
				result[i] = it.getItem();
				++i;
				it = it.getRight();
			}
			while (it != null);
		
			return result;
		}
	}
	
	public SwipeSorter(){}
	private static SwipeChain mChain = null; 
	public static void sort(int[] array) {
		int[] tempArray = new int[array.length];
		for (int i = 0; i < tempArray.length; i++)
			tempArray[i] = array[i];
		
		mChain = new SwipeChain();
		for (int i : tempArray) {
			mChain.insert(new SwipeNode(i));
		}
		int[] res = mChain.getResult();
		for (int i = 0; i < res.length; i++) {
			array[i] = res[i];
		}
	}
}
