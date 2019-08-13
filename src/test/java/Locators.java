import org.openqa.selenium.By;

public class Locators {

    //Test Home

    public static final By LINK_HOME_PAGE = By.xpath("//a[@href='https://romanceabroad.com/']");

    //Test Registration
    public static final By registrationButton = By.cssSelector("button#show-registration-block");
    public static final By inputEmail = By.cssSelector("input#email");
    public static final By inputPassword = By.cssSelector("input#password");
    public static final By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By inputUserName = By.xpath("//input[@name='data[nickname]']");
    public static final By inputUserPhone = By.xpath("//input[@name='data[phone]']");
    public static final By dropDownDay = By.xpath(" //div[@id='daySelect']");
    public static final By dropDownMonth = By.xpath(" //div[@id='monthSelect']");
    public static final By dropDownYear = By.xpath(" //div[@id='yearSelect']");
    public static final By checkBoxConfirmation = By.cssSelector("input#confirmation");



    //Test Advertising Link How We work Page

    public static final By LINK_HOW_IT_WORKS = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINK_ADVERTISING = By.xpath("//a[@href='https://romanceabroad.com/content/view/advertising']");

    public static final By LINK_HOW_IT_WORKS_CSS = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINK_ADVERTISING_CSS = By.cssSelector("a[href='https://romanceabroad.com/content/view/advertising']");

    //Test Blog
    public static final By LINK_BLOG_PAGE = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    public static final By LINK_BLOG_PAGE_CSS = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");

   //Test Book Now
    public static final By LinkBookNow =  By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By LinkBookNowCss = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

   //Test Gifts
    public static final By LINK_CATEGORY_SWEETS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    public static final By LINK_CATEGORY_SWEETS_CSS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");


    //Test Photos
    public static final By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index'");
    public static final By LINK_PHOTOS_CSS = By.cssSelector("a[href='https://romanceabroad.com/media/index'");

    //Test Pretty Women
    public static final By LINK_PRETTY_WOMEN = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By LINK_PRETTY_WOMEN_CSS = By.cssSelector("a[href='https://romanceabroad.com/users/search']");

    //Test Pretty Women Gift Page
    public static final By LINK_GIFT = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    public static final By LINK_GIFT_CSS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");



    //Test Tour To Ukraine
    public static final By LINK_TOUR_TO_UKRAINE = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");





}
