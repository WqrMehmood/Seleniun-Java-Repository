import java.security.PublicKey;

public class PageObjects {

    public static String inventory = "(//div[@class='v-list-item__icon ma-0 justify-center'])[2]";
    public static String category = "//i[@class='v-icon notranslate menu-icon v-icon--left mdi mdi-shape theme--light']";
    public static String addcategory = "//span[@class='v-btn__content'][contains(.,'Add Category')]";
    public static String categorysortorder = "//input[contains(@type,'number')]";
    public static String categoryname = "(//input[contains(@type,'text')])[2]";
    public static String savecategory = "//*[@id=\"app\"]/div[3]/div/form/div/div[3]/button[2]/span";
    public static String closecategory = "//span[@class='v-btn__content'][contains(.,'Close')]";
    public static String categoryeditpencil = "//*[@id=\"app\"]/div/main/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div/button[1]/span/i";
    public static String categoryeditname = "(//input[contains(@type,'text')])[2]";

    //teamsuite xpaths

    public static String HRdepartment = "//i[contains(@class,'v-icon notranslate mdi mdi-human-male-female theme--dark')]";
    public static String expensetype = "(//a[contains(@class,'nowrap body-2')])[43]";
    public static String nameofexpensetype = "(//input[contains(@type,'text')])[2]";
    public static String natureexpensetype = "(//input[contains(@type,'text')])[3]";
    public static String getNatureexpensetypeddl = "(//div[contains(@class,'v-list-item__title')])[9]";
    public static String discription = "//textarea[contains(@rows,'2')]";

    public static String maxamount = "(//input[contains(@type,'number')])[1]";
    public static String advaceamount = "(//input[contains(@type,'number')])[2]";
    public static String ECB = "(//input[contains(@type,'text')])[4]";
    public static String ECBddl = "(//div[contains(@class,'v-list-item__title')])[11]";
    public static String saveexpensetype = "//span[@class='v-btn__content'][contains(.,'Save')]";
    public static String limitcheckbox = "(//div[contains(@class,'ripple')])[1]";
    public static String travelrequest = "//a[contains(.,'Travel Request')]";
    public static String addtravelrequest = "(//span[contains(@class,'v-btn__content')])[3]";
    public static String nameofTR = "(//input[@type='text'])[3]";
    public static String hotelcheck = "(//div[contains(@class,'v-input--selection-controls__ripple')])[1]";
    public static String purposeofTravling = "(//input[contains(@type,'text')])[4]";
    public static String oneway = "//div[contains(@class,'v-input--selection-controls__ripple primary--text')]";
    public static String fromlocation = "(//input[contains(@type,'text')])[5]";
    public static String cityselect = "//div[@class='v-list-item__title'][contains(.,'Lahore')]";
    public static String tolocation = "(//input[contains(@type,'text')])[6]";
    public static String tocityselect = "//div[@class='v-list-item__title'][contains(.,'Karachi')]";
    public static String travelingmedium = "(//input[contains(@type,'text')])[7]";
    public static String TMDDL = "//div[@class='v-list-item__title'][contains(.,'By Air')]";
    public static String datetime = "//input[contains(@placeholder,'Date Time')]";

    public static String selectdate = "(//button[@class='v-btn v-btn--text v-btn--rounded theme--light'])[28]";
    public static String selecttimehour = "(//span[contains(.,'12')])[2]";
    public static String selecttimemin = "(//span[contains(.,'30')])[2]";
    public static String selectAmPm = "(//div[contains(.,'PM')])[16]";
    public static String datetimeokay = "//button[@type='button'][contains(.,'Ok')]";
    public static String TRsave = "//span[@class='v-btn__content'][contains(.,'Save')]";
    public static String GS = "(//div[contains(@class,'v-card__title')])[4]";




    public static String PO = "(//td[contains(@class,'text-start')])[6]";







}




