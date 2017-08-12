package com.xlr.demo.entity;

import java.util.List;

public class MyThreadInfo implements java.io.Serializable {  
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
      * 线程名字
      */
     private String threadName;
     /**
      * 仍活动的线程总数
      */
     private int threadCount;
     /**
      * 峰值
      */
     private int maxThread;
     /**
      * 线程总数（被创建并执行过的线程总数）
      */
     private long usedThread;
     /**
      * 当初仍活动的守护线程（daemonThread）
      */
     private int daemonThread;
     /**
      * 
      */
     private List<ThreadStats> threadStats;
     
	public List<ThreadStats> getThreadStats() {
		return threadStats;
	}
	public void setThreadStats(List<ThreadStats> threadStats) {
		this.threadStats = threadStats;
	}
	public String getThreadName() {
		return threadName;
	}
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	public int getThreadCount() {
		return threadCount;
	}
	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}
	public int getMaxThread() {
		return maxThread;
	}
	public void setMaxThread(int maxThread) {
		this.maxThread = maxThread;
	}
	public long getUsedThread() {
		return usedThread;
	}
	public void setUsedThread(Long usedThread) {
		this.usedThread = usedThread;
	}
	public int getDaemonThread() {
		return daemonThread;
	}
	public void setDaemonThread(int daemonThread) {
		this.daemonThread = daemonThread;
	}
	@Override
	public String toString() {
		return "MyThreadInfo [threadName=" + threadName + ", threadCount=" + threadCount + ", maxThread=" + maxThread
				+ ", usedThread=" + usedThread + ", daemonThread=" + daemonThread + "]";
	}
     
}
