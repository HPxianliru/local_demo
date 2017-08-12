package com.xlr.demo.entity;

import java.lang.Thread.State;

public class ThreadStats implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 线程类型
	 */
	private String threadType;
	/**
	 * 线程名字
	 */
	private String treadName;
	/**
	 * 线程状态
	 */
	private State threadState;
	/**
	 * 线程ID
	 */
	private String threadId;
	/**
	 * 阻塞时间
	 */
	private long blockedTime;
	/**
	 * 等待时间
	 */
	private long waitedTime;
	/**
	 * 堆栈转储堆栈跟踪元素的数组
	 */
	private String stackTrace;
	
	public String getTreadName() {
		return treadName;
	}
	public void setTreadName(String treadName) {
		this.treadName = treadName;
	}

	public State getThreadState() {
		return threadState;
	}
	public void setThreadState(State threadState) {
		this.threadState = threadState;
	}
	public String getThreadId() {
		return threadId;
	}
	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}
	public long getBlockedTime() {
		return blockedTime;
	}
	public void setBlockedTime(long blockedTime) {
		this.blockedTime = blockedTime;
	}
	public long getWaitedTime() {
		return waitedTime;
	}
	public void setWaitedTime(long waitedTime) {
		this.waitedTime = waitedTime;
	}
	public String getStackTrace() {
		return stackTrace;
	}
	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
	public String getThreadType() {
		return threadType;
	}
	public void setThreadType(String threadType) {
		this.threadType = threadType;
	}
	@Override
	public String toString() {
		return "ThreadStats [treadName=" + treadName + ", threadState=" + threadState + ", threadId=" + threadId
				+ ", blockedTime=" + blockedTime + ", waitedTime=" + waitedTime + ", stackTrace=" + stackTrace + "]";
	}
	
	
}

