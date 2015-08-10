import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void isPingPong_forNumberDivisibleByThree_true(){
        PingPong testPingPong = new PingPong();
        assertEquals(true, testPingPong.isPingPong(3));
    }

    //@Test
    //    public void isPingPong_forNumberDivisibleByThree_true(){
    //        PingPong testPingPong = new PingPong();
    //        assertEquals("Ping", testPingPong.list(3).get(2));
    //    }

    @Test
        public void isPingPong_forNumberDivisibleByFive_true(){
            PingPong testPingPong = new PingPong();
            assertEquals(true, testPingPong.isPingPong(5));
        }

    @Test
        public void isPingPong_forNumberDivisibleByThreenFive_true(){
            PingPong testPingPong = new PingPong();
            assertEquals(true, testPingPong.isPingPong(15));
        }

}
