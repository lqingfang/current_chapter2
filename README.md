# v1.0
下面这些不会启动一个线程，因为线程是由start()启动的。
Thread t1 = new Thread();
t1.run();
volatile保证线程的可见性,但并不能给保证其原子性
synchronized保证了原子性


