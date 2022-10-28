package fr.diginamic.props;

import java.util.ResourceBundle;

public class TestConfigurationProps {

	public static void main(String[] args) {
		ResourceBundle data = ResourceBundle.getBundle("data");

		System.out.println(data.getString("title"));
		
		for (String key : data.keySet()) {
			System.out.println(key + " : " + data.getString(key));
		}

	}

}
