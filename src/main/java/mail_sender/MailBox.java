package mail_sender;

import lombok.Getter;

import java.util.List;
import java.util.ArrayList;

public class MailBox {
    @Getter
    private List<MailInfo> infos = new ArrayList<>();
    private MailSender sender = new MailSender();


    public boolean addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
        return true;
    }

    public boolean sendAll() {
        for (MailInfo info: infos) {
            sender.sendMail(info);
        }
        return true;
    }
}
