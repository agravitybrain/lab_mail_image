package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    public Client client1 = new Client("Mesut", 34, Gender.MALE);
    public Client client2 = new Client("Angel", 21, Gender.FEMALE);

    @Test
    void getName() {
        assertEquals("Mesut", client1.getName());
        assertEquals("Angel", client2.getName());
    }

    @Test
    void getAge() {
        assertEquals(34, client1.getAge());
        assertEquals(21, client2.getAge());
    }

    @Test
    void getId() {
        assertEquals(client2.getId(), client1.getId() + 1);
    }

    @Test
    void getSex() {
        assertEquals(Gender.MALE, client1.getSex());
        assertEquals(Gender.FEMALE, client2.getSex());
    }
}