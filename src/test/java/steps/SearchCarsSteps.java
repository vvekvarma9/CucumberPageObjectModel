package steps;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();

	@Given("^I am on the home page \"([^\"]*)\" of Carsguide website$")
	public void i_am_on_the_home_page_of_Carsguide_website(String websiteURL) throws Throwable {

		SeleniumDriver.openPage(websiteURL);

	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {

		String menu = list.get(1);
		System.out.println("Menu selected is :" + menu);
		carsGuideHomePageActions.moveToBuySellMenu();

	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {

		carsGuideHomePageActions.clickOnSearchCarsMenu();

	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_carbrand_as_from_any_make_dropdown(String carBrand) throws Throwable {

		carSearchPageActions.selectCarMake(carBrand);

	}

	@And("^select carmodel as \"([^\"]*)\" from AnyModel dropdown$")
	public void select_carmodel_as_from_any_model_dropdown(String carModel) throws Throwable {

		carSearchPageActions.selectCarModel(carModel);
	}

	@And("^select location as \"([^\"]*)\" from AnyLocation dropdown$")
	public void select_location_as_from_any_location_dropdown(String location) throws Throwable {

		carSearchPageActions.selectLocation(location);
	}

	@And("^select price as \"([^\"]*)\" from price dropdown$")
	public void select_price_as_from_price_dropdown(String carPrice) throws Throwable {

		carSearchPageActions.selectCarPrice(carPrice);
	}

	@And("^click on Find_My_Next_Car$")
	public void click_on_find_my_next_car() throws Throwable {

		carSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String string) throws Throwable {

	}

}
