//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private String listString;
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		// Initialize queue and stack
		this.queue = new LinkedList<>();
		this.stack = new Stack<>();

		// Set list
		setList("");
	}

	public PalinList(String list)
	{
		// Initialize queue and stack
		this.queue = new LinkedList<>();
		this.stack = new Stack<>();

		// Set list
		setList(list);
	}

	public void setList(String list)
	{
		// Remove all spaces
		listString = list;
		String[] listArray = list.split(" ");

		// Fill in queue and stack
		for (String word : listArray) {
			queue.add(word);
			stack.push(word);
		}
	}

	public boolean isPalin()
	{
		// If the item from queue removed not is the same as the item from stack removed, we already know it's not a palin.
		while (!queue.isEmpty()) {
			if (!queue.remove().equals(stack.pop())) {
				return false;
			}
		}

		// If it is, then it's a palin.
		return true;
	}

	//write a toString method
	public String toString() {
		// Determine what to put at the end
		String ender = "";
		if (isPalin()) {ender = "is a palinlist.";}
		else {ender = "is not a palinlist.";}


		// Print
		return Arrays.toString(listString.split(" ")) + " " + ender;
	}
}
