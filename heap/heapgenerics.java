package heap;

import java.util.ArrayList;

public class heapgenerics<T extends Comparable<T>> {

	private ArrayList<T> data = new ArrayList<>();

	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public void add(T item) {
		// int pi=(ci-1)/2;
		data.add(item);
		upheapify(data.size() - 1);
	}

	public void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (data.get(ci).compareTo(data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	public void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);

	}

	public T remove() {
		swap(0, data.size() - 1);
		T temp = data.remove(data.size() - 1);
		downheapify(0);
		return temp;
	}

	private void downheapify(int pi) {
		int mini = pi;
		int li = 2 * pi + 1;
		int ri = 2 * pi + 2;
		if (li < data.size() && (data.get(mini).compareTo(data.get(li))) < 0) {
			mini = li;

		}
		if (ri < data.size() && (data.get(mini).compareTo(data.get(ri))) < 0) {
			mini = ri;

		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	public T get() {
		return data.get(0);
	}

}
