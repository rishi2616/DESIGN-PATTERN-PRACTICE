package com.kingshuk.designpatterns.behavioralpatterns.strategypattern.assignment;

public class Pair<X, Y> {

	public final X first;
	public final Y second;

	public Pair(X first, Y second) {
		this.first = first;
		this.second = second;
	}

	public X getFirst() {
		return first;
	}

	public Y getSecond() {
		return second;
	}
	
	
}
