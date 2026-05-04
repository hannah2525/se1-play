package application;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Application_0_always_pass_Tests {

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        System.out.println("\nsetUpBeforeClass() runs once before any @Test method");
    }

    @BeforeEach
    public void setUpBeforeEach() throws Exception {
        System.out.println("setUpBeforeEach() runs before each @Test method");
    }

    @Test
    @Order(1)
    void test_001_always_pass() {
        assertEquals(10, 10);
    }

    @Test
    @Order(2)
    void test_002_always_pass() {
        assertEquals(10, 10);
    }

    @AfterEach
    public void tearDownAfterEach() throws Exception {
        System.out.println("tearDownAfterEach() runs after each @Test method");
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass() runs after all @Test methods have finished");
    }
}