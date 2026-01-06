//DependencyInjectionTest.java
package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class SeasonFinderTest {

	public static void main(String[] args) {

		// create IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nt/cfgs/applicationContext.xml");

		// get target spring bean class obj ref
		Object obj = ctx.getBean("sf");

		// typecasting
		SeasonFinder finder = (SeasonFinder) obj;

		// invoke the b.method
		String result = finder.findSeason();
		System.out.println(result);

		// close the IOC container
		ctx.close();
	}
}
