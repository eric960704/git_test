package swim;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class swimmingPoolTest {


  @Test
  void test01() throws Exception {
	  swim s1 = new swim(); 
    assertThrows(Exception.class,()->s1.swimming(5,0,true,false,6),"不能入內");;
  }
  
  @Test
  void test02() throws Exception {
	  swim s1 = new swim(); 
    assertEquals(100, s1.swimming(3, 11, true, true,20));
  }
  
  @Test
  void test03() throws Exception {
	  swim s1 = new swim(); 
    assertThrows(Exception.class,()->s1.swimming(6, 30 ,false,false,24),"不能入內");
  }
  
  @Test
  void test04() throws Exception {
	  swim s1 = new swim(); 
    assertEquals(125,s1.swimming(6, 65 ,false,true,12));
  }
  
  @Test
  void test05() throws Exception {
	  swim s1 = new swim(); 
    assertThrows(Exception.class,()->s1.swimming(1, 99 ,false,true,11),"不能入內");
  }
  

  @Test
  void test06() throws Exception {
	  swim s1 = new swim(); 
    assertEquals(200,s1.swimming(5, 30 ,false,false,12));
  }
  @Test
  void test07() throws Exception {
	  swim s1 = new swim(); 
    assertEquals(140,s1.swimming(5, 30 ,true,false,12));
  }
  
  @Test
  void test08() throws Exception {
	  swim s1 = new swim(); 
    assertEquals(160,s1.swimming(5, 30 ,false,false,6));
  }

  @Test
  void test09() throws Exception {
	  swim s1 = new swim(); 
    assertEquals(160,s1.swimming(5, 65 ,false,false,12));
  }
}
