package com.zxp.design;

public class Test {
	public static void main(String[] args){
		
		Watched girl=new ConcreteWatched();
		
		Watcher watcher1=new ConcreteWatcher("我是小红");
		Watcher watcher2=new ConcreteWatcher("我是小明");
		Watcher watcher3=new ConcreteWatcher("我是小李");
		
		
		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);
		
		girl.notifyWatchers("开心");
		
		
	}

}
