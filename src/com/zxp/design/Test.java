package com.zxp.design;

public class Test {
	public static void main(String[] args){
		
		Watched girl=new ConcreteWatched();
		
		Watcher watcher1=new ConcreteWatcher("����С��");
		Watcher watcher2=new ConcreteWatcher("����С��");
		Watcher watcher3=new ConcreteWatcher("����С��");
		
		
		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);
		
		girl.notifyWatchers("����");
		
		
	}

}
