package Tests;

import Base.BaseTest;
import Pages.FavoritePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Test;

public class FavoriteTest extends BaseTest {
    FavoritePage favoritePage=new FavoritePage();

    @Test
    @And("I enter <product> and search")
    public void andIEnterProductAndSearch(String product) throws InterruptedException {
        favoritePage.searchProduct(product);
        Thread.sleep(3000);

    }
    @Test
    @And("I add products my favorites")
    public void ─▒AddProductsMyFavorites() {
        favoritePage.addToFavorite();
    }
    @Test
    @And("I go to my favorites page")
    public void ─▒GoToMyFavoritesPage() {
        favoritePage.goToFavorites();
    }
    @Test
    @Then("I see product on  my favorites page")
    public void ─▒SeeProductOnMyFavoritesPage() {
        favoritePage.assertFavorite();
        driver.quit();
    }


}
