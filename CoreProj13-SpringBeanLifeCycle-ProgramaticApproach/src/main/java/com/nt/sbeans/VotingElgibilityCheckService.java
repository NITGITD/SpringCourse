package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public class VotingElgibilityCheckService implements InitializingBean, DisposableBean {

	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Value("${per.addrs}")
	private String addrs;
	private Date dov;

	/*
	 * public void setName(String name) {
	 * System.out.println("VotingElgibilityCheckService.setName()"); this.name =
	 * name; } public void setAge(int age) {
	 * System.out.println("VotingElgibilityCheckService.setAge()"); this.age = age;
	 * } public void setAddrs(String addrs) {
	 * System.out.println("VotingElgibilityCheckService.setAddrs()"); this.addrs =
	 * addrs; } public void setDov(Date dov) {
	 * System.out.println("VotingElgibilityCheckService.setDov()"); this.dov = dov;
	 * }
	 */

	public String checkVotingElgibility() {
		System.out.println("VotingElgibilityCheckService.checkVotingElgibility()");
		if (age >= 18)
			return "Mr/Miss/Mrs." + name + " u r elible to vote on date::" + dov;
		else
			return "Mr/Miss/Mrs." + name + " u r elible not to vote on date::" + dov;
	}

	/*
	 * public void myInit() { System.out.
	 * println("VotingElgibilityCheckService.myInit()(init life cycle method)"); dov
	 * = new Date(); if (name == null || age <= 0) throw new
	 * IllegalArgumentException("Invalid inputs"); }
	 * 
	 * public void myDestroy() { System.out.
	 * println("VotingElgibilityCheckService.myDestroy()(custom destroy life cycle method)"
	 * ); name = null; addrs = null; age = 0; dov = null; }
	 */

	@Override
	public void destroy() throws Exception {
		System.out.println("VotingElgibilityCheckService.destroy()");
		name = null;
		addrs = null;
		age = 0;
		dov = null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotingElgibilityCheckService.afterPropertiesSet()");
		dov = new Date();
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Invalid inputs");
	}
}
