import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.menu;

public class Selenium_Assignment1 {

    static void main(String[] args) throws InterruptedException {

        //Launch URl & get Title
        WebDriver driver= new ChromeDriver();
        String page_url= "https://www.saucedemo.com/";
        driver.get(page_url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
         String pageTitle = driver.getTitle();
         System.out.println("Login Page Title is: " +pageTitle);
         Thread.sleep(2000);

         //Entering Username & Password
        String Username = driver.findElement(By.id("login_credentials")).getText();
        String[] User = Username.split("\n");
        String uname = User[1];
        String password = driver.findElement(By.className("login_password")).getText();
        String[] pwd = password.split("\n");
        String login_password = pwd[1];
        driver.findElement(By.id("user-name")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(login_password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);


        driver.findElement(By.id("react-burger-menu-btn")).click();
        //Product Page
        String app_name = driver.findElement(By.className("app_logo")).getText();
        System.out.println("App Name is: " +app_name);

        //Menus
        driver.findElement(By.className("app_logo")).click();
       //driver.findElement(By.id("react-burger-menu-btn")).click();

        //All Items
        String all_items = driver.findElement(By.id("inventory_sidebar_link")).getText();
        System.out.println("First Option is: " +all_items);

        //About
        String about=driver.findElement(By.id("about_sidebar_link")).getText();
        System.out.println("Second option is: "+about);

        //Logout
        String logout=driver.findElement(By.id("logout_sidebar_link")).getText();
        System.out.println("Third option is:" +logout);

        //Reset App state
        String app_state=driver.findElement(By.id("reset_sidebar_link")).getText();
        System.out.println("Fourth Option is :"+ app_state);

        driver.findElement(By.id("logout_sidebar_link")).click();

        //Check the url
        String new_url=driver.getCurrentUrl();
        if(page_url.equals(new_url)){
            System.out.println("Logout Successfully");
        }else {
            System.out.println("Url Mismatch");
        }
        driver.quit();

}
    }
