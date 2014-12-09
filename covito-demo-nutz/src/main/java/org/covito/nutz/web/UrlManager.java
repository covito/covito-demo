package org.covito.nutz.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.ExtendedBaseRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

public class UrlManager {
	
	private final static Map<String,UrlManager> map=new ConcurrentHashMap<String,UrlManager>();
	
	private final List<Pattern> patternList=new ArrayList<Pattern>();
	
	private static final Logger logger=LoggerFactory.getLogger(UrlManager.class);
	
	public void addUrl(Url url){
		Pattern p=Pattern.compile(url.getPath());
		patternList.add(p);
	}
	
	private UrlManager(){
		
	}
	
	private static UrlManager init(String path) {
		Digester dig = new Digester();
		dig.push(new UrlManager());
		dig.setRules(new ExtendedBaseRules());
		dig.addObjectCreate("filter/url", Url.class);
		dig.addSetProperties("filter/url");
		dig.addSetNext("filter/url", "addUrl");
		try {
			return (UrlManager)dig.parse(UrlManager.class.getResourceAsStream(path));
		} catch (IOException e) {
			logger.error("file [{}] not found.", path);
		} catch (SAXException e) {
			e.printStackTrace();
			logger.error("xml file [{}] has error.", path);
		}
		return new UrlManager();
	}
	
	public static UrlManager  getUrlManager(String name){
		if(map.get(name)==null){
			UrlManager um=UrlManager.init(name);
			map.put(name, um);
		}
		return map.get(name);
	}
	
	public boolean isFilter(String path){
		for(Pattern p : patternList){
			if(p.matcher(path).find()){
				return true;
			}
		}
		return false;
	}
	
	public static class Url{
		
		private String path;
		
		private String desc;

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

	}
}
