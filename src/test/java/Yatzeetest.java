import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Yatzeetest {


  @Test
  public void shouldCalculateForOnes() {
    String ONES ="ONES";
    assertEquals(0, score(ONES, new int[] { 2, 3, 4, 5, 6 }));
    assertEquals(3, score(ONES, new int[] { 2, 1, 4, 1, 1 }));
    assertEquals(5, score(ONES, new int[] { 1, 1, 1, 1, 1 }));
  }

  private int score(String ones, int[] ints) {
     int score=0;
    for (int i = 0; i < ints.length; i++) {
      if (ints[i] == 1){ score += 1;}

    }
    
    
    return score;
  }


}

