package entity.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Pagination{

	@JsonProperty("pageSize")
	private int pageSize;

	@JsonProperty("currentPage")
	private int currentPage;

	@JsonProperty("totalCount")
	private int totalCount;

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}

	public void setCurrentPage(int currentPage){
		this.currentPage = currentPage;
	}

	public int getCurrentPage(){
		return currentPage;
	}

	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
	}

	public int getTotalCount(){
		return totalCount;
	}

	@Override
 	public String toString(){
		return 
			"Pagination{" + 
			"pageSize = '" + pageSize + '\'' + 
			",currentPage = '" + currentPage + '\'' + 
			",totalCount = '" + totalCount + '\'' + 
			"}";
		}
}