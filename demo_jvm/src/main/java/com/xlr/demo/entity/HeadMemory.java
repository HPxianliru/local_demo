package com.xlr.demo.entity;

public class HeadMemory implements java.io.Serializable {

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
      * 初始内存
      */
     private long initSize;
     /**
      * 最大(上限)
      */
     private long maxSize;
     /**
      * 当前(已使用)
      */
     private long useSize; 
     /**
      * 提交申请内存
      */
     private long commitSize;
     /**
      * 使用率
      */
     private String utilizationRate;
     /**
      * head or nonhead
      */
     private String MemoryType;
     
	public String getMemoryType() {
		return MemoryType;
	}
	public void setMemoryType(String memoryType) {
		MemoryType = memoryType;
	}
	public long getInitSize() {
		return initSize;
	}
	public void setInitSize(long initSize) {
		this.initSize = initSize;
	}
	public long getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(long maxSize) {
		this.maxSize = maxSize;
	}
	public long getUseSize() {
		return useSize;
	}
	public void setUseSize(long useSize) {
		this.useSize = useSize;
	}
	public long getCommitSize() {
		return commitSize;
	}
	public void setCommitSize(long commitSize) {
		this.commitSize = commitSize;
	}
	public String getUtilizationRate() {
		return utilizationRate;
	}
	public void setUtilizationRate(String utilizationRate) {
		this.utilizationRate = utilizationRate;
	}
	@Override
	public String toString() {
		return "HeadMemory [initSize=" + initSize + ", maxSize=" + maxSize + ", useSize=" + useSize + ", commitSize="
				+ commitSize + ", utilizationRate=" + utilizationRate + ", MemoryType=" + MemoryType + "]";
	}

}
