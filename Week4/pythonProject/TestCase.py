# Generated by Selenium IDE
import pytest
from selenium import webdriver

from Pages.HomePage import HomePage


class TestCase():
    @pytest.fixture()
    def setup_method(self):
        global driver
        driver = webdriver.Chrome()
        driver.implicitly_wait(8)
        driver.maximize_window()

    def test1(self, setup_method):
        home = HomePage(driver)
        home.login("tuyluoglu.ramazan@gmail.com", "Test123.")

    def teardown_method(self):
        driver.quit()
