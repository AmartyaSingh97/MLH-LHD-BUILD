package company;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACbc83a6ae821931cd35ff5d8bda5c0047";
    public static final String AUTH_TOKEN = "7f7633554a3ba1ec0063db487e2be4fc";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+919155511602"),
                        new com.twilio.type.PhoneNumber("+18646572706"),
                        "Hi I love You")
                .create();

        System.out.println(message.getSid());
    }
}