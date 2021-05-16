import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StringFunctionClassTest {

	private StringFunctionClass str;
	private Map<String,String> map;
	
	
	@BeforeTest
	public void setup() {
		str= new StringFunctionClass();
		map = new HashMap<String,String>();
		map.put("blankInput","");
		map.put("nullInput",null);
		map.put("singleCharacterInput","a");
		map.put("diffrentCharacterInput","ab");
		map.put("sameCharacterInput", "aa");
		
		// Other cases like Capital and small letter words can be added to check for the palindrome property
		// Winding up for now
	}
	
	@Test
	public void testCheckIfPalindrome_forBlankInput() {
		assertTrue(str.checkIfPalindrome(map.get("blankInput")));
		System.out.println("Assertion Passed:: testCheckIfPalindrome_forBlankInput");
	}
	
	@Test 
	public void testCheckIfPalindrome_forNullParameter() {
		try{
			assertNull(str.checkIfPalindrome(map.get("nullInput")));
		}
		catch(NullPointerException n) {
			System.out.println("Assertion Passed:: testCheckIfPalindrome_forNullParameter");
		}
	}

	@Test
	public void testCheckIfPalindrome_forSingleCharacter() {
		assertTrue(str.checkIfPalindrome(map.get("singleCharacterInput")));
		System.out.println("Assertion Passed:: testCheckIfPalindrome_forSingleCharacter");
	}
	
	@Test
	public void testCheckIfPalindrome_forDifferentCharacter() {
		assertFalse(str.checkIfPalindrome(map.get("diffrentCharacterInput")));
		System.out.println("Assertion Passed:: testCheckIfPalindrome_forDifferentCharacter");
	}
	
	@Test
	public void testCheckIfPalindrome_forAllSameCharacter() {
		assertTrue(str.checkIfPalindrome(map.get("sameCharacterInput")));
		System.out.println("Assertion Passed:: testCheckIfPalindrome_forAllSameCharacter");
	}
}
