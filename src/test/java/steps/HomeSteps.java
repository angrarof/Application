package steps;

import config.DriverFactory;
import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.HomePage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeSteps extends DriverFactory {

    HomePage homePage = new HomePage(driver);

    @Given("^I go to the main page$")
    public void goToHomePage(){
        homePage.goToMain();
    }

    @Given("^I book a flight$")
    public void bookAFlight(){
        int[] a = {8,3,2,1,5,6,7,0,9,8};
        Arrays.sort(a);
        System.out.println("Sorted array "+Arrays.toString(a));

        List<Integer> newArray = new ArrayList();
        for (int i = a.length-1; i>=0; i--){
            newArray.add(a[i]);
        }


        System.out.println("New array "+newArray.toString());

        boolean flag = true;
        for (int i=0; i<newArray.size()-1; i++){
            System.out.println(newArray.get(i)+" > "+newArray.get(i+1));
            if (newArray.get(i) < newArray.get(i+1)){
                flag = false;
                break;
            }
        }

        Assert.assertTrue("Array is not ordered from mayor to minor", flag);
    }

}
