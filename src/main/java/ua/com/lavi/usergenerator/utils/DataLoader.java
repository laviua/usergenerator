package ua.com.lavi.usergenerator.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.StreamException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
	
	public List<String> loadData(String fileName){
		XStream xstream = new XStream();	
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/" + fileName),"UTF-8"));
			
		} catch (Exception e1) {
		    e1.printStackTrace();
		}
		if (br != null) {
            StringBuffer buff = new StringBuffer();
            String line;
		try {
			while((line = br.readLine()) != null){
			   buff.append(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			
			xstream.alias("list", ArrayList.class);
			xstream.alias("value", String.class);
			xstream.addImplicitArray(ArrayList.class, "elementData");
			@SuppressWarnings("unchecked")
			List <String> result = (List <String>)xstream.fromXML(buff.toString());
			return result;
		}
		catch (StreamException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
