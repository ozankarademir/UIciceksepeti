package Constants;

import org.openqa.selenium.By;

public class PageConstants {
    public static By HOME_PAGE_SIGN_IN_BUTTON = By.cssSelector(".header__right-col > .user-menu-container > .user-menu > .user-menu__items  .user-menu__link.user-process-toggle > .icon-user.user-menu__icon.user-menu__icon--account");
    public static By SIGN_IN_BUTTON = By.cssSelector(".header__right-col .users-process-list__item:nth-of-type(1) .users-process-list__btn");
    public static By CLOSE_POP_UP = By.cssSelector(".js-subheader-close .icon-close");
    public static By EMAIL_INPUT = By.cssSelector("input#EmailLogin");
    public static By PASSWORD_INPUT = By.cssSelector("input#Password");
    public static By LOGIN_PAGE_SIGN_IN_BUTTON = By.cssSelector(".btn.btn-lg.btn-primary.js-login-button.login__btn.pull-right");
    public static By WARNING_POP_UP= By.cssSelector(".modal-content");
    public static By WARNING_POP_UP_CLOSE= By.cssSelector(".icon-close-line.modal-icon");
    public static By MY_ACCOUNT= By.cssSelector(".header__right-col > .user-menu-container > .user-menu > .user-menu__items > .user-menu__item.user-menu__item--account > .user-menu__link > .user-menu__title");
    public static By LOGOUT= By.cssSelector(".header__right-col > .user-menu-container > .user-menu > .user-menu__items  a[title='Logout'] > .icon-close.user-menu__log-out-icon");





}
