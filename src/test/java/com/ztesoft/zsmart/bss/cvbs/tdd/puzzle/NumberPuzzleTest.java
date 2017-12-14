/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
 * <Description> <br> 
 *  
 * @author chen.jian<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年12月12日 <br>
 * @since V9.0C<br>
 * @see com.ztesoft.zsmart.bss.cvbs.tdd.puzzle <br>
 */

public class NumberPuzzleTest {
    
    /**
     * numberPuzzle <br>
     */
    private NumberPuzzle numberPuzzle = new NumberPuzzle();
    
    /**
     * systemNumber <br>
     */
    private PuzzleNumberDto systemNumber;
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Before
    public void setUp() {
        systemNumber = new PuzzleNumberDto("1234");
    }
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Test
    public void testGuessCorrct() {
        String result = numberPuzzle.validate(systemNumber, new PuzzleNumberDto("1234"));
        
        Assert.assertEquals("4A0B", result);
    }
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Test
    public void testGuessCorrct2() {
        String result = numberPuzzle.validate(systemNumber, new PuzzleNumberDto("4321"));
        
        Assert.assertEquals("0A4B", result);
    }
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Test
    public void testGuessIncorrect() {
        String result = numberPuzzle.validate(systemNumber, new PuzzleNumberDto("9876"));
        
        Assert.assertEquals("0A0B", result);
    }
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Test
    public void testGuessPartCorrect() {
        String result = numberPuzzle.validate(systemNumber, new PuzzleNumberDto("3278"));
        
        Assert.assertEquals("1A1B", result);
    }
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Test
    public void testGuessPartCorrect2() {
        String result = numberPuzzle.validate(systemNumber, new PuzzleNumberDto("3415"));
        
        Assert.assertEquals("0A3B", result);
    }

}
