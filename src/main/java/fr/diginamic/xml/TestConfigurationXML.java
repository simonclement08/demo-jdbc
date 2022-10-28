package fr.diginamic.xml;

import java.util.Iterator;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestConfigurationXML {

	public static void main(String[] args) {
		Configurations configs = new Configurations();
		try {
			XMLConfiguration config = configs.xml("data.xml");
			System.out.println(config.getString("data.user"));
			
			Iterator<String> iterator = config.getKeys();
			
			while (iterator.hasNext()) {
				String key = iterator.next();
				System.out.println(key + " : " + config.getString(key));
			}
			
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
		

	}

}
