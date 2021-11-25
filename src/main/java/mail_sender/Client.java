package mail_sender;

import lombok.Getter;

@Getter
public class Client {
    private String name;
    private int age;
    private int id;
    private Gender sex;

    public Client(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        id = IdGenerator.generateId();
    }

    public static class IdGenerator{
        private static int lastId = -1;

        public static int generateId(){
            lastId += 1;
            return lastId;
        }
    }
}
