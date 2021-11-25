package mail_sender;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    MailBox mailBox = new MailBox();
    Client client = new Client("Oliver", 15, Gender.MALE);
    MailCode mailCode = MailCode.HAPPY_BIRTHDAY;
    MailInfo mailInfo = new MailInfo(client, mailCode);

    @org.junit.jupiter.api.Test
    void addMailInfo() {
        mailBox.addMailInfo(mailInfo);
        assertNotNull(mailBox.getInfos());
    }
}