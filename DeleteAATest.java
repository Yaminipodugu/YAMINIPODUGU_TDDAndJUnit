class DeleteAATest {
DeleteAA d;
//@BeforeEach
void setUp()
{
d=new DeleteAA();
}
//@Test
void test1char() {

assertEquals("BCD",d.delete("ABCD"));

}
private void assertEquals(String string, String delete) {
	// TODO Auto-generated method stub
	
}
//@Test
void test2chars()
{
assertEquals("CD",d.delete("AACD"));


}
//@Test
void testchar() {
assertEquals("BCD",d.delete("BACD"));

}
//@Test
void testzchar() {

assertEquals("BBAA",d.delete("BBAA"));

}
//@Test
void testtchar() {
assertEquals("BAA",d.delete("AABAA"));

}
}