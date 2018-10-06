package entity.order_detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class DeliveryAddress{

	@JsonProperty("districtCity")
	private String districtCity;

	@JsonProperty("address")
	private String address;

	@JsonProperty("phoneNumber")
	private String phoneNumber;

	@JsonProperty("nameSurname")
	private String nameSurname;

	public void setDistrictCity(String districtCity){
		this.districtCity = districtCity;
	}

	public String getDistrictCity(){
		return districtCity;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setNameSurname(String nameSurname){
		this.nameSurname = nameSurname;
	}

	public String getNameSurname(){
		return nameSurname;
	}

	@Override
 	public String toString(){
		return 
			"DeliveryAddress{" + 
			"districtCity = '" + districtCity + '\'' + 
			",address = '" + address + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",nameSurname = '" + nameSurname + '\'' + 
			"}";
		}
}