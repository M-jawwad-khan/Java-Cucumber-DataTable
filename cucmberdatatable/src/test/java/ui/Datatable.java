package ui;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Datatable {

	@Given("open browser")
	public void open_browser() {
		System.out.println("Open the Browser");
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password(DataTable credentials) {
		System.out.println("username"+credentials.cell(0,0));
		System.out.println("password"+credentials.cell(0,1));
	}

	@And("enter")
	public void enter() {
		System.out.println("Closed the browser");
	}

}
