package com.example;

public class Results {

	int num;
	String operation;
	
	public Results(int num, String operation) {
		super();
		this.num = num;
		this.operation = operation;
	}
	
	
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}
	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	@Override
	public String toString() {
		return String.format("Result [result=%s, operation=%s]", num, operation);
	}
	
}
