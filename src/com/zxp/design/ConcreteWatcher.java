package com.zxp.design;

public class ConcreteWatcher implements Watcher {
	
	private String name=null;
	
	public ConcreteWatcher(String name){
		this.name=name;
	}

	public void update(String str) {
		System.out.println(name+",Œ“∫‹"+str);
	}

}
