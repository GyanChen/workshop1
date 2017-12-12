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
    private String systemNumber;
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Before
    public void setUp() {
        systemNumber = "1234";
    }
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Test
    public void testGuessCorrct() {
        String result = numberPuzzle.validate(systemNumber, "1234");
        
        Assert.assertEquals(result, "4A0B");
    }
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Test
    public void testGuessIncorrect() {
        
    }
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br> <br>
     */ 
    @Test
    public void testGuessPartCorrect() {
        
    }

}
