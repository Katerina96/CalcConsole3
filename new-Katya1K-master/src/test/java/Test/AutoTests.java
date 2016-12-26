package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Steps.Steps;

public class AutoTests {
    private Steps steps;
    private final String USERNAME = "+375297570861  ";
    private final String PASSWORD = "12345Rfnz";
    private final String searchworld = "AMD";




    @BeforeMethod(description = "Init Browser")
    public void setUp(){
        steps=new Steps();
        steps.initBrowser();
    }

    //Вход на сайт
    @Test(description = "Login to 1k.by")
    public void logInSecond() {
        steps.logInSecond(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedIn());
        System.out.println("Login to 1k.by");
    }
    //Выход
    @Test(description = "LogOut to 1k.by")
    public void logOutSecond(){
        steps.logOutSecond(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedOut());
        System.out.println("LogOut to 1k.by");
    }
    //Изменение пароля
    @Test(description = "changePassorwd 1k.by")
    public void changePassorwd(){
        steps.changePassorwd(USERNAME, PASSWORD);
        Assert.assertTrue(steps.ischangePassorwd());
        System.out.println("changePassorwd 1k.by");
    }

    //Поиск
    @Test(description = "Search 1k.by")
    public void SearchSecond(){
        steps.SearchSecond(searchworld);
        Assert.assertTrue(steps.isSearched());
        System.out.println("Search 1k.by");
    }

    //Поиск продукта
    @Test(description = "SearchProduct 1k.by")
    public void SearchProduct(){
        steps.SearchProduct();
        Assert.assertTrue(steps.isSearchProduct());
        System.out.println("SearchProduct 1k.by");
    }
    //Изменение настроек
    @Test(description = "ChangeSettings 1k.by")
    public void ChangeSettings(){
        steps.ChangeSettings();
        Assert.assertTrue(steps.isChangeSettings());
        System.out.println("ChangeSettings 1k.by");
    }
    //Сраснение продуктов
    @Test(description = "Comparison 1k.by")
    public void Comparison(){
        steps.Comparison();
        Assert.assertTrue(steps.isComparison());
        System.out.println("Comparison 1k.by");
    }

    //Добавить в избранные
    @Test(description = "add to Favorite 1k.by")
    public void addFavorite(){
        steps.SearchProduct();
        Assert.assertTrue(steps.isSearchProduct());
        System.out.println("add to Favorite 1k.by");
    }

    //Обратная связь
    @Test(description = "feedback 1k.by")
    public void feedback(){
        steps.SearchProduct();
        Assert.assertTrue(steps.isSearchProduct());
        System.out.println("feedback 1k.by");
    }

    //Отзыв
    @Test(description = "feedback 1k.by")
    public void recall(){
        steps.SearchProduct();
        Assert.assertTrue(steps.isSearchProduct());
        System.out.println("feedback 1k.by");
    }

}
