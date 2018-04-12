package org.mn.account.api;

public interface AccountService {

    void sendSmsAuthCodeTo(String phone);

    void sendEmailAuthCodeTo(String email);

    void regWithPhoneOrEmail(String phoneOrEmail,String authCode,String pwd);

    void login(String userName,String pwd);

    void loginWithAuthCode(String userName,String authCode);

    void resetPwdWithAuthCode(String userName,String authCOde);

    void changePwd(String oldPwd,String newPwd);

    void freeze(long accountID);

    void unFreeze(long accountID);



}
