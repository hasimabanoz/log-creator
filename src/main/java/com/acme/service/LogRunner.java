package com.acme.service;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogRunner implements Runnable {

	private static final Logger logger = LogManager.getLogger(LogRunner.class);
	private Thread t;
	private String threadName;
	private Random random;

	public LogRunner(String name) {
		threadName = name;
		random = new Random();
		// System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		// System.out.println("Running " + threadName);
		double i = 1;
		for (;;) {
			int rnd = random.nextInt(5);
			switch (rnd) {
			case 0:
				logger.trace("This log is generated from " + threadName + " server: " + i);
				break;
			case 1:
				logger.debug("This log is generated from " + threadName + " server: " + i);
				break;
			case 2:
				logger.info("This log is generated from " + threadName + " server: " + i);
				break;
			case 3:
				logger.error("This log is generated from " + threadName + " server: " + i);
				break;
			case 4:
				logger.fatal("This log is generated from " + threadName + " server: " + i);
				break;

			default:
				break;
			}
			i++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				logger.error(e, e);
			}
		}
	}

	public void start() {
		// System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
