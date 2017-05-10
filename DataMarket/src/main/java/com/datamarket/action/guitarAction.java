package com.datamarket.action;

import com.datamarket.entity.Guitar;
import com.datamarket.service.GuitarService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GuitarAction extends BaseAction{
	private Integer id;
	private String serialNumber;
	
	private String builder;
	private String model;
	private String type;
	private String backWood;
	private String topWood;
	
	private Double price;
	
	private JSONObject jsonObject = new JSONObject();
	private JSONArray jsonArray = new JSONArray();
	
	
    public String search(){
    	builder="EAC";
    
    for(Guitar g:guitarService.search(builder)){
		JSONObject jo = new JSONObject();
		jo.put("backWood", g.getBackWood());
		jo.put("builder", g.getBuilder());
		jo.put("model", g.getModel());
		jo.put("price", g.getPrice());
		jo.put("serialNumber", g.getSerialNumber());
		jo.put("topWood", g.getTopWood());
		jo.put("type", g.getType());
	    jsonArray.add(jo);
    	 }
    	return "jsonArray";
    }
    

    
    
    
    
    
    
    



	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getSerialNumber() {
		return serialNumber;
	}




	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}




	public String getBuilder() {
		return builder;
	}




	public void setBuilder(String builder) {
		this.builder = builder;
	}




	



	public String getModel() {
		return model;
	}












	public void setModel(String model) {
		this.model = model;
	}












	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public String getBackWood() {
		return backWood;
	}




	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}




	public String getTopWood() {
		return topWood;
	}




	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}












	public JSONObject getJsonObject() {
		return jsonObject;
	}












	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}












	public JSONArray getJsonArray() {
		return jsonArray;
	}




	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}












	public Double getPrice() {
		return price;
	}












	public void setPrice(Double price) {
		this.price = price;
	}












	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
