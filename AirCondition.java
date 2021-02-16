public class AirCondition{

	private boolean isOn;
	private String productName;
	private int temperature = 16;

public void setisOn(){
	if(isOn == false){
		isOn = true;
System.out.println("AC is On");
}

	if(isOn == true){
		isOn = false;
System.out.println("AC is out of Power");
}

}

public void setproductName(String AcName){
	productName = AcName;
}

public String getproductName(){
	return productName;
}

public int getTemperature (){
	return temperature; 
}

public void increaseTemperature (){
	if(temperature >= 16 && temperature <= 30)
		temperature ++;
}

public void decreaseTemperature (){
	if(temperature > 16 && temperature <= 30)
		temperature --; 
}


}